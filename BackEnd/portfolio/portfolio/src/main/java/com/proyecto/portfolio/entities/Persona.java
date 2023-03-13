
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni", unique = true)
    private String dni;
    @Column(name = "cuil", unique = true)
    private String cuil;
    @Column(name = "fechaNac")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaNac;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "perfil")
    private String perfil;
    @Column(name = "fechaAlta")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaAlta;
    @Column(name = "fechaBaja")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private LocalDate fechaBaja;
    @Column(name = "estado")
    private String estado;
    
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private Usuario usuario;
    
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private Domicilio domicilio;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<Imagen> listaImagen;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<RedSocial> listaRed;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<DetalleIdioma> listaIdioma;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<DetalleProSkill> listaProSkill;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<DetallePersonalSkill> listaPersonalSkill;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<FormacionAcademica> listaFormacionAcademica;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<FormacionComplementaria> listaFormacionComplementaria;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "persona", allowSetters = true)
    private List<ExperienciaLaboral> listaExperienciaLaboral;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String dni, String cuil, LocalDate fechaNac, String telefono, String email, String titulo, String perfil, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.titulo = titulo;
        this.perfil = perfil;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.estado = estado;
    }

    public Persona(String nombre, String apellido, String dni, String cuil, LocalDate fechaNac, String telefono, String email, String titulo, String perfil, LocalDate fechaAlta, LocalDate fechaBaja, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.titulo = titulo;
        this.perfil = perfil;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<Imagen> getListaImagen() {
        return listaImagen;
    }

    public void setListaImagen(List<Imagen> listaImagen) {
        this.listaImagen = listaImagen;
    }

    public List<RedSocial> getListaRed() {
        return listaRed;
    }

    public void setListaRed(List<RedSocial> listaRed) {
        this.listaRed = listaRed;
    }

    public List<DetalleIdioma> getListaIdioma() {
        return listaIdioma;
    }

    public void setListaIdioma(List<DetalleIdioma> listaIdioma) {
        this.listaIdioma = listaIdioma;
    }

    public List<DetalleProSkill> getListaProSkill() {
        return listaProSkill;
    }

    public void setListaProSkill(List<DetalleProSkill> listaProSkill) {
        this.listaProSkill = listaProSkill;
    }

    public List<DetallePersonalSkill> getListaPersonalSkill() {
        return listaPersonalSkill;
    }

    public void setListaPersonalSkill(List<DetallePersonalSkill> listaPersonalSkill) {
        this.listaPersonalSkill = listaPersonalSkill;
    }

    public List<FormacionAcademica> getListaFormacionAcademica() {
        return listaFormacionAcademica;
    }

    public void setListaFormacionAcademica(List<FormacionAcademica> listaFormacionAcademica) {
        this.listaFormacionAcademica = listaFormacionAcademica;
    }

    public List<FormacionComplementaria> getListaFormacionComplementaria() {
        return listaFormacionComplementaria;
    }

    public void setListaFormacionComplementaria(List<FormacionComplementaria> listaFormacionComplementaria) {
        this.listaFormacionComplementaria = listaFormacionComplementaria;
    }

    public List<ExperienciaLaboral> getListaExperienciaLaboral() {
        return listaExperienciaLaboral;
    }

    public void setListaExperienciaLaboral(List<ExperienciaLaboral> listaExperienciaLaboral) {
        this.listaExperienciaLaboral = listaExperienciaLaboral;
    }
    
    
    @Override
    public String toString() {
        return "id: " + id + "\nnombre: " + nombre + "\napellido: " + apellido + "\ndni: " + dni + "\ncuil: " + cuil + 
                "\nfechaNac: " + fechaNac + "\ntelefono: " + telefono + "\nemail: " + email + "\ntitulo: " + titulo + "\nperfil: " + perfil 
                + "\nfechaAlta: " + fechaAlta + "\nfechaBaja: " + fechaBaja + "\nestado: " + estado;
    }
    
    
   
    
}
