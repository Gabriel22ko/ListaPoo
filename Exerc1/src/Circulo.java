import java.util.Scanner;

public class Circulo {
    private float raio;
    private int[] coordXY = new int[2];
    private Scanner scan = new Scanner(System.in);

    Circulo(){
        this.raio = 0;
        this.coordXY[0] = 0;
        this.coordXY[1] = 0;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio > 0){
            this.raio = raio;
        }else{
            throw new Exception("O raio deve ser positivo!");
        }
    }

    public void getCoordXY() {
        System.out.printf("Coordenada X: %d\n", coordXY[0]);
        System.out.printf("Coordenada Y: %d\n", coordXY[1]);
    }

    public void setCoordXY(int[] coordXY) {
        this.coordXY[0] = coordXY[0];
        this.coordXY[1] = coordXY[1];
    }

    public float receberRaio() {
        System.out.printf("Informe o raio: ");
        float valor = scan.nextFloat();
        return valor;
    }

    public int[] receberCoordXY(){
        int valores[] = new int[2];
        System.out.printf("Informe a coordenada x: ");
        valores[0] = scan.nextInt();
        System.out.printf("Informe a coordenada y: ");
        valores[1] = scan.nextInt();
        return valores;
    }

    private float calcularPercentual(int percentual){
        return (this.raio * percentual)/100;
    }

    public void aumentarPercentual() throws Exception{
        System.out.printf("Quantos por cento deseja aumentar o raio: ");
        int percentual = scan.nextInt();
        setRaio(getRaio() + calcularPercentual(percentual));
    }

    public double areaCirculo(){
        return Math.PI * (raio * raio);
    }

    public double comprimentoCircunferencia(){
        return 2 * Math.PI * raio;
    }
}
