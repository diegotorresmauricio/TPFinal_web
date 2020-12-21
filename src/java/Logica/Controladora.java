package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
public void crearEmpleado (Empleado emple) {
    controlPersis.crearEmpleado(emple);
}

public void eliminarEmpleado (Empleado emple) {
    controlPersis.eliminarEmpleado(emple);
}

public void editarEmpleado (Empleado emple) {
    controlPersis.editarEmpleado(emple);
}

public void listarEmpleados (Empleado emple) {
    controlPersis.mostrarEmpleados();
}

public void buscarEmpleado (Empleado emple) {
    controlPersis.buscarEmpleado();
}

public void crearHorario (Horario hora) {
    controlPersis.crearHorario(hora);
}

public void eliminarHorario (Horario hora) {
    controlPersis.eliminarHorario(hora);
}

public void editarHorario (Horario hora) {
    controlPersis.editarHorario(hora);
}

public void listarHorarios (Horario hora) {
    controlPersis.mostrarHorarios();
}

public void buscarHorario (Horario hora) {
    controlPersis.buscarHorario();
}

public void crearJuego (Juego jue) {
    controlPersis.crearJuego(jue);
}

public void eliminarJuego (Juego jue) {
    controlPersis.eliminarJuego(jue);
}

public void editarJuego (Juego jue) {
    controlPersis.editarJuego(jue);
}

public void listarJuegos (Juego jue) {
    controlPersis.mostrarJuegos();
}

public void buscarJuego (Juego jue) {
    controlPersis.buscarJuego();
}

public void crearCliente (Cliente cli) {
    controlPersis.crearCliente(cli);
}

public void eliminarCliente (Cliente cli) {
    controlPersis.eliminarCliente(cli);
}

public void editarCliente (Cliente cli) {
    controlPersis.editarCliente(cli);
}

public void listarCliente (Cliente cli) {
    controlPersis.mostrarClientes();
}

public void buscarCliente (Cliente cli) {
    controlPersis.buscarCliente();
}

public void crearTicket (Ticket tick) {
    controlPersis.crearTicket(tick);
}

public void eliminarTicket (Ticket tick) {
    controlPersis.eliminarTicket(tick);
}

public void editarTicket (Ticket tick) {
    controlPersis.editarTicket(tick);
}

public void listarTicket (Ticket tick) {
    controlPersis.mostrarTickets();
}

public void buscarTicket (Ticket tick) {
    controlPersis.buscarTicket();
}


public void crearUsuario (Usuario usu) {
    controlPersis.crearUsuario(usu);
}

public void eliminarUsuario (Usuario usu) {
    controlPersis.eliminarUsuario(usu);
}

public void editarUsuario (Usuario usu) {
    controlPersis.editarUsuario(usu);
}

public void listarUsuario (Usuario usu) {
    controlPersis.mostrarUsuarios();
}

public void buscarUsuario (Usuario usu) {
    controlPersis.buscarUsuario();
}

    public boolean comprobarIngreso(String usuario, String contra) {
        
        boolean siONo = false;
        List <Usuario> listaUsuarios = new ArrayList <Usuario> ();
        listaUsuarios = controlPersis.mostrarUsuarios();
        
        for (Usuario usu:listaUsuarios) {
            if (usu.getNombre_usuario().equals(usuario) && usu.getContrasenia().equals(contra)) {
                siONo = true;
                return siONo;
            }
            
        }
        return siONo;
    }

    public void crearEmpleado(String dni, String nombre, String apellido, String cargo) {
        
        Empleado emple = new Empleado();
        
        emple.setDni(dni);
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setCargo(cargo);
        
        controlPersis.crearEmpleado(emple);
        
    }

    public void crearUsuario(String usuario, String contra) {
       
        Usuario usu = new Usuario();
        
        usu.setNombre_usuario(usuario);
        usu.setContrasenia(contra);
        
        controlPersis.crearUsuario(usu);
    }


    public void crearHorario(String inicio, String fin) {
        Horario hora = new Horario();
        
        hora.setHoraInicio(inicio);
        hora.setHoraFin(fin);
        
        controlPersis.crearHorario(hora);
    }

    public void eliminarHorario(String inicio, String fin) {
       
    }

    public void editarHorario(String inicio, String fin) {
     
    }

    public void buscarHorario(String inicio, String fin) {
        Horario buscar = new Horario();
        
        buscar.getHoraInicio();
        buscar.getHoraFin();
        
        controlPersis.buscarHorario();
    }

    public void crearCliente(String dni, String nombre, String apellido) {
        Cliente cli = new Cliente();
        
        cli.getDni();
        cli.getNombre();
        cli.getApellido();
        
        controlPersis.crearCliente(cli);
    }

    public void eliminarCliente(String dni, String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editarCliente(String dni, String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void buscarCliente(String dni, String nombre, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
