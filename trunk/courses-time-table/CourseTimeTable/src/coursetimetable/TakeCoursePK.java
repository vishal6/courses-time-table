/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Nody
 */
@Embeddable
public class TakeCoursePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "std_ID")
    private int stdID;
    @Basic(optional = false)
    @Column(name = "crs_ID")
    private int crsID;

    public TakeCoursePK() {
    }

    public TakeCoursePK(int stdID, int crsID) {
        this.stdID = stdID;
        this.crsID = crsID;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public int getCrsID() {
        return crsID;
    }

    public void setCrsID(int crsID) {
        this.crsID = crsID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) stdID;
        hash += (int) crsID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TakeCoursePK)) {
            return false;
        }
        TakeCoursePK other = (TakeCoursePK) object;
        if (this.stdID != other.stdID) {
            return false;
        }
        if (this.crsID != other.crsID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "coursetimetable.TakeCoursePK[ stdID=" + stdID + ", crsID=" + crsID + " ]";
    }
    
}
