public class App {
    public static void main(String[] args) throws Exception {
        Circulo c1 = new Circulo();
        c1.setRaio(c1.receberRaio());
        c1.setCoordXY(c1.receberCoordXY());
        c1.aumentarPercentual();
        System.out.printf("Novo Raio: %.2f\n", c1.getRaio());
        System.out.printf("Área do Circulo: %f\n", c1.areaCirculo());
        System.out.printf("Comprimento: %f\n", c1.comprimentoCircunferencia());
    }
}
