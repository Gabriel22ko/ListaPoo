public class App {
    public static void main(String[] args) throws Exception {
        LimparTela.limparTela();
        Automovel car1 = new Automovel(100, 10, 0, 180, 3);
        car1.abastecerAutomovel();
        car1.acelerarAutomovel();
        car1.frearAutomovel();
    }
}
