package mnj.mfg.view.backing;

import java.sql.Date;
import java.sql.SQLException;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.HashMap;

import java.util.Iterator;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import mnj.mfg.model.services.AppModuleImpl;

import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.binding.BindingContainer;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.binding.OperationBinding;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adf.view.rich.util.ResetUtils;

import oracle.adfinternal.view.faces.context.AdfFacesContextImpl;
import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;

import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.tools.ant.taskdefs.Get;

public class Main {

    private RichInputText ratioplanID;
    private RichInputText inventoryItemID;
    private RichOutputText totalRatio;
    private RichInputText markerLength;
    private RichInputText cf;
    private RichInputText lay;
    private RichInputText totalPcs;
    private RichOutputText totalPcsTotal;
    private RichInputText ratio;
    private RichInputText pcs;
    private RichOutputText layLineWise;
    private RichTable ratioPlanTable;
    private RichInputText saleOrderId;
    private RichInputListOfValues stnNo;
    private RichInputText itemCode;
    private RichInputText itemDescription;
    private RichInputText stnQty;
    private RichTable sizesTable;
    private static HashMap map = new HashMap();
    private RichInputText sizeId;
    private RichInputText sizeBlnc;
    private RichInputText sizeQty;
    ViewObject findViewObject;
    ViewObject layPlanViewObject, MnjMfgRatioplanPlylineView1, PoplateSizeVo1;
    private RichInputComboboxListOfValues styleName;
    private RichInputText markLength1;
    private RichInputText markLength2;
    private RichInputText minEndBit;
    private RichInputText fabricContain;
    private RichInputText layPly;
    private RichTable layPlanTable;
    private RichInputText remLay;
    private RichInputText endBit1;
    private RichInputText endBit2;
    private RichInputText cutQty;
    private RichInputText cutRemQty;
    private RichInputComboboxListOfValues stn;
    private RichInputText buyerId;
    private RichInputComboboxListOfValues bpoNo;
    private RichInputText planQty;
    private RichInputText cutNewPlyNoBind;
    private RichInputText cutNewTotPcsBind;
    private RichTable bpoTable;
    private RichInputText deviation;
    private RichInputText deviationPrcnt;
    private RichInputText orderQty;
    private RichTable stnTable;
    private RichInputText coloId;
    private RichTable bpoPopTable;
    private RichInputComboboxListOfValues inseamValue;
    private RichInputText totalInseamBind;
    private RichInputText blncInseamBind;
    private ViewObject MnjMfgRatioplanPlycflineView1;
    private RichInputText cutPiecPlyBlncBind;
    private RichInputText cutPiecePcsBlncBind;
    private RichInputText fabConInchBind;
    private RichColumn balanceInseamQty;
    private RichInputText headerSeasonBinding;
    private RichTable partsTable;
    private RichTable cutNumberTable;
    private RichInputComboboxListOfValues color;
    private RichInputText colorColor;

    public Main() {
        super();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        findViewObject = am.findViewObject("MnjMfgRatioplanSizlineView1");
        layPlanViewObject = am.findViewObject("MarkerLayPlanVO1");
        MnjMfgRatioplanPlylineView1 =
                am.findViewObject("MnjMfgRatioplanPlylineView1");
        PoplateSizeVo1 = am.findViewObject("PoplateSizeVo1");
        MnjMfgRatioplanPlycflineView1 =am.findViewObject("MnjMfgRatioplanPlycflineView1"); 
        

    }

    public void routingAction(ActionEvent actionEvent) {
        // Add event code here...


        initRouting("0", String.valueOf(getRatioplanID().getValue()));
    }

    public void bomAction(ActionEvent actionEvent) {
        // Add event code here...

        initBOM("0", String.valueOf(getRatioplanID().getValue()));
    }

    public void initRouting(String invID, String ratioID) {
        try {
            OperationBinding operationBinding =
                executeOperation("callCreateRouting");

            operationBinding.getParamsMap().put("inventoryID", invID);
            operationBinding.getParamsMap().put("rationPlanID", ratioID);


            //invoke method
            operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                System.out.println("if errors-->");
                // List errors = operationBinding.getErrors();
            }
            //optional
            Object methodReturnValue = operationBinding.getResult();
            String message = null;
            if (methodReturnValue != null) {
                System.out.println("enter in when error catches initRouting.....");
                message = methodReturnValue.toString();
            } else {
                message = "Failed! .";
            }
            FacesMessage fm = new FacesMessage(message);
            fm.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, fm);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }

    public void initBOM(String invID, String ratioID) {


        OperationBinding operationBinding = executeOperation("callBOM");

        operationBinding.getParamsMap().put("inventoryID", invID);
        operationBinding.getParamsMap().put("rationPlanID", ratioID);


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
    }

    public void initItemCreate(String invID, String ratioID) {

        OperationBinding operationBinding = executeOperation("callItem");


        operationBinding.getParamsMap().put("inventoryID", "0");
        operationBinding.getParamsMap().put("rationPlanID", ratioID);


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);

    }


    public void setRatioplanID(RichInputText ratioplanID) {
        this.ratioplanID = ratioplanID;

        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("ratioPlanIdS", ratioplanID.getValue());
    }

    public RichInputText getRatioplanID() {
        return ratioplanID;
    }

    public void setInventoryItemID(RichInputText inventoryItemID) {
        this.inventoryItemID = inventoryItemID;
    }

    public RichInputText getInventoryItemID() {
        return inventoryItemID;
    }

    public void saleOrderAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println("Get Bpo value " + valueChangeEvent.getNewValue());


        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("bpoNoS", valueChangeEvent.getNewValue());
    }

    public void itemCreation(ActionEvent actionEvent) {
        // Add event code here...
        initItemCreate("0", String.valueOf(getRatioplanID().getValue()));
    }

    public void setTotalRatio(RichOutputText totalRatio) {
        this.totalRatio = totalRatio;
    }

    public RichOutputText getTotalRatio() {
        return totalRatio;
    }

    public void setMarkerLength(RichInputText markerLength) {
        this.markerLength = markerLength;
    }

    public RichInputText getMarkerLength() {
        return markerLength;
    }

    public void setCf(RichInputText cf) {
        this.cf = cf;
    }

    public RichInputText getCf() {
        return cf;
    }

    public void markerLengthAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here..
        double totalRatio = getNumericValue(getTotalRatio().getValue());
        double markerLen = getNumericValue(getMarkerLength().getValue());
        if (totalRatio != 0 && markerLen != 0) {

            cf.setValue(new oracle.jbo.domain.Number(Math.round(markerLen /
                                                                totalRatio)));

        } else
            cf.setValue(new oracle.jbo.domain.Number(0));
        AdfFacesContext.getCurrentInstance().addPartialTarget(cf);

        //        double layVal = getNumericValue(getLayLineWise().getValue());
        //        totalPcs.setValue(new oracle.jbo.domain.Number(Math.round(totalRatio *
        //                                                                  layVal)));
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(totalPcs);
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(totalPcsTotal);
        //
        //        double ratioVal = getNumericValue(getRatio().getValue());
        //        pcs.setValue(new oracle.jbo.domain.Number(Math.round(layVal *
        //                                                             ratioVal)));
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(pcs);
    }


    public double getNumericValue(Object val) {

        if (val != null) {
            return Double.parseDouble(String.valueOf(val));
        } else
            return 0;

    }


    public String ocInfoCall() {
        // write code here
        StringBuilder strb =
            new StringBuilder("AdfPage.PAGE.findComponent(\"p1\").show();"); // write popup id (e.g pt1:p1) where pt1 is page template id
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            org.apache.myfaces.trinidad.util.Service.getRenderKitService(fctx,
                                                                         ExtendedRenderKitService.class);
        erks.addScript(fctx, strb.toString());
        return null;
    }

    public void testActionOC(ActionEvent actionEvent) {
        // Add event code here...

    }

    public void setLay(RichInputText lay) {
        this.lay = lay;
    }

    public RichInputText getLay() {
        return lay;
    }

    public void setTotalPcs(RichInputText totalPcs) {
        this.totalPcs = totalPcs;
    }

    public RichInputText getTotalPcs() {
        return totalPcs;
    }

    public void setTotalPcsTotal(RichOutputText totalPcsTotal) {
        this.totalPcsTotal = totalPcsTotal;
    }

    public RichOutputText getTotalPcsTotal() {
        return totalPcsTotal;
    }

    public void setRatio(RichInputText ratio) {
        this.ratio = ratio;
    }

    public RichInputText getRatio() {
        return ratio;
    }

    public void setPcs(RichInputText pcs) {
        this.pcs = pcs;
    }

    public RichInputText getPcs() {
        return pcs;
    }

    public void setLayLineWise(RichOutputText layLineWise) {
        this.layLineWise = layLineWise;
    }

    public RichOutputText getLayLineWise() {
        return layLineWise;
    }

    public void setRatioPlanTable(RichTable ratioPlanTable) {
        this.ratioPlanTable = ratioPlanTable;
    }

    public RichTable getRatioPlanTable() {
        return ratioPlanTable;
    }

    public String getSetValueRatioTable(String type, String name, double val) {

        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        String value = null;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            try {
                if (type.equals("GET"))
                    value = selectedRow.getAttribute(name).toString();
                else {
                    selectedRow.setAttribute(name, val);
                }

            } catch (Exception e) {
                ;
            }

        }
        return value;
    }


    public double getBalQtyFromTable() {

        oracle.adf.view.rich.component.UIXTable table = getSizesTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double blncQTY = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            try {
                blncQTY = Double.parseDouble(selectedRow.getAttribute("BalQty").toString());

            } catch (Exception e) {
                ;
            }

        }
        return blncQTY;
    }
    
    public double getLayFromTable() {

        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();


            try {
                ply =
    Double.parseDouble(selectedRow.getAttribute("Ply").toString());
            } catch (Exception e) {
                ;
            }

        }
        return ply;
    }

    public void layAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        // double ply =  Double.parseDouble(valueChangeEvent.getNewValue().toString());
        double totalRatio = getNumericValue(getTotalRatio().getValue());
        double layVal = getNumericValue(getLay().getValue());
        totalPcs.setValue(new oracle.jbo.domain.Number(Math.round(totalRatio *
                                                                  layVal)));
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalPcs);
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalPcsTotal);

    }

    public void ratioAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...


        double ratioVal = MyMath.numeric(getRatio());
        double layVal = getLayFromTable();
        double piecesVal = layVal * ratioVal; 
        double sizeQtyVal = MyMath.numeric3(getSizeFromView("VAL"));
        double planQTY = getBalQtyFromTable();
        
        double blnceQTY = planQTY-piecesVal;


    ////    double balanceVal = sizeQtyVal - (getPreCutBalance() + piecesVal);
        
  ////      getPreCutBalance();
 
        pcs.setValue(new oracle.jbo.domain.Number(Math.round(piecesVal)));
        AdfFacesContext.getCurrentInstance().addPartialTarget(pcs);
        AdfFacesContext.getCurrentInstance().addPartialTarget(totalPcsTotal);
        sizeBlnc.setValue(new oracle.jbo.domain.Number(Math.round(blnceQTY)));
        AdfFacesContext.getCurrentInstance().addPartialTarget(sizeBlnc);


        double ratioOldValue = 0.00;
        double ratioNewValue = 0.00;

        try {
            ratioOldValue =
                    Double.parseDouble(valueChangeEvent.getOldValue().toString());
        } catch (Exception e) {
            ;
        }

        try {
            ratioNewValue =
                    Double.parseDouble(valueChangeEvent.getNewValue().toString());
        } catch (Exception e) {
            ;
        }


        if (ratioOldValue < ratioNewValue) {

            double val =
                (ratioOldValue - ratioNewValue) - getNumericValue(getTotalRatio().getValue());
            setLayToTable(Math.abs(val), "SET");
        } else {

            double val =
                (ratioNewValue - ratioOldValue) + getNumericValue(getTotalRatio().getValue());
            setLayToTable(Math.abs(val), "SET");
        }


    }

    public double setLayToTable(double totalratio, String type) {

        oracle.adf.view.rich.component.UIXTable table = getRatioPlanTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        double ply = 0.0;
        double totalPcs = 0.0;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();

            if (type.equalsIgnoreCase("SET")) {
                double layVal = getLayFromTable();
                selectedRow.setAttribute("Totalpcs",
                                         (Math.round(totalratio * layVal)));
                AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
            } else if (type.equalsIgnoreCase("GET")) {

                totalPcs =
                        MyMath.numeric3(selectedRow.getAttribute("Totalpcs"));

            }


        }
        return totalPcs;

    }

    public void createJob(ActionEvent actionEvent) {
        initCreateJob(String.valueOf(getRatioplanID().getValue()));
    }

    public void initCreateJob(String ratioID) {


        OperationBinding operationBinding = executeOperation("createJob");

        operationBinding.getParamsMap().put("rationPlanID", ratioID);


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
    }


    public void editPopupFetchListener(PopupFetchEvent popupFetchEvent) {

        OperationBinding operationBinding =
            executeOperation("setSTNWhereClause");
        operationBinding.getParamsMap().put("saleOrderId", null);
        operationBinding.execute();

        //        if (popupFetchEvent.getLaunchSourceClientId().contains("cbInsert")) {
        //            System.out.println("Insert event called......!");
        //            BindingContainer bindings = getBindings();
        //            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        //            operationBinding.execute();
        //        }
    }

    public void editDialogListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {

            OperationBinding operationBinding =
                executeOperation("populateSTNs");
            operationBinding.getParamsMap().put("saleOrderId", null);
            operationBinding.execute();
            //            stnNo.setValue("Testing STNs");
            AdfFacesContext.getCurrentInstance().addPartialTarget(stnNo);
            AdfFacesContext.getCurrentInstance().addPartialTarget(itemCode);
            AdfFacesContext.getCurrentInstance().addPartialTarget(itemDescription);
            AdfFacesContext.getCurrentInstance().addPartialTarget(stnQty);
            AdfFacesContext.getCurrentInstance().addPartialTarget(inventoryItemID);

        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings = getBindings();
            //            OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
            //            operationBinding.execute();
        }
    }

    public void editPopupCancelListener(PopupCanceledEvent popupCanceledEvent) {


    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setSaleOrderId(RichInputText saleOrderId) {
        this.saleOrderId = saleOrderId;
        //        FacesContext fctx = FacesContext.getCurrentInstance();
        //        ExternalContext ectx = fctx.getExternalContext();
        //        HttpSession userSession = (HttpSession)ectx.getSession(false);
        //        userSession.setAttribute("saleOrderIdS", saleOrderId.getValue());
        //        System.out.println("Sale order Id --->"+saleOrderId.getValue());
    }

    public RichInputText getSaleOrderId() {
        return saleOrderId;
    }

    public void setStnNo(RichInputListOfValues stnNo) {
        this.stnNo = stnNo;
    }

    public RichInputListOfValues getStnNo() {
        return stnNo;
    }

    public void setItemCode(RichInputText itemCode) {
        this.itemCode = itemCode;
    }

    public RichInputText getItemCode() {
        return itemCode;
    }

    public void setItemDescription(RichInputText itemDescription) {
        this.itemDescription = itemDescription;
    }

    public RichInputText getItemDescription() {
        return itemDescription;
    }

    public void setStnQty(RichInputText stnQty) {
        this.stnQty = stnQty;
    }

    public RichInputText getStnQty() {
        return stnQty;
    }

    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Generic Method to execute operation
     * */
    public OperationBinding executeOperation(String operation) {
        OperationBinding createParam =
            getBindingsCont().getOperationBinding(operation);


        return createParam;

    }

    public void setInseamBlnc() {

        double totalInseam = getTotalInseamFromPopup();
        double InseWiseSizeTotal = getInseamWiseSizeQtyTotal();

        System.out.println("Inseam total --->" + totalInseam);
        System.out.println("Size Selected total --->" + InseWiseSizeTotal);

        getSetValueRatioTable("SET", "TotalInseamQty", totalInseam);
     //   getSetValueRatioTable("SET", "BlncInseamQty",
     //                         (totalInseam - InseWiseSizeTotal)); //BlncInseamQty

     ////   getSetValueRatioTable("SET", "BlncInseamQty",
     ////                                               (InseWiseSizeTotal)); //BlncInseamQty

        AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(totalInseamBind);
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(blncInseamBind);


    }


    public void editDialogListenerSizes(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {


            OperationBinding operationBinding =
                executeOperation("PopulateSize");
            operationBinding.execute();
            setInseamBlnc();
            AdfFacesContext.getCurrentInstance().addPartialTarget(sizesTable);


        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings = getBindings();

        }
    }

    public void editPopupFetchLisSizes(PopupFetchEvent popupFetchEvent) {

        //        System.out.println("Inseam value ----->"+getSetValueRatioTable("GET", "InseamPattern", 0.0));
        //        System.out.println("Inseam Value from binding ------>"+getInseamValue().getValue());
        callSizePopWhereClause();

    }

    public void callSizePopWhereClause() {

        String inseamVal = null;
        try {
            inseamVal = getSetValueRatioTable("GET", "InseamPattern", 0.0);
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        OperationBinding operationBinding =
            executeOperation("setPopulateSizeWhereClause");
        operationBinding.getParamsMap().put("inseam", inseamVal);
        operationBinding.execute(); //setPopulateSizeWhereClause

    }

    public double getInseamWiseSizeQtyTotal() {


        RowSetIterator it = findViewObject.createRowSetIterator("tt");
        double total = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            total = total + MyMath.numeric3(r.getAttribute("SizeQty"));
        }
        it.closeRowSetIterator();
        return total;
    }

    public double getTotalInseamFromPopup() {

        RowSetIterator it = PoplateSizeVo1.createRowSetIterator("tt");
        double total = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            total = total + MyMath.numeric3(r.getAttribute("SizeQty"));
        }
        it.closeRowSetIterator();
        return total;

    }


    public void setSizesTable(RichTable sizesTable) {
        this.sizesTable = sizesTable;
    }

    public RichTable getSizesTable() {
        return sizesTable;
    }

    public void editPopupFetchLisShip(PopupFetchEvent popupFetchEvent) {

        OperationBinding operationBinding =
            executeOperation("setPopulateSizeWhereClause");
        operationBinding.execute(); //setPopulateSizeWhereClause
    }

    public void editDialogListenerShip(DialogEvent dialogEvent) {

    }

    public //// double 
    void getPreCutBalance() {
        

    //    OperationBinding operationBinding = executeOperation("getPreSizeBlnc");
        OperationBinding operationBinding = executeOperation("refreshSizeBlnc");

        operationBinding.getParamsMap().put("rationPlanID",
                                            getRatioplanID().getValue());
        operationBinding.getParamsMap().put("sizeVal",
                                            getSizeFromView("name"));
        operationBinding.getParamsMap().put("sizeId", getSizeFromView("id"));

        operationBinding.execute(); 

        AdfFacesContext.getCurrentInstance().addPartialTarget(sizesTable);
        
        //setPopulateSizeWhereClause
      ////  Object methodReturnValue = operationBinding.getResult();

     ////   double value =MyMath.numeric3(methodReturnValue);
     ////   return value;


    }

    public String createRatioLine() {


        OperationBinding operationBinding = executeOperation("CreateInsert");
        operationBinding.execute(); //setPopulateSizeWhereClause
        OperationBinding operationBinding1 = executeOperation("Commit");
        operationBinding1.execute();


        return null;
    }

    public void setSizeId(RichInputText sizeId) {
        this.sizeId = sizeId;
    }

    public RichInputText getSizeId() {
        return sizeId;
    }

    public void setSizeBlnc(RichInputText sizeBlnc) {
        this.sizeBlnc = sizeBlnc;
    }

    public RichInputText getSizeBlnc() {
        return sizeBlnc;
    }

    public void setSizeQty(RichInputText sizeQty) {
        this.sizeQty = sizeQty;
    }

    public RichInputText getSizeQty() {
        return sizeQty;
    }

    public Object getSizeFromView(String type) {


        Object size = null, sizeQty = null, sizePk = null;
        try {
            size = findViewObject.getCurrentRow().getAttribute("SizeId");
        } catch (Exception e) {
            ;
        }

        try {
            sizeQty = findViewObject.getCurrentRow().getAttribute("PlanQty");
        } catch (Exception e) {
            ;
        }

        try {
            sizePk = findViewObject.getCurrentRow().getAttribute("SizlineId");
        } catch (Exception e) {
            ;
        }

        if (type.equalsIgnoreCase("NAME")) {
            return size;
        } else if (type.equalsIgnoreCase("ID")) {
            return sizePk;
        } else
            return sizeQty;

    }


    public String refreshBalance() {
        // Add event code here...
        
        OperationBinding operationBinding1 = executeOperation("Commit");
        operationBinding1.execute();
        
        
        
        OperationBinding operationBinding =
            executeOperation("refreshSizeBlnc");
        operationBinding.getParamsMap().put("rationPlanID",
                                            getRatioplanID().getValue());
        operationBinding.getParamsMap().put("sizeVal",
                                            getSizeFromView("name"));
        operationBinding.getParamsMap().put("sizeId", getSizeFromView("id"));
        
       getTotalBalanceQuantity();
    
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(sizesTable);
        AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);
        

        
        
     //   AdfFacesContext.getCurrentInstance().addPartialTarget(ratioPlanTable);

        return null;
    }

    public void setStyleName(RichInputComboboxListOfValues styleName) {
        this.styleName = styleName;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("style", styleName.getValue());
    }

    public RichInputComboboxListOfValues getStyleName() {
        return styleName;
    }

    /**********************************************
     * Lay Plan Tab Action
     * Parvez A Tunio
     * ****************************************************************************/
    public void layPlanListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        refreshLayPlanCalc();

    }


    public void refreshLayPlanCalc() {

        double markerlen1Val = MyMath.numeric(getMarkLength1());
        double markerlen1Va2 = MyMath.numeric(getMarkLength2());
        double layLengthVal = 0.0;
        double minEndBitVal = MyMath.numeric(getMinEndBit());
        double fabricConValYrd = MyMath.numeric(getFabricContain());
        double fabricConValInch = MyMath.numeric(getFabConInchBind());
        double layPlyVal = 0.00;
     //   double layLines = getLayFromTable();
        double layLines = getCutPieceTotPlyNew(); //Change 090616 Sabih
        //        System.out.println("Fabric contain value -->"+fabricConVal);



        layLengthVal = (markerlen1Val* 36) + markerlen1Va2 ;
        double y =  (fabricConValYrd * 36 ) +fabricConValInch ;
        double z  = y - (minEndBitVal * 36 );
        
         

         layPlyVal = (fabricConValYrd - minEndBitVal);
        if (layLengthVal != 0) {
            layPlyVal = z / layLengthVal;
        }

        layPly.setValue(MyMath.toNumber(MyMath.roundDown(layPlyVal)));
        AdfFacesContext.getCurrentInstance().addPartialTarget(layPly);

        double layPlyTotal = getLayPlySum(MyMath.roundDown(layPlyVal));
        double layPlyRemVal = layLines - layPlyTotal;
        
        // By Sabih Chnge on 280716
        
    //    remLay.setValue(MyMath.toNumber(layPlyRemVal));
    //    AdfFacesContext.getCurrentInstance().addPartialTarget(remLay);

        setElcTbleTotVal(layPlyRemVal);
        AdfFacesContext.getCurrentInstance().addPartialTarget(layPlanTable);
        
        // End By Sabih Chnge on 280716

        //        System.out.println("Lay length value===========>"+layLengthVal);
        //        System.out.println("lay/ply value===========>"+MyMath.roundDown(layPlyVal));

        //        System.out.println("lay length Minus lay/ply ============>"+layLengthVal *MyMath.roundDown(layPlyVal));
        double x = layLengthVal ; 
        double  w = x * MyMath.roundDown(layPlyVal);    
        double endBitTotal = y - w ;
        System.out.println("X value "+x);
        System.out.println(layPlyVal+"<----W value --->"+w);
        System.out.println("End bit value --->"+endBitTotal);
        
//        double endBitTotal =
//            fabricConValYrd - (layLengthVal * MyMath.roundDown(layPlyVal));
        //        System.out.println("End bit total value uis ========>"+endBitTotal);

     //   double endBitVal2 = (endBitTotal % 1); //Fraction value
     //   double endBitVal1 = endBitTotal - endBitVal2; // integre value
        
        double tempInch = (long)(endBitTotal/36);            
    //    double endBitVal1 = endBitTotal +tempInch;
        double endBitVal1 = tempInch;
        double endBitVal2 = ( (endBitTotal/36) - tempInch ) * 36 ;
        
        System.out.println("tempInch --->"+tempInch);
        System.out.println("endBitVal2 --->"+endBitVal2);
        System.out.println("endBitVal1 --->"+endBitVal1);
        System.out.println("endBitTotal --->"+endBitTotal);
        
        
   //     y - (layLengthVal * layPlyVal)

        endBit1.setValue(MyMath.toNumber(endBitVal1));
        AdfFacesContext.getCurrentInstance().addPartialTarget(endBit1);
    //    endBit2.setValue(MyMath.toNumber(endBitVal2 * 12));
        endBit2.setValue(MyMath.toNumber(endBitVal2));
        AdfFacesContext.getCurrentInstance().addPartialTarget(endBit2);

        double cutQtyVal =
            MyMath.numeric2(getTotalRatio()) * MyMath.roundDown(layPlyVal);

        cutQty.setValue(MyMath.toNumber(cutQtyVal));
        AdfFacesContext.getCurrentInstance().addPartialTarget(cutQty);

        double cutTotalQty = setLayToTable(0, "GET");
        //double cutRemQtyVal = cutTotalQty - getCutQtySum(cutQtyVal);
        double cutRemQtyVal = getTotalPiecesNew() - getCutQtySum(cutQtyVal);
        cutRemQty.setValue(MyMath.toNumber(cutRemQtyVal));
        AdfFacesContext.getCurrentInstance().addPartialTarget(cutRemQty);

    } 
          
          // By Sabih
          
          public void setElcTbleTotVal(double val) {

               oracle.adf.view.rich.component.UIXTable table = getLayPlanTable();
            //    Get the Selected Row key set iterator
               java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
               double ply = 0.0;
               while (selectionIt.hasNext()) {
                   Object rowKey = selectionIt.next();
                   table.setRowKey(rowKey);
            //       int index = table.getRowIndex();
           //        FacesCtrlHierNodeBinding row =
           //       (FacesCtrlHierNodeBinding)table.getRowData(index);
          //         Row selectedRow = row.getRow();
           //        selectedRow.setAttribute("LayRemQty",val);
          //         System.out.println("Sabih COde Remainig Lay  --->"+val);
                 
                   BindingContext bindingContext = BindingContext.getCurrent();
                   DCDataControl dc =bindingContext.findDataControl("AppModuleDataControl"); //
                   ApplicationModule am = dc.getApplicationModule();
                   ViewObject findViewObject =am.findViewObject("MarkerLayPlanVO1");//MarkerLayPlanVO1
                   RowSetIterator it = findViewObject.createRowSetIterator("tt");
                   while (it.hasNext()){

                           Row r = it.next();
                           try {
                               //    val = Double.parseDouble(r.getAttribute("TotalValue").toString());
                               r.setAttribute("LayRemQty", val);
                               System.out.println("Sabih COde Remainig Lay  --->"+val);
                           }catch (Exception e ){;}
                   } //end of while loop
                   it.closeRowSetIterator();
                  

               }
               
           }


    

    public void setMarkLength1(RichInputText markLength1) {
        this.markLength1 = markLength1;
    }

    public RichInputText getMarkLength1() {
        return markLength1;
    }

    public void setMarkLength2(RichInputText markLength2) {
        this.markLength2 = markLength2;
    }

    public RichInputText getMarkLength2() {
        return markLength2;
    }

    public void setMinEndBit(RichInputText minEndBit) {
        this.minEndBit = minEndBit;
    }

    public RichInputText getMinEndBit() {
        return minEndBit;
    }

    public void setFabricContain(RichInputText fabricContain) {
        this.fabricContain = fabricContain;
    }

    public RichInputText getFabricContain() {
        return fabricContain;
    }

    public void setLayPly(RichInputText layPly) {
        this.layPly = layPly;
    }

    public RichInputText getLayPly() {
        return layPly;
    }


    public void setLayPlanTable(RichTable layPlanTable) {
        this.layPlanTable = layPlanTable;
    }

    public RichTable getLayPlanTable() {
        return layPlanTable;
    }

    public double getLayPlySum(double currentLay) {

        RowSetIterator it = layPlanViewObject.createRowSetIterator("tt");
        Row currentRow = layPlanViewObject.getCurrentRow();
        double total = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            if (currentLay > -1 && r == currentRow) {
                total = total + currentLay;
                continue;
            }
            total = total + MyMath.numeric3(r.getAttribute("Lay"));
        }
        it.closeRowSetIterator();
        return total;
    }

    public void setRemLay(RichInputText remLay) {
        this.remLay = remLay;
    }

    public RichInputText getRemLay() {
        return remLay;
    }

    public void rollNoAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        getFabConFormView(valueChangeEvent.getNewValue());
        refreshLayPlanCalc();


    }


    public double getFabConFormView(Object ob) {

        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContext.findDataControl("AppModuleDataControl"); //
        ApplicationModule am = dc.getApplicationModule();
        ViewObject rollVo = am.findViewObject("RollNo1");
        rollVo.setWhereClause(null);
        rollVo.setWhereClause("ROLL_NO ='" + ob + "'");
        rollVo.executeQuery();
        rollVo.first();
        double val =
            MyMath.numeric3(rollVo.getCurrentRow().getAttribute("RollLength"));
        fabricContain.setValue(MyMath.toNumber(val));

        return val;

    }

    public void setEndBit1(RichInputText endBit1) {
        this.endBit1 = endBit1;
    }

    public RichInputText getEndBit1() {
        return endBit1;
    }

    public void setEndBit2(RichInputText endBit2) {
        this.endBit2 = endBit2;
    }

    public RichInputText getEndBit2() {
        return endBit2;
    }

    public void setCutQty(RichInputText cutQty) {
        this.cutQty = cutQty;
    }

    public RichInputText getCutQty() {
        return cutQty;
    }

    public void setCutRemQty(RichInputText cutRemQty) {
        this.cutRemQty = cutRemQty;
    }

    public RichInputText getCutRemQty() {
        return cutRemQty;
    }


    public double getCutQtySum(double currentVal) {


        RowSetIterator it = layPlanViewObject.createRowSetIterator("tt");
        Row currentRow = layPlanViewObject.getCurrentRow();
        double total = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            if (r == currentRow) {
                total = total + currentVal;
                continue;
            }
            total = total + MyMath.numeric3(r.getAttribute("CutQty"));
        }
        it.closeRowSetIterator();
        return total;
    }

    public void setStn(RichInputComboboxListOfValues stn) {
        this.stn = stn;
    }

    public RichInputComboboxListOfValues getStn() {
        return stn;
    }

    public void setBuyerId(RichInputText buyerId) {
        this.buyerId = buyerId;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("buyerIdS", buyerId.getValue());
    }

    public RichInputText getBuyerId() {
        return buyerId;
    }


    public void setPlanQty(RichInputText planQty) {
        this.planQty = planQty;
    }

    public RichInputText getPlanQty() {
        return planQty;
    }

    public void newCutNoTabAction(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        double grandPcsTotal =setLayToTable(0.0, "GET"); // Get total pcs from above block
        double grandLayTotal = getLayFromTable();   // Get total lay from above block 
        
        double totalRatioVal = MyMath.numeric2(getTotalRatio());
        double noOfPly = MyMath.numeric(getCutNewPlyNoBind());
        double totalPcsVal = totalRatioVal * noOfPly;
        
        
        double cutPieceTotPly = getCutPieceTotPly(MyMath.numeric3(valueChangeEvent.getNewValue()));
        double cutPieceTotPiece = getCutPieceTotPcs(totalPcsVal);
        
        System.out.println("Grand pcs total---->"+grandPcsTotal);
        System.out.println("Grand Lay Total---->"+grandLayTotal);
        
        System.out.println("cutPieceTotPly------>"+cutPieceTotPly);
        System.out.println("cutPieceTotPiece---->"+cutPieceTotPiece);
        
        if((grandLayTotal < cutPieceTotPly)){
            
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage(cutPieceTotPly+" value can't exceeds to Total lay "+grandLayTotal);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
                context.addMessage(valueChangeEvent.getComponent().getClientId(context), message);
            
            // Reset inputFile component after upload
            ResetUtils.reset(valueChangeEvent.getComponent());    
        }
        else if((grandPcsTotal<cutPieceTotPiece) ){
            
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage(cutPieceTotPiece+" value can't exceeds to total pieces "+grandPcsTotal);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
                context.addMessage(valueChangeEvent.getComponent().getClientId(context), message);
            
            // Reset inputFile component after upload
            ResetUtils.reset(valueChangeEvent.getComponent());    
        }
        else {
            
            
            cutNewTotPcsBind.setValue(MyMath.toNumber(totalPcsVal));
            cutPiecPlyBlncBind.setValue(MyMath.toNumber(grandLayTotal - cutPieceTotPly ));
            cutPiecePcsBlncBind.setValue(MyMath.toNumber(grandPcsTotal - cutPieceTotPiece ));    
        }    
    
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(cutNewTotPcsBind);
        AdfFacesContext.getCurrentInstance().addPartialTarget(cutPiecPlyBlncBind);
        AdfFacesContext.getCurrentInstance().addPartialTarget(cutPiecePcsBlncBind);
        
        
    }
    
    public double getCutPieceTotPly(double currentVal){
        

        RowSetIterator it = MnjMfgRatioplanPlycflineView1.createRowSetIterator("tt");
        Row currentRow = MnjMfgRatioplanPlycflineView1.getCurrentRow();
        double total = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            if (currentVal > -1 && r == currentRow) {
                total = total + currentVal;
                continue;
            }
            total = total + MyMath.numeric3(r.getAttribute("NoOfPly"));
        }
        it.closeRowSetIterator();
        return total;
    }
    public double getCutPieceTotPcs(double currentVal){
        

        RowSetIterator it = MnjMfgRatioplanPlycflineView1.createRowSetIterator("tt");
        Row currentRow = MnjMfgRatioplanPlycflineView1.getCurrentRow();
        double total = 0.0;
        while (it.hasNext()) {
            Row r = it.next();
            if (currentVal > -1 && r == currentRow) {
                total = total + currentVal;
                continue;
            }
            total = total + MyMath.numeric3(r.getAttribute("TotalPcs"));
        }
        it.closeRowSetIterator();
        return total;
    }

    public void setCutNewPlyNoBind(RichInputText cutNewPlyNoBind) {
        this.cutNewPlyNoBind = cutNewPlyNoBind;
    }

    public RichInputText getCutNewPlyNoBind() {
        return cutNewPlyNoBind;
    }

    public void setCutNewTotPcsBind(RichInputText cutNewTotPcsBind) {
        this.cutNewTotPcsBind = cutNewTotPcsBind;
    }

    public RichInputText getCutNewTotPcsBind() {
        return cutNewTotPcsBind;
    }

    public void editDialogLisBPO(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            OperationBinding operationBinding = executeOperation("popBPO");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(bpoTable);


        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings = getBindings();

        }
    }

    public void editPopupFetchLisBPO(PopupFetchEvent popupFetchEvent) {

        OperationBinding operationBinding =
            executeOperation("setBPOWhereClause");
        operationBinding.execute(); //setPopulateSizeWhereClause
    }

    public void editPopupFetchLisSTN(PopupFetchEvent popupFetchEvent) {

        OperationBinding operationBinding =
            executeOperation("setSTNWhereClause");
        operationBinding.execute(); //setPopulateSizeWhereClause
    }

    public void editDialogLisSTNNew(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            OperationBinding operationBinding = executeOperation("popSTN");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(stnTable);


        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings = getBindings();

        }
    }

    public void setBpoTable(RichTable bpoTable) {
        this.bpoTable = bpoTable;
    }

    public RichTable getBpoTable() {
        return bpoTable;
    }


    public String copySizeBind() {
        // Add event code here...
        //copySize
        OperationBinding operationBinding = executeOperation("copySize");
        operationBinding.execute(); //setPopulateSizeWhereClause

        return null;
    }

    /*************************
     * Fill Roll No Vo
     * *******************************/


    public void editDialogLisRoll(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
            OperationBinding operationBinding = executeOperation("popRollNo");
            operationBinding.execute();
            AdfFacesContext.getCurrentInstance().addPartialTarget(layPlanTable);


        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            BindingContainer bindings = getBindings();

        }
    }

    public void editPopupFetchLisRoll(PopupFetchEvent popupFetchEvent) {
        //
        //        OperationBinding operationBinding =
        //            executeOperation("setBPOWhereClause");
        //        operationBinding.execute(); //setPopulateSizeWhereClause
    }


    public String saveAll() {
        System.out.print("i am in save");
        //        double orderQty = MyMath.numeric(getOrderQty());
        //        double planQty = getPlanQtyFunc();
        //        double deviationVal = orderQty - planQty;
        //        double deviationPrcntVal = (deviationVal / orderQty)*100 ;

        //        deviation.setValue(MyMath.toNumber(deviationVal));
        //        deviationPrcnt.setValue(MyMath.toNumber(deviationPrcntVal));
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(deviation);
        //        AdfFacesContext.getCurrentInstance().addPartialTarget(deviationPrcnt);
        
//        ViewObject vo=appM.getMnjMfgRatioplanView1();
//             appM.getDBTransaction().commit();
//        vo.executeQuery();
//        
        OperationBinding operationBinding1 = executeOperation("getPlanQty");
        operationBinding1.getParamsMap().put("rationPlanID", getRatioplanID().getValue());

        operationBinding1.execute(); //setPopulateSizeWhereClause
//        ViewObject vo=appM.getMnjMfgRatioplanView1();
//       appM.getDBTransaction().commit();
//       
//        vo.clearCache();

        return null;
    }


    public void setDeviation(RichInputText deviation) {
        this.deviation = deviation;
    }

    public RichInputText getDeviation() {
        return deviation;
    }

    public void setDeviationPrcnt(RichInputText deviationPrcnt) {
        this.deviationPrcnt = deviationPrcnt;
    }

    public RichInputText getDeviationPrcnt() {
        return deviationPrcnt;
    }

    public void setOrderQty(RichInputText orderQty) {
        this.orderQty = orderQty;
    }

    public RichInputText getOrderQty() {
        return orderQty;
    }

    public void setStnTable(RichTable stnTable) {
        this.stnTable = stnTable;
    }

    public RichTable getStnTable() {
        return stnTable;
    }
    AppModuleImpl appM = getAppModuleImpl();

        public AppModuleImpl getAppModuleImpl() {
            DCBindingContainer bindingContainer =
                (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            //BindingContext bindingContext = BindingContext.getCurrent();
            DCDataControl dc =
                bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
            AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
            return appM;
        }
    public void setColoId(RichInputText coloId) {
        this.coloId = coloId;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("colorId", coloId.getValue());
    }

    public RichInputText getColoId() {
        return coloId;
    }

    public void SelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("flag", "Y");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(bpoPopTable);
    }


    public void DeSelectAll(ActionEvent actionEvent) {
        // Add event code here...
        OperationBinding operationBinding = executeOperation("selectAllLines");
        operationBinding.getParamsMap().put("flag", "N");
        operationBinding.execute();
        AdfFacesContext.getCurrentInstance().addPartialTarget(bpoPopTable);
    }

    public void setBpoPopTable(RichTable bpoPopTable) {
        this.bpoPopTable = bpoPopTable;
    }

    public RichTable getBpoPopTable() {
        return bpoPopTable;
    }

    public void setInseamValue(RichInputComboboxListOfValues inseamValue) {
        this.inseamValue = inseamValue;
    }

    public RichInputComboboxListOfValues getInseamValue() {
        return inseamValue;
    }

    public void setTotalInseamBind(RichInputText totalInseamBind) {
        this.totalInseamBind = totalInseamBind;
    }

    public RichInputText getTotalInseamBind() {
        return totalInseamBind;
    }

    public void setBlncInseamBind(RichInputText blncInseamBind) {
        this.blncInseamBind = blncInseamBind;
    }

    public RichInputText getBlncInseamBind() {
        return blncInseamBind;
    }

    public String deleteSize() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        callSizePopWhereClause();

        setInseamBlnc();

        return null;
    }

    public void setCutPiecPlyBlncBind(RichInputText cutPiecPlyBlncBind) {
        this.cutPiecPlyBlncBind = cutPiecPlyBlncBind;
    }

    public RichInputText getCutPiecPlyBlncBind() {
        return cutPiecPlyBlncBind;
    }

    public void setCutPiecePcsBlncBind(RichInputText cutPiecePcsBlncBind) {
        this.cutPiecePcsBlncBind = cutPiecePcsBlncBind;
    }

    public RichInputText getCutPiecePcsBlncBind() {
        return cutPiecePcsBlncBind;
    }

    public void setFabConInchBind(RichInputText fabConInchBind) {
        this.fabConInchBind = fabConInchBind;
    }

    public RichInputText getFabConInchBind() {
        return fabConInchBind;
    }
    
    ///TOTAL BALANCE QUANTITY -- SABIH -- 18-05-2016 
    
    public void getTotalBalanceQuantity() {

System.out.println("In getTotalBalanceQuantity ....");
        OperationBinding operationBinding = executeOperation("TotalBalanceQuantity");
        operationBinding.execute();
        
                                      }


    public void setBalanceInseamQty(RichColumn balanceInseamQty) {
        this.balanceInseamQty = balanceInseamQty;
    }

    public RichColumn getBalanceInseamQty() {
        return balanceInseamQty;
    }

    public void setHeaderSeasonBinding(RichInputText headerSeasonBinding) {
        this.headerSeasonBinding = headerSeasonBinding;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("Season", headerSeasonBinding.getValue());
    }

    public RichInputText getHeaderSeasonBinding() {
        return headerSeasonBinding;
    }

    public void UpdateStnQuantity(ActionEvent actionEvent) {
        // Add event code here...
        
        OperationBinding operationBinding = executeOperation("UpdateJobQuantity");
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed to Update Quantity .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);

        
        
    }

    public void setPartsTable(RichTable partsTable) {
        this.partsTable = partsTable;
    }

    public RichTable getPartsTable() {
        return partsTable;
    }
    
  //  ---- Bean Query -----

        public void editPopupFetchListenerParts(PopupFetchEvent popupFetchEvent) {
            // Add event code here...setPopUpWhereClause
;
        }


        public void editDialogListenerParts(DialogEvent dialogEvent) {
            // Add event code here...
            if (dialogEvent.getOutcome().name().equals("ok")) {
                OperationBinding operationBinding = 
                    executeOperation("populateBundlesParts");                
                operationBinding.execute();
                AdfFacesContext.getCurrentInstance().addPartialTarget(partsTable); // Bind of Table where you are populating data
            }
            
        }



    //  ---- End Bean Query ----

    public void refreshBalanceNew(ActionEvent actionEvent) {
        // Add event code here...
        refreshBalance();
        refreshBalance();
        
        OperationBinding operationBinding =
            executeOperation("RefreshBlocks");
        operationBinding.execute();
        
        
    }
    
    public double getCutPieceTotPlyNew(){
        

        RowSetIterator it = MnjMfgRatioplanPlycflineView1.createRowSetIterator("tt");
        Row currentRow = MnjMfgRatioplanPlycflineView1.getCurrentRow();
        double total = 0.0;
        while (it.hasNext()) 
        {
            Row r = it.next();
            total = MyMath.numeric3(r.getAttribute("NoOfPly"));
        }
        it.closeRowSetIterator();
        return total;
    }
    
    
    public double getTotalPiecesNew(){
        

        RowSetIterator it = MnjMfgRatioplanPlycflineView1.createRowSetIterator("tt");
        Row currentRow = MnjMfgRatioplanPlycflineView1.getCurrentRow();
        double total = 0.0;
        while (it.hasNext()) 
        {
            Row r = it.next();
            total = MyMath.numeric3(r.getAttribute("TotalPcs"));
        }
        it.closeRowSetIterator();
        return total;
    }


    public void setCutNumberTable(RichTable cutNumberTable) {
        this.cutNumberTable = cutNumberTable;
    }

    public RichTable getCutNumberTable() {
        return cutNumberTable;
    }

    public void CalculateResources(ActionEvent actionEvent) {
        initUpdateResource(String.valueOf(getRatioplanID().getValue()));
        }

        public void initUpdateResource(String ratioID) {


        OperationBinding operationBinding = executeOperation("CalculateResource");

        operationBinding.getParamsMap().put("rationPlanID", ratioID);


        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        }

    public void AssignSubInventory(ActionEvent actionEvent) {
        initAssignSubInventory(String.valueOf(getRatioplanID().getValue()));
    }
    
    public void initAssignSubInventory(String ratioID) {


    OperationBinding operationBinding = executeOperation("AssignSubInventories");

    operationBinding.getParamsMap().put("rationPlanID", ratioID);


    //invoke method
    operationBinding.execute();
    if (!operationBinding.getErrors().isEmpty()) {
        System.out.println("if errors-->");
        // List errors = operationBinding.getErrors();
    }
    //optional
    Object methodReturnValue = operationBinding.getResult();
    String message = null;
    if (methodReturnValue != null) {
        message = methodReturnValue.toString();
    } else {
        message = "Failed! .";
    }
    FacesMessage fm = new FacesMessage(message);
    fm.setSeverity(FacesMessage.SEVERITY_INFO);
    FacesContext context = FacesContext.getCurrentInstance();
    context.addMessage(null, fm);
    }

    public void setColor(RichInputComboboxListOfValues color) {
        this.color = color;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("color", color.getValue());
    }

    public RichInputComboboxListOfValues getColor() {
        return color;
    }

    public void deletebpo(ActionEvent actionEvent) {
        // Add event code here...
        System.out.println("In delete method");
    }

    public void setColorColor(RichInputText colorColor) {
        this.colorColor = colorColor;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession)ectx.getSession(false);
        userSession.setAttribute("color",colorColor.getValue());
    }

    public RichInputText getColorColor() {
        return colorColor;
    }


    public void systemIdValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
       // ViewObject vo=appM.getMnjMfgRatioplanView1();
             //  appM.getDBTransaction().commit();
                //vo.clearCache();
                //vo.executeQuery();
        
        
    }
}//end of class
