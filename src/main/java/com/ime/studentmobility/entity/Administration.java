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
    @NamedQuery(name = "Administration.findAll", query = "SELECT a FROM Administration a"),
    @NamedQuery(name = "Administration.findById", query = "SELECT a FROM Administration a WHERE a.id = :id"),
    @NamedQuery(name = "Administration.findByRegistrationNumber", query = "SELECT a FROM Administration a WHERE a.registrationNumber = :registrationNumber"),
    @NamedQuery(name = "Administration.findByPosition", query = "SELECT a FROM Administration a WHERE a.position = :position"),
    @NamedQuery(name = "Administration.findByName", query = "SELECT a FROM Administration a WHERE a.name = :name"),
    @NamedQuery(name = "Administration.findByPhone", query = "SELECT a FROM Administration a WHERE a.phone = :phone"),
    @NamedQuery(name = "Administration.findByAddress", query = "SELECT a FROM Administration a WHERE a.address = :address")})
public class Administration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "registration_number", nullable = false, length = 2147483647)
    private String registrationNumber;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String position;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String name;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String phone;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String address;

    public Administration() {
    }

    public Administration(Integer id) {
        this.id = id;
    }

    public Administration(Integer id, String registrationNumber, String position, String name, String phone, String address) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.position = position;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        if (!(object instanceof Administration)) {
            return false;
        }
        Administration other = (Administration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ime.studentmobility.entity.Administration[ id=" + id + " ]";
    }
    
}
