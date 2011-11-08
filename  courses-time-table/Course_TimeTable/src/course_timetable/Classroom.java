/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package course_timetable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Nody
 */
@Entity
@Table(name = "classroom", catalog = "course_timetable", schema = "")
@NamedQueries({
    @NamedQuery(name = "Classroom.findAll", query = "SELECT c FROM Classroom c"),
    @NamedQuery(name = "Classroom.findById", query = "SELECT c FROM Classroom c WHERE c.id = :id"),
    @NamedQuery(name = "Classroom.findByDeprtmentname", query = "SELECT c FROM Classroom c WHERE c.deprtmentname = :deprtmentname")})
public class Classroom implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Deprtment_name")
    private String deprtmentname;

    public Classroom() {
    }

    public Classroom(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDeprtmentname() {
        return deprtmentname;
    }

    public void setDeprtmentname(String deprtmentname) {
        String oldDeprtmentname = this.deprtmentname;
        this.deprtmentname = deprtmentname;
        changeSupport.firePropertyChange("deprtmentname", oldDeprtmentname, deprtmentname);
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
        if (!(object instanceof Classroom)) {
            return false;
        }
        Classroom other = (Classroom) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "course_timetable.Classroom[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
