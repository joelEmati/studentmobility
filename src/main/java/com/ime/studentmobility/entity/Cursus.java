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
import java.io.Serializable;

/**
 *
 * @author BLACKSTAR
 */
@Entity
@Table(catalog = "studentMob2", schema = "SA")
@NamedQueries({
    @NamedQuery(name = "Cursus.findAll", query = "SELECT c FROM Cursus c"),
    @NamedQuery(name = "Cursus.findById", query = "SELECT c FROM Cursus c WHERE c.id = :id"),
    @NamedQuery(name = "Cursus.findByFieldOfStudy", query = "SELECT c FROM Cursus c WHERE c.fieldOfStudy = :fieldOfStudy"),
    @NamedQuery(name = "Cursus.findByLevel", query = "SELECT c FROM Cursus c WHERE c.level = :level"),
    @NamedQuery(name = "Cursus.findByCycle", query = "SELECT c FROM Cursus c WHERE c.cycle = :cycle")})
public class Cursus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "field_of_study", nullable = false, length = 2147483647)
    private String fieldOfStudy;
    @Basic(optional = false)
    @Column(nullable = false)
    private int level;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String cycle;

    public Cursus() {
    }

    public Cursus(Integer id) {
        this.id = id;
    }

    public Cursus(Integer id, String fieldOfStudy, int level, String cycle) {
        this.id = id;
        this.fieldOfStudy = fieldOfStudy;
        this.level = level;
        this.cycle = cycle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
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
        if (!(object instanceof Cursus)) {
            return false;
        }
        Cursus other = (Cursus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ime.studentmobility.entity.Cursus[ id=" + id + " ]";
    }
    
}
