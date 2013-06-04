/*
 * Consulta.java
 * 
 * Creada el 29 de Mayo de 2013
 */
package objetosNegocio;

import java.util.List;
import objetosServicio.Fecha;

/**
 * Esta clase contiene todos los metodos y atributos correspondientes a la clase
 * Consulta del proyecto clinicaDental
 * 
 * @author VictorManuel
 */
public class Consulta {
    
    private int folio;
    private Fecha fecha;
    private List<Trabajo> trabajos;
    private double costo;
    
    /**
     * Inicializa el valor de los atributos al valor de sus parametros
     * @param folio
     * @param fecha
     * @param trabajos
     * @param costo
     */
    public Consulta(int folio, Fecha fecha, List<Trabajo> trabajos, double costo){
        this.folio = folio;
        this.fecha = fecha;
        this.trabajos = trabajos;
        this.costo = costo;
    }

    /**
     * Regresa el folio de la consulta
     * @return Folio de la consulta
     */
    public int getFolio() {
        return folio;
    }

    /**
     * Establece el valor de folio de la consulta al valor de sus parametros
     * @param folio folio de la consulta
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * Regresa la fecha de la consulta
     * @return Fecha de la consulta
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Establece el valor de la fecha de la consulta al valor de sus parametros
     * @param fecha de la consulta
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    /**
     * Regresa la lista de trabajos de de la consulta
     * @return la lista de trabajos
     */
    public List<Trabajo> getTrabajos() {
        return trabajos;
    }

    /**
     * Regresa el costo de la consulta
     * @return costo de la consulta
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el valor del costo de la consulta al valor de sus parametros
     * @param costo costo de la consulta
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
        return "Consulta: " + "Folio: " + folio + ", Fecha: " + fecha + ", Trabajos: " + trabajos + ", Costo: " + costo;
    }
    
}
