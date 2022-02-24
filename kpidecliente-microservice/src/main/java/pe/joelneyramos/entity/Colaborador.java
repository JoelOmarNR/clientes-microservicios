package pe.joelneyramos.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="colaboradores")
public class Colaborador implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colaboradorId;

    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private Integer celular;

    @Column
    private String email;

    public Colaborador() {
        // TODO Auto-generated constructor stub
    }

    public Colaborador(Integer colaboradorId, String nombres, String apellidos,  Integer celular,  String email) {
        this.colaboradorId = colaboradorId;
        this.nombres = nombres;
        this.apellidos = apellidos;

        this.celular = celular;

        this.email = email;
    }

    public Integer getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(Integer colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
