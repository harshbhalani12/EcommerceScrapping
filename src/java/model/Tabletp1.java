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
@Table(name = "Tabletp1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tabletp1.findAll", query = "SELECT t FROM Tabletp1 t"),
    @NamedQuery(name = "Tabletp1.findById", query = "SELECT t FROM Tabletp1 t WHERE t.id = :id"),
    @NamedQuery(name = "Tabletp1.findByQty", query = "SELECT t FROM Tabletp1 t WHERE t.qty = :qty"),
    @NamedQuery(name = "Tabletp1.findByPrice", query = "SELECT t FROM Tabletp1 t WHERE t.price = :price"),
    @NamedQuery(name = "Tabletp1.findByTotal", query = "SELECT t FROM Tabletp1 t WHERE t.total = :total")})
public class Tabletp1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;

    public Tabletp1() {
    }

    public Tabletp1(Integer id) {
        this.id = id;
    }

    public Tabletp1(Integer id, int qty, int price, int total) {
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        if (!(object instanceof Tabletp1)) {
            return false;
        }
        Tabletp1 other = (Tabletp1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tabletp1[ id=" + id + " ]";
    }
    
}
