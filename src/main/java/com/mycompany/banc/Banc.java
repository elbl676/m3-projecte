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

  
/*
* Construeix un Banc amb una llista predeterminada d'usuaris.
*/
    public Banc() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("user1", "contraseña1", "Joan", "García Fernàndez","54084799S","EL9234013865102654781208","4202728412227757",3500, "import_factures",1200));
        usuarios.add(new Usuario("user2", "contraseña2", "Marc", "Gómez Martínez","46783456F","ES4520858343195898054937", "4046021858846672", 2700, "import_factures", 1070));
        usuarios.add(new Usuario("user3", "contraseña3", "Jordi", "Verges Jimenez","54783457D","ES7502391215116358414766", "4120606673765815", 3040, "import_factures",1120));
        usuarios.add(new Usuario("user4", "contraseña4", "Alicia", "Marquez Sanchez","46783456G","ES4100119674480891876465", "4200832023470665", 2670, "import_factures",1170));
        usuarios.add(new Usuario("eloy", "banc", "Eloy", "Blasco Tortajada","54080799W","EL92340138651026547", "4388585760455711", 3800, "import_factures",1150));
        
    }

    /**
 *
Retorna la llista d'usuaris.
* @retorna la llista d'usuaris
*/
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

   
/*
* Autentica l'usuari amb el nom d'usuari i contrasenya donats i estableix el
* usuari autenticat com a usuari actiu.
* @param username el nom d'usuari de l'usuari a autenticar
* @param password la contrasenya de l'usuari a autenticar
*/

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

    /**
 *
Retorna l'usuari actiu.
* @return l'usuari actiu
 */
    public Usuario getUsuariActual() {
        return usuariActual;
    }

   /**
 * 
Estableix l'usuari actiu.
* @param usuariActual l'usuari actiu
*/
    public void setUsuariActual(Usuario usuariActual) {
        this.usuariActual = usuariActual;
    }

   /**
 *
El mètode main crea un objecte Banc i registra alguns usuaris.
* @param args els arguments de la línia de comandos
*/
    public static void main(String[] args) {
        Banc banc = new Banc();
        banc.iniciarSesion("user1", "contraseña1");
        banc.iniciarSesion("user2", "contraseña2");
        banc.iniciarSesion("user3", "contraseña3");
        banc.iniciarSesion("user4", "contraseña4");
        banc.iniciarSesion("eloy", "banc");
        
    }
    
}

    
    
   
    

