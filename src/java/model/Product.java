/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
@Table(name = "Product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByPId", query = "SELECT p FROM Product p WHERE p.pId = :pId"),
    @NamedQuery(name = "Product.findByPName", query = "SELECT p FROM Product p WHERE p.pName = :pName"),
    @NamedQuery(name = "Product.findByPCategory", query = "SELECT p FROM Product p WHERE p.pCategory = :pCategory"),
    @NamedQuery(name = "Product.findByPSubCategory", query = "SELECT p FROM Product p WHERE p.pSubCategory = :pSubCategory"),
    @NamedQuery(name = "Product.findByPPrice", query = "SELECT p FROM Product p WHERE p.pPrice = :pPrice"),
    @NamedQuery(name = "Product.findByPOffers", query = "SELECT p FROM Product p WHERE p.pOffers = :pOffers"),
    @NamedQuery(name = "Product.findByPImage", query = "SELECT p FROM Product p WHERE p.pImage = :pImage")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "PId")
    private Integer pId;
    @Basic(optional = false)
    @Column(name = "PName")
    private String pName;
    @Basic(optional = false)
    @Column(name = "PCategory")
    private String pCategory;
    @Basic(optional = false)
    @Column(name = "PSubCategory")
    private String pSubCategory;
    @Basic(optional = false)
    @Column(name = "PPrice")
    private String pPrice;
    @Basic(optional = false)
    @Lob
    @Column(name = "PDescri")
    private String pDescri;
    @Basic(optional = false)
    @Column(name = "POffers")
    private String pOffers;
    @Basic(optional = false)
    @Column(name = "PImage")
    private String pImage;
    @JoinColumn(name = "LoginId", referencedColumnName = "LoginId")
    @ManyToOne(optional = false)
    private Login loginId;

    public Product() {
    }

    public Product(Integer pId) {
        this.pId = pId;
    }

    public Product(Integer pId, String pName, String pCategory, String pSubCategory, String pPrice, String pDescri, String pOffers, String pImage) {
        this.pId = pId;
        this.pName = pName;
        this.pCategory = pCategory;
        this.pSubCategory = pSubCategory;
        this.pPrice = pPrice;
        this.pDescri = pDescri;
        this.pOffers = pOffers;
        this.pImage = pImage;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getPCategory() {
        return pCategory;
    }

    public void setPCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public String getPSubCategory() {
        return pSubCategory;
    }

    public void setPSubCategory(String pSubCategory) {
        this.pSubCategory = pSubCategory;
    }

    public String getPPrice() {
        return pPrice;
    }

    public void setPPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public String getPDescri() {
        return pDescri;
    }

    public void setPDescri(String pDescri) {
        this.pDescri = pDescri;
    }

    public String getPOffers() {
        return pOffers;
    }

    public void setPOffers(String pOffers) {
        this.pOffers = pOffers;
    }

    public String getPImage() {
        return pImage;
    }

    public void setPImage(String pImage) {
        this.pImage = pImage;
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
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Product[ pId=" + pId + " ]";
    }
    
}
