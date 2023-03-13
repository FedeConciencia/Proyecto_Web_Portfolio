
package com.proyecto.portfolio.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_idioma")
public class DetalleIdioma implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fechaAlta")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaAlta;
    @Column(name = "fechaBaja")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaBaja;
    @Column(name = "estado")
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "id_persona")
    @JsonIgnoreProperties(value = "listaIdioma", allowSetters = true)
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name = "id_idioma")
    @JsonIgnoreProperties(value = "listaIdioma", allowSetters = true)
    private Idioma idioma;

    public DetalleIdioma() {
    }

    public DetalleIdioma(Long id, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.id = id;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }

    public DetalleIdioma(LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
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
    
    

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nfechaAlta: " + fechaAlta + "\nfechaBaja: " + fechaBaja + "\nestado: " + estado;
    }
    
  
}
