package mnj.mfg.model.services.client;

import mnj.mfg.model.services.common.AppModule;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 31 17:08:49 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }


    public void setPopulateSizeWhereClause() {
        Object _ret =
            this.riInvokeExportedMethod(this,"setPopulateSizeWhereClause",null,null);
        return;
    }


    public String callCreateRouting(int inventoryID, int rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callCreateRouting",new String [] {"int","int"},new Object[] {new Integer(inventoryID), new Integer(rationPlanID)});
        return (String)_ret;
    }

    public String callBOM(int inventoryID, int rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callBOM",new String [] {"int","int"},new Object[] {new Integer(inventoryID), new Integer(rationPlanID)});
        return (String)_ret;
    }

    public String callItem(int inventoryID, int rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callItem",new String [] {"int","int"},new Object[] {new Integer(inventoryID), new Integer(rationPlanID)});
        return (String)_ret;
    }

    public void setValues() {
        Object _ret = this.riInvokeExportedMethod(this,"setValues",null,null);
        return;
    }

    public String createJob(int rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"createJob",new String [] {"int"},new Object[] {new Integer(rationPlanID)});
        return (String)_ret;
    }

    public String populateSTNs(String saleOrderId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"populateSTNs",new String [] {"java.lang.String"},new Object[] {saleOrderId});
        return (String)_ret;
    }

    public void setSTNWhereClause(String saleOrderId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSTNWhereClause",new String [] {"java.lang.String"},new Object[] {saleOrderId});
        return;
    }

    public void PopulateSize() {
        Object _ret = this.riInvokeExportedMethod(this,"PopulateSize",null,null);
        return;
    }

    public double getPreSizeBlnc(String rationPlanID, String sizeVal,
                                 String sizeId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getPreSizeBlnc",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {rationPlanID, sizeVal, sizeId});
        return ((Double)_ret).doubleValue();
    }

    public void refreshSizeBlnc(String rationPlanID, String sizeVal,
                                String sizeId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"refreshSizeBlnc",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {rationPlanID, sizeVal, sizeId});
        return;
    }

    public void makeBundles() {
        Object _ret = this.riInvokeExportedMethod(this,"makeBundles",null,null);
        return;
    }

    public void createCutNos() {
        Object _ret = this.riInvokeExportedMethod(this,"createCutNos",null,null);
        return;
    }

    public void createCutNosNew() {
        Object _ret =
            this.riInvokeExportedMethod(this,"createCutNosNew",null,null);
        return;
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respAppl) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSessionValues",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {orgId, userId, respId, respAppl});
        return;
    }

    public void setBPOWhereClause() {
        Object _ret =
            this.riInvokeExportedMethod(this,"setBPOWhereClause",null,null);
        return;
    }

    public void popBPO() {
        Object _ret = this.riInvokeExportedMethod(this,"popBPO",null,null);
        return;
    }

    public void copySize() {
        Object _ret = this.riInvokeExportedMethod(this,"copySize",null,null);
        return;
    }

    public void popRollNo() {
        Object _ret = this.riInvokeExportedMethod(this,"popRollNo",null,null);
        return;
    }

    public double getPlanQty(String rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getPlanQty",new String [] {"java.lang.String"},new Object[] {rationPlanID});
        return ((Double)_ret).doubleValue();
    }

    public void setSTNWhereClause() {
        Object _ret =
            this.riInvokeExportedMethod(this,"setSTNWhereClause",null,null);
        return;
    }

    public void popSTN() {
        Object _ret = this.riInvokeExportedMethod(this,"popSTN",null,null);
        return;
    }

    public void selectAllLines(String flag) {
        Object _ret =
            this.riInvokeExportedMethod(this,"selectAllLines",new String [] {"java.lang.String"},new Object[] {flag});
        return;
    }

    public void setPopulateSizeWhereClause(String inseam) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setPopulateSizeWhereClause",new String [] {"java.lang.String"},new Object[] {inseam});
        return;
    }

    public void TotalBalanceQuantity() {
        Object _ret =
            this.riInvokeExportedMethod(this,"TotalBalanceQuantity",null,null);
        return;
    }

    public String UpdateJobQuantity() {
        Object _ret =
            this.riInvokeExportedMethod(this,"UpdateJobQuantity",null,null);
        return (String)_ret;
    }

    public void populateBundlesParts() {
        Object _ret =
            this.riInvokeExportedMethod(this,"populateBundlesParts",null,null);
        return;
    }

    public void RefreshBlocks() {
        Object _ret = this.riInvokeExportedMethod(this,"RefreshBlocks",null,null);
        return;
    }

    public String CalculateResource(String rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"CalculateResource",new String [] {"java.lang.String"},new Object[] {rationPlanID});
        return (String)_ret;
    }

    public String AssignSubInventories(String rationPlanID) {
        Object _ret =
            this.riInvokeExportedMethod(this,"AssignSubInventories",new String [] {"java.lang.String"},new Object[] {rationPlanID});
        return (String)_ret;
    }
}
