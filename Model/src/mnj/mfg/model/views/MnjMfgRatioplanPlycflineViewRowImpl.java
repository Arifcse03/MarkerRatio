package mnj.mfg.model.views;

import mnj.mfg.model.entities.MnjMfgRatioplanPlycflineImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 15 13:13:10 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgRatioplanPlycflineViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DivisionId {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getDivisionId();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setDivisionId((String)value);
            }
        }
        ,
        RatioplanId {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getRatioplanId();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setRatioplanId((Number)value);
            }
        }
        ,
        RatioplanNumber {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getRatioplanNumber();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setRatioplanNumber((Number)value);
            }
        }
        ,
        PlylineId {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getPlylineId();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setPlylineId((Number)value);
            }
        }
        ,
        PlycflineId {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getPlycflineId();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setPlycflineId((Number)value);
            }
        }
        ,
        Fabricwidth {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getFabricwidth();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setFabricwidth((String)value);
            }
        }
        ,
        FabricPattern {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getFabricPattern();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setFabricPattern((String)value);
            }
        }
        ,
        Markerlength {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getMarkerlength();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setMarkerlength((Number)value);
            }
        }
        ,
        Cf {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getCf();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setCf((Number)value);
            }
        }
        ,
        ExtraMtr {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getExtraMtr();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setExtraMtr((Number)value);
            }
        }
        ,
        CuttingRatio {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getCuttingRatio();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setCuttingRatio((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        Shrinkage {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getShrinkage();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setShrinkage((Number)value);
            }
        }
        ,
        CutNo {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getCutNo();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setCutNo((String)value);
            }
        }
        ,
        NoOfPly {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getNoOfPly();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setNoOfPly((Number)value);
            }
        }
        ,
        TotalPcs {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getTotalPcs();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setTotalPcs((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getRemarks();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        SrCutNo {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getSrCutNo();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setSrCutNo((Number)value);
            }
        }
        ,
        BlncPly {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getBlncPly();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setBlncPly((Number)value);
            }
        }
        ,
        BlncPcs {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getBlncPcs();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setBlncPcs((Number)value);
            }
        }
        ,
        ProductionType {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getProductionType();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setProductionType((String)value);
            }
        }
        ,
        MarkerLayPlanVO {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getMarkerLayPlanVO();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        BundleDetailVO {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getBundleDetailVO();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Production_Type_LOV1 {
            public Object get(MnjMfgRatioplanPlycflineViewRowImpl obj) {
                return obj.getProduction_Type_LOV1();
            }

            public void put(MnjMfgRatioplanPlycflineViewRowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgRatioplanPlycflineViewRowImpl object);

        public abstract void put(MnjMfgRatioplanPlycflineViewRowImpl object,
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
    public static final int PLYCFLINEID = AttributesEnum.PlycflineId.index();
    public static final int FABRICWIDTH = AttributesEnum.Fabricwidth.index();
    public static final int FABRICPATTERN = AttributesEnum.FabricPattern.index();
    public static final int MARKERLENGTH = AttributesEnum.Markerlength.index();
    public static final int CF = AttributesEnum.Cf.index();
    public static final int EXTRAMTR = AttributesEnum.ExtraMtr.index();
    public static final int CUTTINGRATIO = AttributesEnum.CuttingRatio.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int SHRINKAGE = AttributesEnum.Shrinkage.index();
    public static final int CUTNO = AttributesEnum.CutNo.index();
    public static final int NOOFPLY = AttributesEnum.NoOfPly.index();
    public static final int TOTALPCS = AttributesEnum.TotalPcs.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int SRCUTNO = AttributesEnum.SrCutNo.index();
    public static final int BLNCPLY = AttributesEnum.BlncPly.index();
    public static final int BLNCPCS = AttributesEnum.BlncPcs.index();
    public static final int PRODUCTIONTYPE = AttributesEnum.ProductionType.index();
    public static final int MARKERLAYPLANVO = AttributesEnum.MarkerLayPlanVO.index();
    public static final int BUNDLEDETAILVO = AttributesEnum.BundleDetailVO.index();
    public static final int PRODUCTION_TYPE_LOV1 = AttributesEnum.Production_Type_LOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgRatioplanPlycflineViewRowImpl() {
    }

    /**
     * Gets MnjMfgRatioplanPlycfline entity object.
     * @return the MnjMfgRatioplanPlycfline
     */
    public MnjMfgRatioplanPlycflineImpl getMnjMfgRatioplanPlycfline() {
        return (MnjMfgRatioplanPlycflineImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for DIVISION_ID using the alias name DivisionId.
     * @return the DIVISION_ID
     */
    public String getDivisionId() {
        return (String) getAttributeInternal(DIVISIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for DIVISION_ID using the alias name DivisionId.
     * @param value value to set the DIVISION_ID
     */
    public void setDivisionId(String value) {
        setAttributeInternal(DIVISIONID, value);
    }

    /**
     * Gets the attribute value for RATIOPLAN_ID using the alias name RatioplanId.
     * @return the RATIOPLAN_ID
     */
    public Number getRatioplanId() {
        return (Number) getAttributeInternal(RATIOPLANID);
    }

    /**
     * Sets <code>value</code> as attribute value for RATIOPLAN_ID using the alias name RatioplanId.
     * @param value value to set the RATIOPLAN_ID
     */
    public void setRatioplanId(Number value) {
        setAttributeInternal(RATIOPLANID, value);
    }

    /**
     * Gets the attribute value for RATIOPLAN_NUMBER using the alias name RatioplanNumber.
     * @return the RATIOPLAN_NUMBER
     */
    public Number getRatioplanNumber() {
        return (Number) getAttributeInternal(RATIOPLANNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for RATIOPLAN_NUMBER using the alias name RatioplanNumber.
     * @param value value to set the RATIOPLAN_NUMBER
     */
    public void setRatioplanNumber(Number value) {
        setAttributeInternal(RATIOPLANNUMBER, value);
    }

    /**
     * Gets the attribute value for PLYLINE_ID using the alias name PlylineId.
     * @return the PLYLINE_ID
     */
    public Number getPlylineId() {
        return (Number) getAttributeInternal(PLYLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PLYLINE_ID using the alias name PlylineId.
     * @param value value to set the PLYLINE_ID
     */
    public void setPlylineId(Number value) {
        setAttributeInternal(PLYLINEID, value);
    }

    /**
     * Gets the attribute value for PLYCFLINE_ID using the alias name PlycflineId.
     * @return the PLYCFLINE_ID
     */
    public Number getPlycflineId() {
        return (Number) getAttributeInternal(PLYCFLINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for PLYCFLINE_ID using the alias name PlycflineId.
     * @param value value to set the PLYCFLINE_ID
     */
    public void setPlycflineId(Number value) {
        setAttributeInternal(PLYCFLINEID, value);
    }

    /**
     * Gets the attribute value for FABRICWIDTH using the alias name Fabricwidth.
     * @return the FABRICWIDTH
     */
    public String getFabricwidth() {
        return (String) getAttributeInternal(FABRICWIDTH);
    }

    /**
     * Sets <code>value</code> as attribute value for FABRICWIDTH using the alias name Fabricwidth.
     * @param value value to set the FABRICWIDTH
     */
    public void setFabricwidth(String value) {
        setAttributeInternal(FABRICWIDTH, value);
    }

    /**
     * Gets the attribute value for FABRIC_PATTERN using the alias name FabricPattern.
     * @return the FABRIC_PATTERN
     */
    public String getFabricPattern() {
        return (String) getAttributeInternal(FABRICPATTERN);
    }

    /**
     * Sets <code>value</code> as attribute value for FABRIC_PATTERN using the alias name FabricPattern.
     * @param value value to set the FABRIC_PATTERN
     */
    public void setFabricPattern(String value) {
        setAttributeInternal(FABRICPATTERN, value);
    }

    /**
     * Gets the attribute value for MARKERLENGTH using the alias name Markerlength.
     * @return the MARKERLENGTH
     */
    public Number getMarkerlength() {
        return (Number) getAttributeInternal(MARKERLENGTH);
    }

    /**
     * Sets <code>value</code> as attribute value for MARKERLENGTH using the alias name Markerlength.
     * @param value value to set the MARKERLENGTH
     */
    public void setMarkerlength(Number value) {
        setAttributeInternal(MARKERLENGTH, value);
    }

    /**
     * Gets the attribute value for CF using the alias name Cf.
     * @return the CF
     */
    public Number getCf() {
        return (Number) getAttributeInternal(CF);
    }

    /**
     * Sets <code>value</code> as attribute value for CF using the alias name Cf.
     * @param value value to set the CF
     */
    public void setCf(Number value) {
        setAttributeInternal(CF, value);
    }

    /**
     * Gets the attribute value for EXTRA_MTR using the alias name ExtraMtr.
     * @return the EXTRA_MTR
     */
    public Number getExtraMtr() {
        return (Number) getAttributeInternal(EXTRAMTR);
    }

    /**
     * Sets <code>value</code> as attribute value for EXTRA_MTR using the alias name ExtraMtr.
     * @param value value to set the EXTRA_MTR
     */
    public void setExtraMtr(Number value) {
        setAttributeInternal(EXTRAMTR, value);
    }

    /**
     * Gets the attribute value for CUTTING_RATIO using the alias name CuttingRatio.
     * @return the CUTTING_RATIO
     */
    public Number getCuttingRatio() {
        return (Number) getAttributeInternal(CUTTINGRATIO);
    }

    /**
     * Sets <code>value</code> as attribute value for CUTTING_RATIO using the alias name CuttingRatio.
     * @param value value to set the CUTTING_RATIO
     */
    public void setCuttingRatio(Number value) {
        setAttributeInternal(CUTTINGRATIO, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for SHRINKAGE using the alias name Shrinkage.
     * @return the SHRINKAGE
     */
    public Number getShrinkage() {
        return (Number) getAttributeInternal(SHRINKAGE);
    }

    /**
     * Sets <code>value</code> as attribute value for SHRINKAGE using the alias name Shrinkage.
     * @param value value to set the SHRINKAGE
     */
    public void setShrinkage(Number value) {
        setAttributeInternal(SHRINKAGE, value);
    }

    /**
     * Gets the attribute value for CUT_NO using the alias name CutNo.
     * @return the CUT_NO
     */
    public String getCutNo() {
        return (String) getAttributeInternal(CUTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CUT_NO using the alias name CutNo.
     * @param value value to set the CUT_NO
     */
    public void setCutNo(String value) {
        setAttributeInternal(CUTNO, value);
    }

    /**
     * Gets the attribute value for NO_OF_PLY using the alias name NoOfPly.
     * @return the NO_OF_PLY
     */
    public Number getNoOfPly() {
        return (Number) getAttributeInternal(NOOFPLY);
    }

    /**
     * Sets <code>value</code> as attribute value for NO_OF_PLY using the alias name NoOfPly.
     * @param value value to set the NO_OF_PLY
     */
    public void setNoOfPly(Number value) {
        setAttributeInternal(NOOFPLY, value);
    }

    /**
     * Gets the attribute value for TOTAL_PCS using the alias name TotalPcs.
     * @return the TOTAL_PCS
     */
    public Number getTotalPcs() {
        return (Number) getAttributeInternal(TOTALPCS);
    }

    /**
     * Sets <code>value</code> as attribute value for TOTAL_PCS using the alias name TotalPcs.
     * @param value value to set the TOTAL_PCS
     */
    public void setTotalPcs(Number value) {
        setAttributeInternal(TOTALPCS, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for SR_CUT_NO using the alias name SrCutNo.
     * @return the SR_CUT_NO
     */
    public Number getSrCutNo() {
        return (Number) getAttributeInternal(SRCUTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SR_CUT_NO using the alias name SrCutNo.
     * @param value value to set the SR_CUT_NO
     */
    public void setSrCutNo(Number value) {
        setAttributeInternal(SRCUTNO, value);
    }

    /**
     * Gets the attribute value for BLNC_PLY using the alias name BlncPly.
     * @return the BLNC_PLY
     */
    public Number getBlncPly() {
        return (Number) getAttributeInternal(BLNCPLY);
    }

    /**
     * Sets <code>value</code> as attribute value for BLNC_PLY using the alias name BlncPly.
     * @param value value to set the BLNC_PLY
     */
    public void setBlncPly(Number value) {
        setAttributeInternal(BLNCPLY, value);
    }

    /**
     * Gets the attribute value for BLNC_PCS using the alias name BlncPcs.
     * @return the BLNC_PCS
     */
    public Number getBlncPcs() {
        return (Number) getAttributeInternal(BLNCPCS);
    }

    /**
     * Sets <code>value</code> as attribute value for BLNC_PCS using the alias name BlncPcs.
     * @param value value to set the BLNC_PCS
     */
    public void setBlncPcs(Number value) {
        setAttributeInternal(BLNCPCS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductionType.
     * @return the ProductionType
     */
    public String getProductionType() {
        return (String) getAttributeInternal(PRODUCTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductionType.
     * @param value value to set the  ProductionType
     */
    public void setProductionType(String value) {
        setAttributeInternal(PRODUCTIONTYPE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link MarkerLayPlanVO.
     */
    public RowIterator getMarkerLayPlanVO() {
        return (RowIterator)getAttributeInternal(MARKERLAYPLANVO);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link BundleDetailVO.
     */
    public RowIterator getBundleDetailVO() {
        return (RowIterator)getAttributeInternal(BUNDLEDETAILVO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> Production_Type_LOV1.
     */
    public RowSet getProduction_Type_LOV1() {
        return (RowSet)getAttributeInternal(PRODUCTION_TYPE_LOV1);
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
}
