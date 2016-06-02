/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author adsi1
 */
@Entity
@Table(name = "COCAINA")
@NamedQueries({
    @NamedQuery(name = "Cocaina.findAll", query = "SELECT c FROM Cocaina c"),
    @NamedQuery(name = "Cocaina.findByIdCocaina", query = "SELECT c FROM Cocaina c WHERE c.idCocaina = :idCocaina"),
    @NamedQuery(name = "Cocaina.findByNombre", query = "SELECT c FROM Cocaina c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cocaina.findByTipo", query = "SELECT c FROM Cocaina c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cocaina.findByTamano", query = "SELECT c FROM Cocaina c WHERE c.tamano = :tamano"),
    @NamedQuery(name = "Cocaina.findByPrecio", query = "SELECT c FROM Cocaina c WHERE c.precio = :precio")})
public class Cocaina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cocaina")
    private Integer idCocaina;
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
    @JoinColumn(name = "USUARIO_idUSUARIO", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario uSUARIOidUSUARIO;

    public Cocaina() {
    }

    public Cocaina(Integer idCocaina) {
        this.idCocaina = idCocaina;
    }

    public Cocaina(Integer idCocaina, String nombre, String tipo, int tamano, int precio) {
        this.idCocaina = idCocaina;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.precio = precio;
    }

    public Integer getIdCocaina() {
        return idCocaina;
    }

    public void setIdCocaina(Integer idCocaina) {
        this.idCocaina = idCocaina;
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

    public Usuario getUSUARIOidUSUARIO() {
        return uSUARIOidUSUARIO;
    }

    public void setUSUARIOidUSUARIO(Usuario uSUARIOidUSUARIO) {
        this.uSUARIOidUSUARIO = uSUARIOidUSUARIO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCocaina != null ? idCocaina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocaina)) {
            return false;
        }
        Cocaina other = (Cocaina) object;
        if ((this.idCocaina == null && other.idCocaina != null) || (this.idCocaina != null && !this.idCocaina.equals(other.idCocaina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ejemplo.jpa.entities.Cocaina[ idCocaina=" + idCocaina + " ]";
    }
    
}
