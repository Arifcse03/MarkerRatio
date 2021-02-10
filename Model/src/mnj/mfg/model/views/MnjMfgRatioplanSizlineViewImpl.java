package mnj.mfg.model.views;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 15 12:56:25 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgRatioplanSizlineViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgRatioplanSizlineViewImpl() {
    }

    /**
     * custom method , we have overrided the method isertRow to insert row
     * in the last of table
     * **/
    @Override
    public void insertRow(Row row) {

        Row lastRow = this.last();
        if (lastRow != null) {
            //insert new row at the end and make it current
            int indx = this.getRangeIndexOf(lastRow) + 1;
            this.insertRowAtRangeIndex(indx, row);
            this.setCurrentRow(row);
        } else { // empty Rowset
            super.insertRow(row);
        }
    }
}
