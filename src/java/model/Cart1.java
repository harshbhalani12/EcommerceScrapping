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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Cart1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cart1.findAll", query = "SELECT c FROM Cart1 c"),
    @NamedQuery(name = "Cart1.findByCId", query = "SELECT c FROM Cart1 c WHERE c.cId = :cId"),
    @NamedQuery(name = "Cart1.findByPId", query = "SELECT c FROM Cart1 c WHERE c.pId = :pId"),
    @NamedQuery(name = "Cart1.findByProductImage", query = "SELECT c FROM Cart1 c WHERE c.productImage = :productImage"),
    @NamedQuery(name = "Cart1.findByProductName", query = "SELECT c FROM Cart1 c WHERE c.productName = :productName"),
    @NamedQuery(name = "Cart1.findByPrice", query = "SELECT c FROM Cart1 c WHERE c.price = :price"),
    @NamedQuery(name = "Cart1.findByQty", query = "SELECT c FROM Cart1 c WHERE c.qty = :qty"),
    @NamedQuery(name = "Cart1.findByTotal", query = "SELECT c FROM Cart1 c WHERE c.total = :total"),
    @NamedQuery(name = "Cart1.findByLoginId", query = "SELECT c FROM Cart1 c WHERE c.loginId = :loginId")})
public class Cart1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "CId")
    private Integer cId;
    @Basic(optional = false)
    @Column(name = "PId")
    private int pId;
    @Basic(optional = false)
    @Column(name = "ProductImage")
    private String productImage;
    @Basic(optional = false)
    @Column(name = "ProductName")
    private String productName;
    @Basic(optional = false)
    @Column(name = "Price")
    private int price;
    @Basic(optional = false)
    @Column(name = "Qty")
    private int qty;
    @Basic(optional = false)
    @Column(name = "Total")
    private int total;
    @Basic(optional = false)
    @Column(name = "LoginId")
    private int loginId;

    public Cart1() {
    }

    public Cart1(Integer cId) {
        this.cId = cId;
    }

    public Cart1(Integer cId, int pId, String productImage, String productName, int price, int qty, int total, int loginId) {
        this.cId = cId;
        this.pId = pId;
        this.productImage = productImage;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.total = total;
        this.loginId = loginId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cId != null ? cId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cart1)) {
            return false;
        }
        Cart1 other = (Cart1) object;
        if ((this.cId == null && other.cId != null) || (this.cId != null && !this.cId.equals(other.cId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cart1[ cId=" + cId + " ]";
    }
    
}
