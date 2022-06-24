
package com.ap.ap.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String img;
    private String banner;
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion>educacionList;
     @OneToMany(fetch=FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills>skillList;
      @OneToMany(fetch=FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia>experienciaList;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String apellido, String titulo, String descripcion, String img, String banner) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
        this.banner = banner;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImg() {
        return img;
    }

    public String getBanner() {
        return banner;
    }

    public List<Educacion> getEducacionList() {
        return educacionList;
    }

    public List<Skills> getSkillList() {
        return skillList;
    }

    public List<Experiencia> getExperienciaList() {
        return experienciaList;
    }

    
    
}
