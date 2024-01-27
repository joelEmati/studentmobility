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
    @NamedQuery(name = "Campus.findAll", query = "SELECT c FROM Campus c"),
    @NamedQuery(name = "Campus.findById", query = "SELECT c FROM Campus c WHERE c.id = :id"),
    @NamedQuery(name = "Campus.findByName", query = "SELECT c FROM Campus c WHERE c.name = :name"),
    @NamedQuery(name = "Campus.findByPhone", query = "SELECT c FROM Campus c WHERE c.phone = :phone"),
    @NamedQuery(name = "Campus.findByLocation", query = "SELECT c FROM Campus c WHERE c.location = :location"),
    @NamedQuery(name = "Campus.findByEmail", query = "SELECT c FROM Campus c WHERE c.email = :email")})
public class Campus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String name;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String phone;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String location;
    @Basic(optional = false)
    @Column(nullable = false, length = 2147483647)
    private String email;

    public Campus() {
    }

    public Campus(Integer id) {
        this.id = id;
    }

    public Campus(Integer id, String name, String phone, String location, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Campus)) {
            return false;
        }
        Campus other = (Campus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ime.studentmobility.entity.Campus[ id=" + id + " ]";
    }
    
}
