/*
 * Material.java
 * 
 * Creada el 29 de Mayo de 2013
 */
package objetosNegocio;

/**
 * Esta clase contiene todos los metodos y atributos correspondientes a la clase
 * Material del proyecto clinicaDental
 * 
 * @author VictorManuel
 */
public class Material {
    
    private String clave;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double cantidad;
    private double costo;
    private String unidadMedida;
    
    /**
     * Inicializa el valor de los atributos al valor de sus parametros
     * @param clave
     * @param nombre
     * @param descripcion
     * @param categoria
     * @param cantidad
     * @param costo
     * @param unidadMedida 
     */
    public Material(String clave, String nombre, String descripcion, String categoria, double cantidad, double costo, String unidadMedida){
    this.clave = clave;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.categoria = categoria;
    this.cantidad = cantidad;
    this.costo = costo;
    this.unidadMedida = unidadMedida;
    }
    
    /**
     * Regresa la clave del material
     * @return Clave del material
     */
    public String getClave() {
        return clave;
    }

    /**
     * Establece la clave del material al valor de sus parametros
     * @param clave Clave del material
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Regresa el nombre del Material
     * @return Nombre del material
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del material al valor de sus parametros
     * @param nombre Nombre del material
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa la descripcion del material
     * @return Descripcion del material
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del material al valor de sus parametros
     * @param descripcion Decripcion del material
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Regresa la categoria del material
     * @return Categoria del material
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoria del material al valor de sus parametros
     * @param categoria Categoria del material
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Regresa la cantidad del material
     * @return Cantidad del material
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del material al valor de sus parametros
     * @param cantidad Cantidad del material
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Regresa el costo del material
     * @return Costo del material
     */
    public double getCosto(){
        return costo;
    }
    
    /**
     * Establece el costo del material al valor de sus parametros
     * @param costo Costo del material
     */
    public void setCosto(double costo){
        this.costo = costo;
    }
    
    /**
     * Regresa la unidad de medida del material
     * @return Unidad de medida
     */
    public String getUnidadMedida() {
        return unidadMedida;
    }

    /**
     * Establece la unidad de medida al valor de sus parametros
     * @param unidadMedida Unidad de medida
     */
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    /**
     * Regresa una cadena con los valores de los atributos de la clase
     * @return Cadena con los valores de los atributos de la clase
     */
    @Override
    public String toString() {
        return "Material: " + "Clave: " + clave + ", Nombre: " + nombre + ", Descripcion: " + descripcion + ", Categoria: " + categoria + 
                ", Cantidad: " + cantidad + ", Costo: " + costo + ", Unidad Medida: " + unidadMedida;
    }
}
