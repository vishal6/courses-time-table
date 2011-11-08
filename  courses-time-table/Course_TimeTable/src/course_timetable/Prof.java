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
@Table(name = "prof", catalog = "course_timetable", schema = "")
@NamedQueries({
    @NamedQuery(name = "Prof.findAll", query = "SELECT p FROM Prof p"),
    @NamedQuery(name = "Prof.findById", query = "SELECT p FROM Prof p WHERE p.id = :id"),
    @NamedQuery(name = "Prof.findByFirstName", query = "SELECT p FROM Prof p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Prof.findByLastName", query = "SELECT p FROM Prof p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Prof.findByPassword", query = "SELECT p FROM Prof p WHERE p.password = :password"),
    @NamedQuery(name = "Prof.findByGender", query = "SELECT p FROM Prof p WHERE p.gender = :gender"),
    @NamedQuery(name = "Prof.findByPhone", query = "SELECT p FROM Prof p WHERE p.phone = :phone"),
    @NamedQuery(name = "Prof.findByMobile", query = "SELECT p FROM Prof p WHERE p.mobile = :mobile")})
public class Prof implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "password")
    private int password;
    @Column(name = "Gender")
    private Character gender;
    @Column(name = "Phone")
    private Integer phone;
    @Column(name = "Mobile")
    private Integer mobile;

    public Prof() {
    }

    public Prof(Integer id) {
        this.id = id;
    }

    public Prof(Integer id, int password) {
        this.id = id;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        int oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        Character oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        Integer oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        Integer oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
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
        if (!(object instanceof Prof)) {
            return false;
        }
        Prof other = (Prof) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "course_timetable.Prof[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
