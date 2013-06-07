/*
 * Main.java
 * 
 * Creada el 06 de Junio de 2013
 */
package Main;

import interfazUsuario.Login;
import interfazUsuario.PantallaPrincipal;

/**
 * Esta clase es la encargada de correr el programa de la ClinicaDental
 * @author JHumaran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Login login = new Login();
        login.setVisible(true);
    }
}
