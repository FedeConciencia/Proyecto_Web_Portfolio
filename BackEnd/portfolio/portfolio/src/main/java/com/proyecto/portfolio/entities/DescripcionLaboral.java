
package com.proyecto.portfolio.entities;

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
@Table(name = "descripcion_laboral")
public class DescripcionLaboral implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechaAlta")
    private LocalDate fechaAlta;
    @Column(name = "fechaBaja")
    private LocalDate fechaBaja;
    @Column(name = "estado")
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "id_experiencia")
    @JsonIgnoreProperties(value = "listaDescripcionLaboral", allowSetters = true)
    private ExperienciaLaboral experienciaLaboral;

    public DescripcionLaboral() {
    }

    public DescripcionLaboral(Long id, String descripcion, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }

    public DescripcionLaboral(String descripcion, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public ExperienciaLaboral getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }
    
    

    @Override
    public String toString() {
        return "id: " + id + "\ndescripcion: " + descripcion + "\nfechaAlta: " + fechaAlta + 
                "\nfechaBaja: " + fechaBaja + "\nestado: " + estado;
    }
    
    
    
}
