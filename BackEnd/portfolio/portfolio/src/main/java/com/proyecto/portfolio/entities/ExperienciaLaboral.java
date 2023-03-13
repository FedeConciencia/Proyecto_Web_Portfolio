
package com.proyecto.portfolio.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "experiencia_laboral")
public class ExperienciaLaboral implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "puesto")
    private String puesto;
    @Column(name = "fechaInicio")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaInicio;
    @Column(name = "fechaFin")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaFin;
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
    @JsonIgnoreProperties(value = "listaExperienciaLaboral", allowSetters = true)
    private Persona persona;
    
    @OneToMany(mappedBy = "experienciaLaboral", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "experienciaLaboral", allowSetters = true)
    private List<DescripcionLaboral> listaDescripcionLaboral;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String empresa, String puesto, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }

    public ExperienciaLaboral(String empresa, String puesto, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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

    public List<DescripcionLaboral> getListaDescripcionLaboral() {
        return listaDescripcionLaboral;
    }

    public void setListaDescripcionLaboral(List<DescripcionLaboral> listaDescripcionLaboral) {
        this.listaDescripcionLaboral = listaDescripcionLaboral;
    }
    
    
    @Override
    public String toString() {
        return  "id: " + id + "\nempresa: " + empresa + "\npuesto: " + puesto + 
                "\nfechaInicio: " + fechaInicio + "\nfechaFin: " + fechaFin + "\nfechaAlta: " + fechaAlta + 
                "\nfechaBaja: " + fechaBaja + "\nestado: " + estado;
    }
    
    
    
    
}
