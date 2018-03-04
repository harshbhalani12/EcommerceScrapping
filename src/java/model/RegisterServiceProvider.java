/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "RegisterServiceProvider")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegisterServiceProvider.findAll", query = "SELECT r FROM RegisterServiceProvider r"),
    @NamedQuery(name = "RegisterServiceProvider.findByRegId", query = "SELECT r FROM RegisterServiceProvider r WHERE r.regId = :regId"),
    @NamedQuery(name = "RegisterServiceProvider.findByFirstName", query = "SELECT r FROM RegisterServiceProvider r WHERE r.firstName = :firstName"),
    @NamedQuery(name = "RegisterServiceProvider.findByLastName", query = "SELECT r FROM RegisterServiceProvider r WHERE r.lastName = :lastName"),
    @NamedQuery(name = "RegisterServiceProvider.findByMobileNo", query = "SELECT r FROM RegisterServiceProvider r WHERE r.mobileNo = :mobileNo"),
    @NamedQuery(name = "RegisterServiceProvider.findByCompanyName", query = "SELECT r FROM RegisterServiceProvider r WHERE r.companyName = :companyName"),
    @NamedQuery(name = "RegisterServiceProvider.findByBrandName", query = "SELECT r FROM RegisterServiceProvider r WHERE r.brandName = :brandName"),
    @NamedQuery(name = "RegisterServiceProvider.findByProductCategory", query = "SELECT r FROM RegisterServiceProvider r WHERE r.productCategory = :productCategory"),
    @NamedQuery(name = "RegisterServiceProvider.findByExperiance", query = "SELECT r FROM RegisterServiceProvider r WHERE r.experiance = :experiance")})
public class RegisterServiceProvider implements Serializable {
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
    @Column(name = "CompanyName")
    private String companyName;
    @Basic(optional = false)
    @Column(name = "BrandName")
    private String brandName;
    @Basic(optional = false)
    @Column(name = "ProductCategory")
    private String productCategory;
    @Basic(optional = false)
    @Column(name = "Experiance")
    private String experiance;
    @Basic(optional = false)
    @Lob
    @Column(name = "Address")
    private String address;
    @JoinColumn(name = "LoginId", referencedColumnName = "LoginId")
    @ManyToOne(optional = false)
    private Login loginId;

    public RegisterServiceProvider() {
    }

    public RegisterServiceProvider(Integer regId) {
        this.regId = regId;
    }

    public RegisterServiceProvider(Integer regId, String firstName, String lastName, String mobileNo, String companyName, String brandName, String productCategory, String experiance, String address) {
        this.regId = regId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.companyName = companyName;
        this.brandName = brandName;
        this.productCategory = productCategory;
        this.experiance = experiance;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regId != null ? regId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegisterServiceProvider)) {
            return false;
        }
        RegisterServiceProvider other = (RegisterServiceProvider) object;
        if ((this.regId == null && other.regId != null) || (this.regId != null && !this.regId.equals(other.regId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RegisterServiceProvider[ regId=" + regId + " ]";
    }
    
}
