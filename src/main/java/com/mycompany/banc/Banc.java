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

    public Banc() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("user1", "contraseña1"));
        usuarios.add(new Usuario("user2", "contraseña2"));
        usuarios.add(new Usuario("user3", "contraseña3"));
        usuarios.add(new Usuario("user4", "contraseña4"));
        
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    
   
    
}
