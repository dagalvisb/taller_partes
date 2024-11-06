import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat formater = new DecimalFormat("###,###.##");

        ParteSimple parteSimple = new ParteSimple("PS001", "Freno", 100000);
        ParteCompuesta parteCompuesta = new ParteCompuesta("PC001", "Motor", 3000000, 150000, "Ensamblaje de motor");

        System.out.println("Parte Simple:");
        System.out.println("Número: " + parteSimple.getNumero());
        System.out.println("Nombre: " + parteSimple.getNombre());
        System.out.println("Precio Base: $" + formater.format(parteSimple.getPrecioBase()));
        System.out.println("Precio con incremento: $" + formater.format(parteSimple.calcularPrecio()));

        System.out.println("\nParte Compuesta:");
        System.out.println("Número: " + parteCompuesta.getNumero());
        System.out.println("Nombre: " + parteCompuesta.getNombre());
        System.out.println("Precio Base: $" + parteCompuesta.getPrecioBase());
        System.out.println("Precio de Ensamble: $" + parteCompuesta.getPrecioEnsamble());
        System.out.println("Descripción del Proceso: " + formater.format(parteCompuesta.getDescripcionProceso()));
        System.out.println("Precio con incremento: $" + formater.format(parteCompuesta.calcularPrecio()));
    }
}
