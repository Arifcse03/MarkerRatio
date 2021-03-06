package mnj.mfg.model.entities;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 26 17:41:23 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgRatioplanPlylineImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DivisionId {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getDivisionId();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setDivisionId((String)value);
            }
        }
        ,
        RatioplanId {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getRatioplanId();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setRatioplanId((Number)value);
            }
        }
        ,
        RatioplanNumber {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getRatioplanNumber();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setRatioplanNumber((Number)value);
            }
        }
        ,
        PlylineId {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getPlylineId();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setPlylineId((Number)value);
            }
        }
        ,
        Ply {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getPly();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setPly((Number)value);
            }
        }
        ,
        Totalpcs {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getTotalpcs();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setTotalpcs((Number)value);
            }
        }
        ,
        CuttingRatio {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getCuttingRatio();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setCuttingRatio((String)value);
            }
        }
        ,
        SizeRatio {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getSizeRatio();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setSizeRatio((String)value);
            }
        }
        ,
        TotalRatios {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getTotalRatios();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setTotalRatios((Number)value);
            }
        }
        ,
        Markerread {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getMarkerread();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setMarkerread((String)value);
            }
        }
        ,
        Markerpost {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getMarkerpost();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setMarkerpost((String)value);
            }
        }
        ,
        RpForId {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getRpForId();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setRpForId((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CutNo {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getCutNo();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setCutNo((String)value);
            }
        }
        ,
        CutSrNo {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getCutSrNo();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setCutSrNo((Number)value);
            }
        }
        ,
        ShipPriority {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getShipPriority();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setShipPriority((String)value);
            }
        }
        ,
        Pattern {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getPattern();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setPattern((String)value);
            }
        }
        ,
        InseamPattern {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getInseamPattern();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setInseamPattern((String)value);
            }
        }
        ,
        TotalInseamQty {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getTotalInseamQty();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setTotalInseamQty((Number)value);
            }
        }
        ,
        BlncInseamQty {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getBlncInseamQty();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setBlncInseamQty((Number)value);
            }
        }
        ,
        MnjMfgRatioplanPlycfline {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getMnjMfgRatioplanPlycfline();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MnjMfgRatioplan {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getMnjMfgRatioplan();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setMnjMfgRatioplan((MnjMfgRatioplanImpl)value);
            }
        }
        ,
        MnjMfgRatioplanSizline {
            public Object get(MnjMfgRatioplanPlylineImpl obj) {
                return obj.getMnjMfgRatioplanSizline();
            }

            public void put(MnjMfgRatioplanPlylineImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgRatioplanPlylineImpl object);

        public abstract void put(MnjMfgRatioplanPlylineImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DIVISIONID = AttributesEnum.DivisionId.index();
    public static final int RATIOPLANID = AttributesEnum.RatioplanId.index();
    public static final int RATIOPLANNUMBER = AttributesEnum.RatioplanNumber.index();
    public static final int PLYLINEID = AttributesEnum.PlylineId.index();
    public static final int PLY = AttributesEnum.Ply.index();
    public static final int TOTALPCS = AttributesEnum.Totalpcs.index();
    public static final int CUTTINGRATIO = AttributesEnum.CuttingRatio.index();
    public static final int SIZERATIO = AttributesEnum.SizeRatio.index();
    public static final int TOTALRATIOS = AttributesEnum.TotalRatios.index();
    public static final int MARKERREAD = AttributesEnum.Markerread.index();
    public static final int MARKERPOST = AttributesEnum.Markerpost.index();
    public static final int RPFORID = AttributesEnum.RpForId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CUTNO = AttributesEnum.CutNo.index();
    public static final int CUTSRNO = AttributesEnum.CutSrNo.index();
    public static final int SHIPPRIORITY = AttributesEnum.ShipPriority.index();
    public static final int PATTERN = AttributesEnum.Pattern.index();
    public static final int INSEAMPATTERN = AttributesEnum.InseamPattern.index();
    public static final int TOTALINSEAMQTY = AttributesEnum.TotalInseamQty.index();
    public static final int BLNCINSEAMQTY = AttributesEnum.BlncInseamQty.index();
    public static final int MNJMFGRATIOPLANPLYCFLINE = AttributesEnum.MnjMfgRatioplanPlycfline.index();
    public static final int MNJMFGRATIOPLAN = AttributesEnum.MnjMfgRatioplan.index();
    public static final int MNJMFGRATIOPLANSIZLINE = AttributesEnum.MnjMfgRatioplanSizline.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgRatioplanPlylineImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgRatioplanPlyline");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DivisionId, using the alias name DivisionId.
     * @return the DivisionId
     */
    public String getDivisionId() {
        return (String)getAttributeInternal(DIVISIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivisionId.
     * @param value value to set the DivisionId
     */
    public void setDivisionId(String value) {
        setAttributeInternal(DIVISIONID, value);
    }

    /**
     * Gets the attribute value for RatioplanId, using the alias name RatioplanId.
     * @return the RatioplanId
     */
    public Number getRatioplanId() {
        return (Number)getAttributeInternal(RATIOPLANID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RatioplanId.
     * @param value value to set the RatioplanId
     */
    public void setRatioplanId(Number value) {
        setAttributeInternal(RATIOPLANID, value);
    }

    /**
     * Gets the attribute value for RatioplanNumber, using the alias name RatioplanNumber.
     * @return the RatioplanNumber
     */
    public Number getRatioplanNumber() {
        return (Number)getAttributeInternal(RATIOPLANNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for RatioplanNumber.
     * @param value value to set the RatioplanNumber
     */
    public void setRatioplanNumber(Number value) {
        setAttributeInternal(RATIOPLANNUMBER, value);
    }

    /**
     * Gets the attribute value for PlylineId, using the alias name PlylineId.
     * @return the PlylineId
     */
    public Number getPlylineId() {
        return (Number)getAttributeInternal(PLYLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlylineId.
     * @param value value to set the PlylineId
     */
    public void setPlylineId(Number value) {
        setAttributeInternal(PLYLINEID, value);
    }

    /**
     * Gets the attribute value for Ply, using the alias name Ply.
     * @return the Ply
     */
    public Number getPly() {
        return (Number)getAttributeInternal(PLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ply.
     * @param value value to set the Ply
     */
    public void setPly(Number value) {
        setAttributeInternal(PLY, value);
    }

    /**
     * Gets the attribute value for Totalpcs, using the alias name Totalpcs.
     * @return the Totalpcs
     */
    public Number getTotalpcs() {
        return (Number)getAttributeInternal(TOTALPCS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Totalpcs.
     * @param value value to set the Totalpcs
     */
    public void setTotalpcs(Number value) {
        setAttributeInternal(TOTALPCS, value);
    }

    /**
     * Gets the attribute value for CuttingRatio, using the alias name CuttingRatio.
     * @return the CuttingRatio
     */
    public String getCuttingRatio() {
        return (String)getAttributeInternal(CUTTINGRATIO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CuttingRatio.
     * @param value value to set the CuttingRatio
     */
    public void setCuttingRatio(String value) {
        setAttributeInternal(CUTTINGRATIO, value);
    }

    /**
     * Gets the attribute value for SizeRatio, using the alias name SizeRatio.
     * @return the SizeRatio
     */
    public String getSizeRatio() {
        return (String)getAttributeInternal(SIZERATIO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SizeRatio.
     * @param value value to set the SizeRatio
     */
    public void setSizeRatio(String value) {
        setAttributeInternal(SIZERATIO, value);
    }

    /**
     * Gets the attribute value for TotalRatios, using the alias name TotalRatios.
     * @return the TotalRatios
     */
    public Number getTotalRatios() {
        return (Number)getAttributeInternal(TOTALRATIOS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalRatios.
     * @param value value to set the TotalRatios
     */
    public void setTotalRatios(Number value) {
        setAttributeInternal(TOTALRATIOS, value);
    }

    /**
     * Gets the attribute value for Markerread, using the alias name Markerread.
     * @return the Markerread
     */
    public String getMarkerread() {
        return (String)getAttributeInternal(MARKERREAD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Markerread.
     * @param value value to set the Markerread
     */
    public void setMarkerread(String value) {
        setAttributeInternal(MARKERREAD, value);
    }

    /**
     * Gets the attribute value for Markerpost, using the alias name Markerpost.
     * @return the Markerpost
     */
    public String getMarkerpost() {
        return (String)getAttributeInternal(MARKERPOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Markerpost.
     * @param value value to set the Markerpost
     */
    public void setMarkerpost(String value) {
        setAttributeInternal(MARKERPOST, value);
    }

    /**
     * Gets the attribute value for RpForId, using the alias name RpForId.
     * @return the RpForId
     */
    public String getRpForId() {
        return (String)getAttributeInternal(RPFORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RpForId.
     * @param value value to set the RpForId
     */
    public void setRpForId(String value) {
        setAttributeInternal(RPFORID, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CutNo, using the alias name CutNo.
     * @return the CutNo
     */
    public String getCutNo() {
        return (String)getAttributeInternal(CUTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CutNo.
     * @param value value to set the CutNo
     */
    public void setCutNo(String value) {
        setAttributeInternal(CUTNO, value);
    }

    /**
     * Gets the attribute value for CutSrNo, using the alias name CutSrNo.
     * @return the CutSrNo
     */
    public Number getCutSrNo() {
        return (Number)getAttributeInternal(CUTSRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CutSrNo.
     * @param value value to set the CutSrNo
     */
    public void setCutSrNo(Number value) {
        setAttributeInternal(CUTSRNO, value);
    }

    /**
     * Gets the attribute value for ShipPriority, using the alias name ShipPriority.
     * @return the ShipPriority
     */
    public String getShipPriority() {
        return (String)getAttributeInternal(SHIPPRIORITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipPriority.
     * @param value value to set the ShipPriority
     */
    public void setShipPriority(String value) {
        setAttributeInternal(SHIPPRIORITY, value);
    }

    /**
     * Gets the attribute value for Pattern, using the alias name Pattern.
     * @return the Pattern
     */
    public String getPattern() {
        return (String)getAttributeInternal(PATTERN);
    }

    /**
     * Sets <code>value</code> as the attribute value for Pattern.
     * @param value value to set the Pattern
     */
    public void setPattern(String value) {
        setAttributeInternal(PATTERN, value);
    }

    /**
     * Gets the attribute value for InseamPattern, using the alias name InseamPattern.
     * @return the InseamPattern
     */
    public String getInseamPattern() {
        return (String)getAttributeInternal(INSEAMPATTERN);
    }

    /**
     * Sets <code>value</code> as the attribute value for InseamPattern.
     * @param value value to set the InseamPattern
     */
    public void setInseamPattern(String value) {
        setAttributeInternal(INSEAMPATTERN, value);
    }

    /**
     * Gets the attribute value for TotalInseamQty, using the alias name TotalInseamQty.
     * @return the TotalInseamQty
     */
    public Number getTotalInseamQty() {
        return (Number)getAttributeInternal(TOTALINSEAMQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalInseamQty.
     * @param value value to set the TotalInseamQty
     */
    public void setTotalInseamQty(Number value) {
        setAttributeInternal(TOTALINSEAMQTY, value);
    }

    /**
     * Gets the attribute value for BlncInseamQty, using the alias name BlncInseamQty.
     * @return the BlncInseamQty
     */
    public Number getBlncInseamQty() {
        return (Number)getAttributeInternal(BLNCINSEAMQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BlncInseamQty.
     * @param value value to set the BlncInseamQty
     */
    public void setBlncInseamQty(Number value) {
        setAttributeInternal(BLNCINSEAMQTY, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgRatioplanPlycfline() {
        return (RowIterator)getAttributeInternal(MNJMFGRATIOPLANPLYCFLINE);
    }

    /**
     * @return the associated entity MnjMfgRatioplanImpl.
     */
    public MnjMfgRatioplanImpl getMnjMfgRatioplan() {
        return (MnjMfgRatioplanImpl)getAttributeInternal(MNJMFGRATIOPLAN);
    }

    /**
     * Sets <code>value</code> as the associated entity MnjMfgRatioplanImpl.
     */
    public void setMnjMfgRatioplan(MnjMfgRatioplanImpl value) {
        setAttributeInternal(MNJMFGRATIOPLAN, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgRatioplanSizline() {
        return (RowIterator)getAttributeInternal(MNJMFGRATIOPLANSIZLINE);
    }


    /**
     * @param ratioplanId key constituent
     * @param plylineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number ratioplanId, Number plylineId) {
        return new Key(new Object[]{ratioplanId, plylineId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_RATIOPLAN_PLYLINE_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setPlylineId(sVal);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();   
                String user = (String)sessionScope.get("userId");
                String orgId  =(String)sessionScope.get("orgId");
                String unitName  =(String)sessionScope.get("unitName");
                
                System.out.println("ASSES INS DO DML 1 ------------------>"+user);
                System.out.println("ASSES INS DO DML 2------------------>"+orgId);
                System.out.println("ASSES INS DML 3 ------------------>"+unitName);
                
                if(DML_UPDATE == operation){
                          try {
                              
                              setLastUpdateDate((Date)Date.getCurrentDate()); 
                              setLastUpdatedBy(new oracle.jbo.domain.Number(user));
                          } catch (SQLException f) {
                              System.out.println(f.getMessage());
                          }
                      }
                      else if (DML_INSERT == operation){
                       
                          try {
                              
                              //setHeaderNo(getSrNoString());
                              //setOrgId(new oracle.jbo.domain.Number(orgId));
                              //setAttribute1(unitName);
                              setCreationDate((Date)Date.getCurrentDate());  
                              setCreatedBy(new oracle.jbo.domain.Number(user));
                             
                             
                             
                          } catch (SQLException f) {
                              ;
                          }
                      } 
                
        super.doDML(operation, e);
    }
}
