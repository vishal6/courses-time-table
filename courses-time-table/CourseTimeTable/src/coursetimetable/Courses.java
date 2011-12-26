/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coursetimetable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Nody
 */
@Entity
@Table(name = "courses", catalog = "course_timetable", schema = "")
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c"),
    @NamedQuery(name = "Courses.findById", query = "SELECT c FROM Courses c WHERE c.id = :id"),
    @NamedQuery(name = "Courses.findByName", query = "SELECT c FROM Courses c WHERE c.name = :name"),
    @NamedQuery(name = "Courses.findByLabHRs", query = "SELECT c FROM Courses c WHERE c.labHRs = :labHRs"),
    @NamedQuery(name = "Courses.findByLecHRs", query = "SELECT c FROM Courses c WHERE c.lecHRs = :lecHRs"),
    @NamedQuery(name = "Courses.findBySecHRs", query = "SELECT c FROM Courses c WHERE c.secHRs = :secHRs"),
    @NamedQuery(name = "Courses.findByCprof", query = "SELECT c FROM Courses c WHERE c.cprof = :cprof"),
    @NamedQuery(name = "Courses.findByCTa", query = "SELECT c FROM Courses c WHERE c.cTa = :cTa"),
    @NamedQuery(name = "Courses.findByYear", query = "SELECT c FROM Courses c WHERE c.year = :year")})
public class Courses implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "Lab_HRs")
    private Integer labHRs;
    @Basic(optional = false)
    @Column(name = "lec_HRs")
    private int lecHRs;
    @Basic(optional = false)
    @Column(name = "sec_HRs")
    private int secHRs;
    @Column(name = "C_prof")
    private Integer cprof;
    @Column(name = "C_TA")
    private Integer cTa;
    @Basic(optional = false)
    @Column(name = "Year")
    @Temporal(TemporalType.DATE)
    private Date year;

    public Courses() {
    }

    public Courses(Integer id) {
        this.id = id;
    }

    public Courses(Integer id, String name, int lecHRs, int secHRs, Date year) {
        this.id = id;
        this.name = name;
        this.lecHRs = lecHRs;
        this.secHRs = secHRs;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getLabHRs() {
        return labHRs;
    }

    public void setLabHRs(Integer labHRs) {
        Integer oldLabHRs = this.labHRs;
        this.labHRs = labHRs;
        changeSupport.firePropertyChange("labHRs", oldLabHRs, labHRs);
    }

    public int getLecHRs() {
        return lecHRs;
    }

    public void setLecHRs(int lecHRs) {
        int oldLecHRs = this.lecHRs;
        this.lecHRs = lecHRs;
        changeSupport.firePropertyChange("lecHRs", oldLecHRs, lecHRs);
    }

    public int getSecHRs() {
        return secHRs;
    }

    public void setSecHRs(int secHRs) {
        int oldSecHRs = this.secHRs;
        this.secHRs = secHRs;
        changeSupport.firePropertyChange("secHRs", oldSecHRs, secHRs);
    }

    public Integer getCprof() {
        return cprof;
    }

    public void setCprof(Integer cprof) {
        Integer oldCprof = this.cprof;
        this.cprof = cprof;
        changeSupport.firePropertyChange("cprof", oldCprof, cprof);
    }

    public Integer getCTa() {
        return cTa;
    }

    public void setCTa(Integer cTa) {
        Integer oldCTa = this.cTa;
        this.cTa = cTa;
        changeSupport.firePropertyChange("CTa", oldCTa, cTa);
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        Date oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "coursetimetable.Courses[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
