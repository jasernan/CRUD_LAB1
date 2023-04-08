/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD_LAB1.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julia
 */
@Entity
@Table(name = "ESTUDIANTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiantes.findAll", query = "SELECT e FROM Estudiantes e"),
    @NamedQuery(name = "Estudiantes.findByCodEstudianies", query = "SELECT e FROM Estudiantes e WHERE e.codEstudianies = :codEstudianies"),
    @NamedQuery(name = "Estudiantes.findByNombreEstudiante", query = "SELECT e FROM Estudiantes e WHERE e.nombreEstudiante = :nombreEstudiante"),
    @NamedQuery(name = "Estudiantes.findByApellidoEstudiante", query = "SELECT e FROM Estudiantes e WHERE e.apellidoEstudiante = :apellidoEstudiante"),
    @NamedQuery(name = "Estudiantes.findBySemestreEstudianie", query = "SELECT e FROM Estudiantes e WHERE e.semestreEstudianie = :semestreEstudianie")})
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_ESTUDIANIES")
    private String codEstudianies;
    @Size(max = 20)
    @Column(name = "NOMBRE_ESTUDIANTE")
    private String nombreEstudiante;
    @Size(max = 20)
    @Column(name = "APELLIDO_ESTUDIANTE")
    private String apellidoEstudiante;
    @Column(name = "SEMESTRE_ESTUDIANIE")
    private Integer semestreEstudianie;

    public Estudiantes() {
    }

    public Estudiantes(String codEstudianies) {
        this.codEstudianies = codEstudianies;
    }

    public Estudiantes(String codEstudianies, String nombreEstudiante, String apellidoEstudiante, Integer semestreEstudianie) {
        this.codEstudianies = codEstudianies;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.semestreEstudianie = semestreEstudianie;
    }

    

    public String getCodEstudianies() {
        return codEstudianies;
    }

    public void setCodEstudianies(String codEstudianies) {
        this.codEstudianies = codEstudianies;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public Integer getSemestreEstudianie() {
        return semestreEstudianie;
    }

    public void setSemestreEstudianie(Integer semestreEstudianie) {
        this.semestreEstudianie = semestreEstudianie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEstudianies != null ? codEstudianies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiantes)) {
            return false;
        }
        Estudiantes other = (Estudiantes) object;
        if ((this.codEstudianies == null && other.codEstudianies != null) || (this.codEstudianies != null && !this.codEstudianies.equals(other.codEstudianies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRUD_LAB1.entity.Estudiantes[ codEstudianies=" + codEstudianies + " ]";
    }
    
}
