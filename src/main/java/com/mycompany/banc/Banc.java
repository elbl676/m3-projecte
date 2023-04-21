/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Banc {
    
    
  
    private ArrayList<Usuario> usuarios;
    
    private Usuario usuariActual;

    public Banc() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("user1", "contraseña1", "Joan", "García Fernàndez","54080799W","EL9234013865102654781208"));
        usuarios.add(new Usuario("user2", "contraseña2", "Marc", "Gómez Martínez","46783456F","ES4520858343195898054937"));
        usuarios.add(new Usuario("user3", "contraseña3", "Jordi", "Verges Jimenez","54783457D","ES7502391215116358414766"));
        usuarios.add(new Usuario("user4", "contraseña4", "Alicia", "Marquez Sanchez","46783456G","ES4100119674480891876465"));
        usuarios.add(new Usuario("eloy", "banc", "Eloy", "Blasco Tortajada","54080799W","EL92340138651026547"));
        
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
   public void iniciarSesion(String Username, String contrasenya) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(Username) && usuario.getPassword().equals(contrasenya)) {
                Usuario usuarioActivo = usuario; // asigna el usuario correspondiente a la variable usuarioActivo
                System.out.println("El usuario " + usuarioActivo.getUsername() + " ha iniciado sesión.");
                return;
            }
        }
        // Si llegamos aquí, es porque la autenticación falló
        System.out.println("Error: El usuario o la contraseña son incorrectos.");
    }

    public Usuario getUsuariActual() {
        return usuariActual;
    }

    public void setUsuariActual(Usuario usuariActual) {
        this.usuariActual = usuariActual;
    }

   

    public static void main(String[] args) {
        Banc banc = new Banc();
        banc.iniciarSesion("user1", "contraseña1");
        banc.iniciarSesion("user2", "contraseña2");
        banc.iniciarSesion("user3", "contraseña3");
        banc.iniciarSesion("user4", "contraseña4");
        banc.iniciarSesion("eloy", "banc");
        
    }
    
}

    
    
   
    

