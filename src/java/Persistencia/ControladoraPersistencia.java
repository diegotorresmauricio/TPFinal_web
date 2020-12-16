package Persistencia;

import Logica.Empleado;
import Logica.Horario;
import Logica.Juego;
import Logica.Persona;
import Logica.Ticket;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    EmpleadoJpaController empleJPA = new EmpleadoJpaController();
    public void crearEmpleado (Empleado emple) {
        try {
            empleJPA.create(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    public void eliminarEmpleado (Empleado emple) {
        try {
            empleJPA.destroy(0);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarEmpleado (Empleado emple) {
        try {
            empleJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List <Empleado> mostrarEmpleados() {
        
        List <Empleado> listaEmpleados = empleJPA.findEmpleadoEntities();
        return listaEmpleados;
    }
    
    public Empleado buscarEmpleado () {
        
        Empleado emple = empleJPA.findEmpleado(0);
        return emple;
    }
    
    
    HorarioJpaController horarioJPA = new HorarioJpaController ();
    public void crearHorario (Horario hora) {
        try {
            horarioJPA.create(hora);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarHorario (Horario hora) {
        try {
            horarioJPA.destroy(0);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarHorario (Horario hora) {
        try {
            horarioJPA.edit(hora);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List <Horario> mostrarHorarios() {
        
        List <Horario> listaHorarios = horarioJPA.findHorarioEntities();
        return listaHorarios;
    }
    
    public Horario buscarHorario () {
        
        Horario horario = horarioJPA.findHorario(0);
        return horario;
    }
    
    
    JuegoJpaController juegoJPA = new JuegoJpaController ();
    public void crearJuego (Juego jue) {
        try {
            juegoJPA.create(jue);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void eliminarJuego (Juego jue) {
        try {
            juegoJPA.destroy(0);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarJuego (Juego jue) {
        try {
            juegoJPA.edit(jue);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List <Juego> mostrarJuegos() {
        
        List <Juego> listaJuegos = juegoJPA.findJuegoEntities();
        return listaJuegos;
    }
    
    public Juego buscarJuego () {
        
        Juego juego = juegoJPA.findJuego(0);
        return juego;
    }
    
    
    PersonaJpaController persoJPA = new PersonaJpaController ();
    public void crearPersona (Persona perso) {
        try {
            persoJPA.create(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPersona (Persona perso) {
        try {
            persoJPA.destroy(0);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarPersona (Persona perso) {
        try {
            persoJPA.edit(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <Persona> mostrarPersonas() {
        
        List <Persona> listaPersonas = persoJPA.findPersonaEntities();
        return listaPersonas;
    }
    
    public Persona buscarPersonas () {
        
        Persona persona = persoJPA.findPersona(0);
        return persona;
    }
    
    
    TicketJpaController ticketJPA = new TicketJpaController();
    public void crearTicket (Ticket tick) {
        try {
            ticketJPA.create(tick);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarTicket (Ticket tick) {
        try {
            ticketJPA.destroy(0);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarTicket (Ticket tick) {
        try {
            ticketJPA.edit(tick);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <Ticket> mostrarTickets() {
        
        List <Ticket> listaTickets = ticketJPA.findTicketEntities();
        return listaTickets;
    }
    
    public Ticket buscarTicket () {
        
        Ticket ticket = ticketJPA.findTicket(0);
        return ticket;
    }
    
    
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    public void crearUsuario (Usuario usu) {
        try {
            usuJPA.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarUsuario (Usuario usu) {
        try {
            usuJPA.destroy(0);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarUsuario (Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List <Usuario> mostrarUsuarios() {
        
        List <Usuario> listaUsuarios = usuJPA.findUsuarioEntities();
        return listaUsuarios;
    }
    
    public Usuario buscarUsuario () {
        
        Usuario usu = usuJPA.findUsuario(0);
        return usu;
    }
    
}
