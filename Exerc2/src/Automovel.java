import java.util.Scanner;

public class Automovel {
    private double capacidadeTanque;
    private double volumeCombustivel;
    private double consumoMedio;
    private double velocidadeAtual;
    private double quilometragem;
    private int velocidadeMax;
    private double deslocamento;
    private double aceleracaoMedia;
    Scanner scan = new Scanner(System.in);

    public Automovel(double capacidadeTanque, double consumoMedio, double quilometragem, int velocidadeMax,
            double aceleracaoMedia) {
        this.capacidadeTanque = capacidadeTanque;
        this.consumoMedio = consumoMedio;
        this.quilometragem = quilometragem;
        this.velocidadeMax = velocidadeMax;
        this.aceleracaoMedia = aceleracaoMedia;
        this.deslocamento = 0;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getAceleracaoMedia() {
        return aceleracaoMedia;
    }

    public void setAceleracaoMedia(double aceleracaoMedia) {
        this.aceleracaoMedia = aceleracaoMedia;
    }

    public double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(double volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(double deslocamento) {
        this.deslocamento = deslocamento;
    }

    public void abastecerAutomovel(){
        System.out.printf("Qual custo do litro($): ");
        double precoLitro = scan.nextDouble();
        System.out.printf("valor que deseja abastecer($): ");
        double valorPago = scan.nextDouble();
        double quantLitros = valorPago/precoLitro;
        System.out.printf("Resultante: %f Litros\n\n", quantLitros);
        if(getVolumeCombustivel() + quantLitros > capacidadeTanque){
            System.out.println("Capacidade do tanque não suporta.");
        }else{
            setVolumeCombustivel((getVolumeCombustivel() + quantLitros));
        }
    }

    public void acelerarAutomovel() throws InterruptedException {
        System.out.printf("Quanto tempo deseja acelerar(segundos): ");
        int tempoAceleracao = scan.nextInt();
        double velocidadeInicial = getVelocidadeAtual(); //variavel usada no calculo do deslocamento.
        double distanciaAnterior = getDeslocamento(); //variavel usada para obter o consumo gasto.
        for(int a = 1; a <= tempoAceleracao; a++){
            calcularVelocidadeAtualAcelerando();
            System.out.printf("Velocidade Atual: %.3f m/s\n", getVelocidadeAtual());
            calcularDeslocamento(velocidadeInicial, 'a');
            System.out.printf("Distância Percorrida: %.3f metros.\n", getDeslocamento());
            velocidadeInicial = getVelocidadeAtual();
            calcularConsumo(distanciaAnterior);
            System.out.printf("Volume Combustivel: %.4f L.\n\n", getVolumeCombustivel());
            distanciaAnterior = getDeslocamento();
            Thread.sleep(1500);
        }
        setQuilometragem(getQuilometragem() + getDeslocamento());
    }

    public void frearAutomovel() throws InterruptedException {
        System.out.printf("Quanto tempo deseja frear(segundos): ");
        int tempoFrear = scan.nextInt();
        double velocidadeInicial; //variavel usada no calculo do deslocamento.
        double distanciaAnterior = getDeslocamento(); //variavel usada para obter o consumo gasto.
        for(int f = 1; f <= tempoFrear; f++){
            calcularVelocidadeAtualFreando();
            System.out.printf("Velocidade Atual: %.3f m/s\n", getVelocidadeAtual());
            velocidadeInicial = getVelocidadeAtual();
            calcularDeslocamento(velocidadeInicial, 'f');
            setQuilometragem(getQuilometragem() + (getDeslocamento() - distanciaAnterior));
            System.out.printf("Distância Percorrida: %.3f metros.\n", getDeslocamento());
            calcularConsumo(distanciaAnterior);
            System.out.printf("Volume Combustivel: %.4f L.\n\n", getVolumeCombustivel());
            distanciaAnterior = getDeslocamento();
            Thread.sleep(1500);
        }
    }


    private void calcularVelocidadeAtualAcelerando() {
        double velocidadeCalculada = getVelocidadeAtual() + (this.aceleracaoMedia * 1);
            if(velocidadeCalculada > velocidadeMax / 3.6){
                velocidadeCalculada = velocidadeMax / 3.6;
            }

        setVelocidadeAtual(velocidadeCalculada);
    }

    private void calcularVelocidadeAtualFreando(){
        double velocidadeCalculada = getVelocidadeAtual() - (this.aceleracaoMedia * 1);
            if(velocidadeCalculada < 0){
                velocidadeCalculada = 0;
                System.out.println("Carro em repouso!");
            }
            setVelocidadeAtual(velocidadeCalculada);
    }

    private void calcularDeslocamento(double velocidadeInicial, char comando) {
        double deslocamentoCalculado;
        if(comando == 'f' && velocidadeInicial == 0){
            deslocamentoCalculado = getDeslocamento();
        }else{
            deslocamentoCalculado = getDeslocamento() + velocidadeInicial + (aceleracaoMedia / 2);
        }
        setDeslocamento(deslocamentoCalculado);
    }

    private void calcularConsumo(double distanciaAnterior){
        double consumoCalculado = (getDeslocamento() - distanciaAnterior) / (consumoMedio * 1000);
        setVolumeCombustivel(getVolumeCombustivel() - consumoCalculado);
    }
}
