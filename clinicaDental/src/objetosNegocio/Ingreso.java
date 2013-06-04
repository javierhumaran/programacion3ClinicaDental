/*
 * Ingreso.java
 * 
 * Creada el 29 de Mayo de 2013
 */
package objetosNegocio;

import objetosServicio.Fecha;

/**
 * Esta clase contiene todos los metodos y atributos correspondientes a la clase
 * Ingreso del proyecto clinicaDental.
 * 
 * @author JHumaran
 */
public class Ingreso {
    
    private Fecha fecha;
    private String concepto;
    private double cantidad;
    
    // Constructor vacio
    public Ingreso(){
    }
    
    /**
     * Regresa la fecha del ingreso
     * @return Fecha del ingreso
     */
    public Fecha getFecha(){
        return fecha;
    }
    
    /**
     * Establece la fecha del ingreso al valor de sus parametros
     * @param fecha Fecha del ingreso
     */
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    
    /**
     * Regresa el concepto del ingreso
     * @return Concepto del ingreso
     */
    public String getConcepto(){
        return concepto;
    }
    
    /**
     * Establece el concepto del ingreso al valor de sus parametros
     * @param concepto Concepto del ingreso
     */
    public void setConcepto(String concepto){
        this.concepto = concepto;
    }
    
    /**
     * Regresa la cantidad del ingreso
     * @return Cantidad del ingreso
     */
    public double getCantidad(){
        return cantidad;
    }
    
    /**
     * Establece la cantidad del ingreso al valor de sus parametros
     * @param cantidad Cantidad del ingreso
     */
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    /**
     * Regresa una cadena con los valores de los atributos de la clase
     * @return Cadena con los valores de los atributos de la clase
     */
    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Concepto: " + concepto + ", Cantidad: " + cantidad;
    }
}
