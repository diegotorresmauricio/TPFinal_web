package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Juego implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_juego;
    
    @Basic
    String nombre_juego;
    String cantClientes;
    String cantOperadores;
    
    @ManyToOne
    Horario newHorario;
    
    public Juego() {
    }

    public Juego(int id_juego, String nombre_juego, String usuario, String cantOperadores, Horario newHorario) {
        this.id_juego = id_juego;
        this.nombre_juego = nombre_juego;
        this.cantClientes = usuario;
        this.cantOperadores = cantOperadores;
        this.newHorario = newHorario;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public String getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(String cantClientes) {
        this.cantClientes = cantClientes;
    }

    public String getCantOperadores() {
        return cantOperadores;
    }

    public void setCantOperadores(String cantOperadores) {
        this.cantOperadores = cantOperadores;
    }

    public Horario getNewHorario() {
        return newHorario;
    }

    public void setNewHorario(Horario newHorario) {
        this.newHorario = newHorario;
    }

    
    
    
}
