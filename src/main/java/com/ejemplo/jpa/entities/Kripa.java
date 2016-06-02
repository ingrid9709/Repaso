/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author adsi1
 */
@Entity
@Table(name = "KRIPA")
@NamedQueries({
    @NamedQuery(name = "Kripa.findAll", query = "SELECT k FROM Kripa k"),
    @NamedQuery(name = "Kripa.findByIdKripa", query = "SELECT k FROM Kripa k WHERE k.idKripa = :idKripa"),
    @NamedQuery(name = "Kripa.findByNombre", query = "SELECT k FROM Kripa k WHERE k.nombre = :nombre"),
    @NamedQuery(name = "Kripa.findByTipo", query = "SELECT k FROM Kripa k WHERE k.tipo = :tipo"),
    @NamedQuery(name = "Kripa.findByTamano", query = "SELECT k FROM Kripa k WHERE k.tamano = :tamano"),
    @NamedQuery(name = "Kripa.findByPrecio", query = "SELECT k FROM Kripa k WHERE k.precio = :precio")})
public class Kripa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_kripa")
    private Integer idKripa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tamano")
    private int tamano;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private int precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kRIPAidKRIPA")
    private List<Usuario> usuarioList;

    public Kripa() {
    }

    public Kripa(Integer idKripa) {
        this.idKripa = idKripa;
    }

    public Kripa(Integer idKripa, String nombre, String tipo, int tamano, int precio) {
        this.idKripa = idKripa;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.precio = precio;
    }

    public Integer getIdKripa() {
        return idKripa;
    }

    public void setIdKripa(Integer idKripa) {
        this.idKripa = idKripa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKripa != null ? idKripa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kripa)) {
            return false;
        }
        Kripa other = (Kripa) object;
        if ((this.idKripa == null && other.idKripa != null) || (this.idKripa != null && !this.idKripa.equals(other.idKripa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.jpa.entities.Kripa[ idKripa=" + idKripa + " ]";
    }
    
}
