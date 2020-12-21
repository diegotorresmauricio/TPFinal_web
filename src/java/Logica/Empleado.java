package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class Empleado extends Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_empleado;
    
    @Basic
    String cargo;
    
    @OneToOne
    Usuario unUsuario;
            
    public Empleado() {
    }

    public Empleado(int id_empleado, String cargo, Usuario unUsuario) {
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.unUsuario = unUsuario;
    }

    public Empleado(int id_empleado, String cargo, Usuario unUsuario, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.unUsuario = unUsuario;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    
    
}
