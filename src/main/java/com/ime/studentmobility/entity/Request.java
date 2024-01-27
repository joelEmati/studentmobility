/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ime.studentmobility.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author BLACKSTAR
 */
@Entity
@Table(catalog = "studentMob2", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "Request.findAll", query = "SELECT r FROM Request r"),
    @NamedQuery(name = "Request.findById", query = "SELECT r FROM Request r WHERE r.id = :id"),
    @NamedQuery(name = "Request.findByPreviousCampus", query = "SELECT r FROM Request r WHERE r.previousCampus = :previousCampus"),
    @NamedQuery(name = "Request.findBySollicitateCampus", query = "SELECT r FROM Request r WHERE r.sollicitateCampus = :sollicitateCampus"),
    @NamedQuery(name = "Request.findByDate", query = "SELECT r FROM Request r WHERE r.date = :date"),
    @NamedQuery(name = "Request.findByPurpose", query = "SELECT r FROM Request r WHERE r.purpose = :purpose")})
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "previous_campus", nullable = false, length = 2147483647)
    private String previousCampus;
    @Basic(optional = false)
    @Column(name = "sollicitate_campus", nullable = false, length = 2147483647)
    private String sollicitateCampus;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String purpose;

    public Request() {
    }

    public Request(Integer id) {
        this.id = id;
    }

    public Request(Integer id, String previousCampus, String sollicitateCampus, Date date, String purpose) {
        this.id = id;
        this.previousCampus = previousCampus;
        this.sollicitateCampus = sollicitateCampus;
        this.date = date;
        this.purpose = purpose;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreviousCampus() {
        return previousCampus;
    }

    public void setPreviousCampus(String previousCampus) {
        this.previousCampus = previousCampus;
    }

    public String getSollicitateCampus() {
        return sollicitateCampus;
    }

    public void setSollicitateCampus(String sollicitateCampus) {
        this.sollicitateCampus = sollicitateCampus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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
        if (!(object instanceof Request)) {
            return false;
        }
        Request other = (Request) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ime.studentmobility.entity.Request[ id=" + id + " ]";
    }
    
}
