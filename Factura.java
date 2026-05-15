public class Factura {
    private double importe;

    public Factura(double importe) {
        this.importe = importe;
    }

    // Responsabilidad 1: Lógica de negocio
    public double calcularTotalConIVA() {
        return importe * 1.15;
    }

    public double getImporte() {
        return importe;
    }
}