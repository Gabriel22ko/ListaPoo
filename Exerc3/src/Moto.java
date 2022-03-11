import java.util.Scanner;

public class Moto extends Automovel {
    private double cilindradras;
    private double potenciaMax;

    public double getCilindradras() {
        return cilindradras;
    }
    public void setCilindradras(double cilindradras) {
        this.cilindradras = cilindradras;
    }
    public double getPotenciaMax() {
        return potenciaMax;
    }
    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public double registrarCilindradas(Scanner scanNum){
        System.out.printf("Cilindradas(cc): ");
        double cilindradrasMoto = scanNum.nextDouble();
        return cilindradrasMoto;
    }

    public double registrarPotenciaMax(Scanner scanNum){
        System.out.printf("Potência Máx: ");
        double potenciaMaxMoto = scanNum.nextDouble();
        return potenciaMaxMoto;
    }

    public void cadastrarMoto(Moto moto, Scanner scanNum, Scanner scanStrings){
        Menu.limparTela();
        moto.setNomeAutomovel(moto.registrarNomeAutomovel(scanStrings));
        moto.setPlacaAutomovel(moto.registrarPlacaAutomovel(scanStrings)); 
        moto.setAnoAutomovel(moto.registrarAnoAutomovel(scanNum));
        moto.setQuilometragemAutomovel(moto.registrarQuilometragemAutomovel(scanNum));
        moto.setCilindradras(moto.registrarCilindradas(scanNum));
        moto.setPotenciaMax(moto.registrarPotenciaMax(scanNum));
        moto.setCorAutomovel(moto.registrarCorAutomovel(scanStrings));
        moto.setPrecoAutomovel(moto.registrarPrecoAutomovel(scanNum));
        moto.setNomeProprietario(moto.registrarNomeProprietario(scanStrings, 'v'));
        System.out.println("Venda Inserida!");
    }
}
