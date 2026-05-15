public class App {
    public static void main(String[] args) {
        Factura factura = new Factura(1000.0);
        double total = factura.calcularTotalConIVA();

        System.out.println("Importe base: " + factura.getImporte());
        System.out.println("Total con IVA: " + total);

        FacturaRepository repository = new FacturaRepository();
        repository.guardar(factura);

        FacturaPrinter printer = new FacturaPrinter();
        printer.imprimir(factura);
    }
}
