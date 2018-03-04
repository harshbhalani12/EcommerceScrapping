/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Register")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Register.findAll", query = "SELECT r FROM Register r"),
    @NamedQuery(name = "Register.findByRegId", query = "SELECT r FROM Register r WHERE r.regId = :regId"),
    @NamedQuery(name = "Register.findByFirstName", query = "SELECT r FROM Register r WHERE r.firstName = :firstName"),
    @NamedQuery(name = "Register.findByLastName", query = "SELECT r FROM Register r WHERE r.lastName = :lastName"),
    @NamedQuery(name = "Register.findByMobileNo", query = "SELECT r FROM Register r WHERE r.mobileNo = :mobileNo")})
public class Register implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "RegId")
    private Integer regId;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "MobileNo")
    private String mobileNo;
    @Basic(optional = false)
    @Lob
    @Column(name = "Address")
    private String address;
    @JoinColumn(name = "LoginId", referencedColumnName = "LoginId")
    @ManyToOne(optional = false)
    private Login loginId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fromUId")
    private Collection<Chat> chatCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "toUId")
    private Collection<Chat> chatCollection1;

    public Register() {
    }

    public Register(Integer regId) {
        this.regId = regId;
    }

    public Register(Integer regId, String firstName, String lastName, String mobileNo, String address) {
        this.regId = regId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Login getLoginId() {
        return loginId;
    }

    public void setLoginId(Login loginId) {
        this.loginId = loginId;
    }

    @XmlTransient
    public Collection<Chat> getChatCollection() {
        return chatCollection;
    }

    public void setChatCollection(Collection<Chat> chatCollection) {
        this.chatCollection = chatCollection;
    }

    @XmlTransient
    public Collection<Chat> getChatCollection1() {
        return chatCollection1;
    }

    public void setChatCollection1(Collection<Chat> chatCollection1) {
        this.chatCollection1 = chatCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regId != null ? regId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Register)) {
            return false;
        }
        Register other = (Register) object;
        if ((this.regId == null && other.regId != null) || (this.regId != null && !this.regId.equals(other.regId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Register[ regId=" + regId + " ]";
    }
    
}
