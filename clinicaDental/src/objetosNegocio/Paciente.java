/*
 * Paciente.java
 * 
 * Creada el 29 de Mayo de 2013
 */
package objetosNegocio;

import java.awt.List;
import java.util.ArrayList;
import java.util.Objects;
import objetosServicio.Fecha;
import objetosNegocio.Ingreso;

/**
 * Esta clase contiene todos los metodos y atributos correspondientes a la clase
 * Paciente del proyecto clinicaDental
 * 
 * @author JHumaran
 */
public class Paciente {
    
    private String clave;
    private Fecha fechaAlta;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Fecha fechaNacimiento;
    private char genero;
    private String celular;
    private String direccion;
    private String email;
    private ArrayList<Ingreso> ingresos;
    private ArrayList<Consulta> consultas;
    
    
    /**
     * Inicializa el valor de los atributos al valor de sus parametros
     * @param fechaAlta
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param fechaNacimiento
     * @param genero 
     */
    public Paciente(Fecha fechaAlta, String nombre, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, char genero){
        this.fechaAlta = fechaAlta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    /**
     * Regresa la clave del cliente
     * @return Clave del cliente
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece el valor de la clave del cliente al valor de sus parametros
     * @param clave Clave del cliente
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    /**
     * Regresa la fecha de alta del Cliente
     * @return Fecha de Alta
     */
    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Establece la fecha de alta al valor de sus parametros
     * @param fechaAlta Fecha de Alta
     */
    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    /**
     * Regresa el nombre del Cliente
     * @return Nombre del Cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente al valor de sus parametros
     * @param nombre Nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el Apellido Paterno del Cliente
     * @return Apellido Paterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el Apellido Paterno al valor de sus parametros
     * @param apellidoPaterno Apellido Paterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Regresa el Apellido Materno del Cliente
     * @return Apellido Materno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el Apellido Materno al valor de sus parametros
     * @param apellidoMaterno Apellido Materno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Regresa la Fecha de Nacimiento del Cliente
     * @return Fecha de Nacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la Fecha de Nacimiento al valor de sus parametros
     * @param fechaNacimiento Fecha de Nacimiento
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa el genero del Cliente
     * @return Genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el genero al valor de sus parametros
     * @param genero Genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Regresa el celular del Cliente
     * @return Celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Establece el celular del cliente al valor de sus parametros
     * @param celular Celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Regresa la direccion del cliente
     * @return Direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la direccion del cliente al valor de sus parametros
     * @param direccion Direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Regresa el email del Cliente
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del Cliente al valor de sus parametros
     * @param email Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Regresa una lista con los ingresos del Cliente
     * @return Lista de Ingresos
     */
    public ArrayList<Ingreso> listaIngresos() {
        return ingresos;
    }

    /**
     * Regresa una lista con las consultas del Cliente
     * @return Lista de Consultas
     */
    public ArrayList<Consulta> listaConsultas() {
        return consultas;
    }

    /**
    * Regresa el codigo hash asociado a una instancia de esta clase. El
    * codigo hash es el mismo entero para dos medios que son iguales
    * bajo el metodo equals().
    * @return El codigo hash asociado a una instancia de esta clase
    */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.clave);
        return hash;
    }

    /**
    * Este método compara este medio con el objeto del parámetro
    * @param obj Objeto contra el que se compara este medio
    * @return Veradero si el objeto del parámetro es de la clase Medio
    * y ambos tienen la misma clave, falso en caso contrario.
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        return true;
    }

    /**
     * Regresa una cadena con los valores de los atributos de la clase
     * @return Cadena con los valores de los atributos
     */
    @Override
    public String toString() {
        return "Clave: " + clave + ", Fecha de Alta: " + fechaAlta + ", Nombre: " + nombre + ", Apellido Paterno: " + apellidoPaterno +
                ", Apellido Materno: " + apellidoMaterno + ", Fecha de Nacimiento: " + fechaNacimiento + ", Genero: " + genero + ", Celular: " + 
                celular + ", Direccion: " + direccion + ", Email: " + email;
    }
}
