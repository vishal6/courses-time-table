/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Nody
 */
@Entity
@Table(name = "take_course", catalog = "course_timetable", schema = "")
@NamedQueries({
    @NamedQuery(name = "TakeCourse.findAll", query = "SELECT t FROM TakeCourse t"),
    @NamedQuery(name = "TakeCourse.findByStdID", query = "SELECT t FROM TakeCourse t WHERE t.takeCoursePK.stdID = :stdID"),
    @NamedQuery(name = "TakeCourse.findByCrsID", query = "SELECT t FROM TakeCourse t WHERE t.takeCoursePK.crsID = :crsID")})
public class TakeCourse implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TakeCoursePK takeCoursePK;

    public TakeCourse() {
    }

    public TakeCourse(TakeCoursePK takeCoursePK) {
        this.takeCoursePK = takeCoursePK;
    }

    public TakeCourse(int stdID, int crsID) {
        this.takeCoursePK = new TakeCoursePK(stdID, crsID);
    }

    public TakeCoursePK getTakeCoursePK() {
        return takeCoursePK;
    }

    public void setTakeCoursePK(TakeCoursePK takeCoursePK) {
        this.takeCoursePK = takeCoursePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (takeCoursePK != null ? takeCoursePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TakeCourse)) {
            return false;
        }
        TakeCourse other = (TakeCourse) object;
        if ((this.takeCoursePK == null && other.takeCoursePK != null) || (this.takeCoursePK != null && !this.takeCoursePK.equals(other.takeCoursePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "coursetimetable.TakeCourse[ takeCoursePK=" + takeCoursePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
