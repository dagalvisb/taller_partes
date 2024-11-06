class ParteCompuesta extends Parte {
    private double precioEnsamble;
    private String descripcionProceso;

    public ParteCompuesta(String numero, String nombre, double precioBase, double precioEnsamble, String descripcionProceso) {
        super(numero, nombre, precioBase);
        this.precioEnsamble = precioEnsamble;
        this.descripcionProceso = descripcionProceso;
    }

    public double calcularPrecio() {
        return (precioBase + precioEnsamble) * 1.11;
    }

    public double getPrecioEnsamble() {
        return precioEnsamble;
    }

    public String getDescripcionProceso() {
        return descripcionProceso;
    }
}