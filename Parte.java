public class Parte {
    protected String numero;
    protected String nombre;
    protected double precioBase;

    // Constructor
    public Parte(String numero, String nombre, double precioBase) {
        this.numero = numero;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Getters y setters
    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}