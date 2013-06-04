/*
 * Trabajo.java
 * 
 * Creada el 29 de Mayo de 2013
 */
package objetosNegocio;

import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Material;

/**
 * Esta clase contiene todos los metodos y atributos correspondientes a la clase
 * Trabajo del proyecto clinicaDental
 * 
 * @author VictorManuel
 */
public class Trabajo {
    
    private String nombre;
    private List<Material> materiales;
    private boolean[] dientes = new boolean[48];
    private double costo;

    /**
     * Inicializa los atributos al valor de sus parametros
     * @param nombre
     * @param materiales
     * @param dientes
     * @param costo 
     */
    public Trabajo(String nombre, List<Material> materiales, boolean[] dientes, double costo){
        this.nombre = nombre;
        this.costo = costo;
        this.materiales = materiales;
        this.dientes = dientes;
    }
    
    /**
     * Regresa el nombre del trabajo
     * @return nombre del trabajo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor del nombre del trabajo al valor de sus parametros
     * @param nombre Nombre del trabajo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa la lista de materiales
     * @return lista de materiales
     */
    public List<Material> getMateriales() {
        return materiales;
    }

    /**
     * Regresa los dientes en los que se trabajo
     * @return los dientes en los que se trabajo
     */
    public boolean[] getDientes() {
        return dientes;
    }

    /**
     * Establece los dientes del trabajo al valor de sus parametros
     * @param dientes 
     */
    public void setDientes(boolean[] dientes) {
        this.dientes = dientes;
    }

    /**
     * Regresa el costo del trabajo
     * @return costo de trabajo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el valor del costo del trabajo al valor de sus parametros
     * @param costo Costo del trabajo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    /**
     * Regresa una cadena con los valores de los atributos de la clase
     * @return Cadena con los valores de los atributos de la clase
     */
    @Override
    public String toString() {
        return "Trabajo: " + "Nombre: " + nombre + ", Materiales: " + materiales + ", Dientes: " + dientes + ", Costo: " + costo;
    }
    
    
}
