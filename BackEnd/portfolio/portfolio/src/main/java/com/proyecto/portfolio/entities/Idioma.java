
package com.proyecto.portfolio.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "idioma")
public class Idioma implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nivel")
    private int nivel;
    @Column(name = "fechaAlta")
    private LocalDate fechaAlta;
    @Column(name = "fechaBaja")
    private LocalDate fechaBaja;
    @Column(name = "estado")
    private String estado;
    
    @OneToMany(mappedBy = "idioma", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "idioma", allowSetters = true)
    private List<DetalleIdioma> listaIdioma;
    
    public Idioma() {
    }

    public Idioma(Long id, String nombre, int nivel, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }

    public Idioma(String nombre, int nivel, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetalleIdioma> getListaIdioma() {
        return listaIdioma;
    }

    public void setListaIdioma(List<DetalleIdioma> listaIdioma) {
        this.listaIdioma = listaIdioma;
    }
    

    @Override
    public String toString() {
        return "id: " + id + "\nnombre: " + nombre + "\nnivel: " + nivel + "\nfechaAlta: " + fechaAlta + 
                "\nfechaBaja: " + fechaBaja + "\nestado: " + estado;
    }
    
    
    
    
    
}
