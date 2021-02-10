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
// ---    Mon Jan 11 12:39:57 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgRatioplanBposAllImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        LineId {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        RatioplanId {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getRatioplanId();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setRatioplanId((Number)value);
            }
        }
        ,
        BpoNo {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getBpoNo();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        SaleOrderId {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getSaleOrderId();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setSaleOrderId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getOrgId();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        MnjMfgRatioplan {
            public Object get(MnjMfgRatioplanBposAllImpl obj) {
                return obj.getMnjMfgRatioplan();
            }

            public void put(MnjMfgRatioplanBposAllImpl obj, Object value) {
                obj.setMnjMfgRatioplan((MnjMfgRatioplanImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgRatioplanBposAllImpl object);

        public abstract void put(MnjMfgRatioplanBposAllImpl object,
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


    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int RATIOPLANID = AttributesEnum.RatioplanId.index();
    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int SALEORDERID = AttributesEnum.SaleOrderId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int MNJMFGRATIOPLAN = AttributesEnum.MnjMfgRatioplan.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgRatioplanBposAllImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgRatioplanBposAll");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
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
     * Gets the attribute value for BpoNo, using the alias name BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String)getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoNo.
     * @param value value to set the BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
    }

    /**
     * Gets the attribute value for SaleOrderId, using the alias name SaleOrderId.
     * @return the SaleOrderId
     */
    public Number getSaleOrderId() {
        return (Number)getAttributeInternal(SALEORDERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SaleOrderId.
     * @param value value to set the SaleOrderId
     */
    public void setSaleOrderId(Number value) {
        setAttributeInternal(SALEORDERID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
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
     * @param lineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number lineId) {
        return new Key(new Object[]{lineId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        //MNJ_MFG_RATIOPLAN_BPOS_ALL
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_RATIOPLAN_BPOS_ALL_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setLineId(sVal);
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
