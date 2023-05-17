/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.util.ArrayList;
import java.util.List;



public class Banc {

    private ArrayList<Usuario> usuarios;
    private Usuario usuariActual;

    public Banc() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("user1", "contraseña1", "Joan", "García Fernàndez","54084799S","EL9234013865102654781208","4202728412227757",3500, 1200,2500));
        usuarios.add(new Usuario("user2", "contraseña2", "Marc", "Gómez Martínez","46783456F","ES4520858343195898054937", "4046021858846672", 2700, 1070, 2800));
        usuarios.add(new Usuario("user3", "contraseña3", "Jordi", "Verges Jimenez","54783457D","ES7502391215116358414766", "4120606673765815", 3040,1120, 2000));
        usuarios.add(new Usuario("user4", "contraseña4", "Alicia", "Marquez Sanchez","46783456G","ES4100119674480891876465", "4200832023470665", 2670,1170, 2100));
        usuarios.add(new Usuario("eloy", "banc", "Eloy", "Blasco Tortajada","54080799W","EL92340138651026547", "4388585760455711", 3800,1150, 1800));
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void iniciarSesion(String Username, String contrasenya) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(Username) && usuario.getPassword().equals(contrasenya)) {
                Usuario usuarioActivo = usuario;
                System.out.println("El usuario " + usuarioActivo.getUsername() + " ha iniciado sesión.");
                return;
            }
        }
        System.out.println("Error: El usuario o la contraseña son incorrectos.");
    }

    public Usuario getUsuariActual() {
        return usuariActual;
    }

    public void setUsuariActual(Usuario usuariActual) {
        this.usuariActual = usuariActual;
    }

    public static void main(String[] args) {
        Usuario u = App.banc.getUsuariActual();
        Banc banc = new Banc();
        banc.iniciarSesion("user1", "contraseña1");
        banc.iniciarSesion("user2", "contraseña2");
        banc.iniciarSesion("user3", "contraseña3");
        banc.iniciarSesion("user4", "contraseña4");
        banc.iniciarSesion("eloy", "banc");

        // Realizar un ingreso
        String nom_client = u.getNom_client();
        String tipusMov = "Ingreso";
        double saldo = u.getSaldo();
        String data = obtenerFechaActual();

        // Crear una instancia del movimiento de ingreso
        Movimiento movimientoIngreso = new Movimiento(nom_client, tipusMov, saldo, obtenerFechaActual());
        // Agregar el movimiento de ingreso a la lista MOV
        Movimiento.MOV.add(movimientoIngreso);
        
        // Realizar una transferencia
nom_client = u.getNom_client();
 tipusMov = "Transferencia";
 saldo = u.getSaldo();
 data = obtenerFechaActual();

// Crear una instancia del movimiento de transferencia
Movimiento movimientoTransferencia = new Movimiento(nom_client, tipusMov, saldo, obtenerFechaActual());
// Agregar el movimiento de transferencia a la lista MOV
Movimiento.MOV.add(movimientoTransferencia);

// Realizar una extracción
nom_client = u.getNom_client();
tipusMov = "Extracción";
saldo = u.getSaldo();
data = obtenerFechaActual();

// Crear una instancia del movimiento de extracción
Movimiento movimientoExtraccion = new Movimiento(nom_client, tipusMov, saldo, obtenerFechaActual());
// Agregar el movimiento de extracción a la lista MOV
Movimiento.MOV.add(movimientoExtraccion);

// Llamar al método guardarMovs()
        Movimiento.guardarMovs();
    }

    public static String obtenerFechaActual() {
        return "2023-05-17";
    }
}

    
    
       

    

   

   
    

    


    
    
   
    

