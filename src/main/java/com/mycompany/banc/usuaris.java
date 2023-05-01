/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banc;


import java.io.IOException;
import java.util.ArrayList;




import java.util.ArrayList;


/*
* La classe usuaris representa un grup d'usuaris.
*
* @autor alumne
*/
public class usuaris {

/*
* Crea un nou objecte usuaris amb el nom d'usuari i contrasenya donats.
*
* @param usuari El nom d'usuari de l'usuari.
* @param contrasenya La contrasenya de l'usuari.
*/
    public usuaris(String usuario, String contrasenya) {
    }

/*
* Aquest mètode encara no està suportat.
*
* @return Sempre llança una UnsupportedOperationException.
*/
    private boolean getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   

/*
* The Usuari class represents a single user with a username and password.
*/
   public class Usuario {
    private String username;
    private String password;

/*
* Crea un nou objecte Usuari amb el nom d'usuari i contrasenya donats.
*
* @param username El nom d'usuari de l'usuari.
* @param password La contrasenya de l'usuari.
*/
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

/*
* Obté el nom d'usuari de l'usuari.
*
* @return El nom d'usuari de l'usuari.
*/
    public String getUsername() {
        return username;
    }

/*
* Obté la contrasenya de l'usuari.
*
* @return La contrasenya de l'usuari.
*/
    public String getPassword() {
        return password;
    }
    /*
* La classe Usuaris representa una col·lecció d'objectes Usuari.
*/
    public class Usuarios {
    private ArrayList<Usuario> usuarios;

/*
* Crea un nou objecte Usuaris amb quatre objectes Usuari.
*/
    public Usuarios() {
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("user1", "contraseña1"));
        usuarios.add(new Usuario("user2", "contraseña2"));
        usuarios.add(new Usuario("user3", "contraseña3"));
        usuarios.add(new Usuario("user4", "contraseña4"));
    }
    /*
* La classe Usuari representa un usuari amb un nom d'usuari i una contrasenya.
*/
    public class Usuari {
    private String username;
    private String password;

/*
* Crea un nou objecte Usuari amb el nom d'usuari i contrasenya donats.
*
* @param username El nom d'usuari de l'usuari.
* @param password La contrasenya de l'usuari.
*/
    public Usuari(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Métodos getters y setters
    
    private String usuario;
    private String contrasenya;
     private ArrayList<usuaris> listaUsuarios = new ArrayList<>();
     
/*
* Afegeix un nou usuari a la llista d'usuaris.
*
* @param usuari El nom d'usuari de l'usuari a afegir.
* @param contrasenya La contrasenya de l'usuari a afegir.
*/
     public void agregarUsuario(String usuario, String contrasenya) {
    usuaris usuari = new usuaris(usuario, contrasenya);
    listaUsuarios.add(usuari);
     for (usuaris usuaris : listaUsuarios) {
    System.out.println(usuari.getNombre());
}
}

/*
* Obté el nom d'usuari de l'usuari.
*
* @return El nom d'usuari de l'usuari.
*/
            public String getUsuario() {
                return usuario;
            }

    
    

    
}
    }

}

/*
* Inicia la sessió de l'usuari i estableix l'arrel de l'aplicació.
*
* @throws IOException Si hi ha un error en establir l'arrel de l'aplicació.
*/
     private void login() throws IOException {
 App.setRoot("secondry1");
}

    }

    



    

   


    
 

    

    

    


