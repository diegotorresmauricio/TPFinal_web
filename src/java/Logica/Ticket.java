package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    
    @ManyToOne
    Cliente newDuenio;
    
    @OneToOne
    Juego newJuego;
    
    @OneToOne
    Horario newHorario;

    public Ticket() {
    }

    public Ticket(int id, Cliente newDuenio, Juego newJuego, Horario newHorario) {
        this.id = id;
        this.newDuenio = newDuenio;
        this.newJuego = newJuego;
        this.newHorario = newHorario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getNewDuenio() {
        return newDuenio;
    }

    public void setNewDuenio(Cliente newDuenio) {
        this.newDuenio = newDuenio;
    }

    public Juego getNewJuego() {
        return newJuego;
    }

    public void setNewJuego(Juego newJuego) {
        this.newJuego = newJuego;
    }

    public Horario getNewHorario() {
        return newHorario;
    }

    public void setNewHorario(Horario newHorario) {
        this.newHorario = newHorario;
    }

    
    @Override
    public String toString() {
        return "Ticket{" + "id= " + id + ", Propietario= " + newDuenio + ", Juego= " + newJuego + ", Horario= " + newHorario + '}';
    }

    
    

    
}
