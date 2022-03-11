import java.io.Serializable;
import java.util.Scanner;

public abstract class Automovel implements Serializable {
    private String nomeAutomovel;
    private String placaAutomovel;
    private String corAutomovel;
    private int anoAutomovel;
    private double quilometragemAutomovel;
    private double precoAutomovel;
    private String nomeProprietario;

    public String getNomeAutomovel() {
        return nomeAutomovel;
    }

    public void setNomeAutomovel(String nomeAutomovel) {
        this.nomeAutomovel = nomeAutomovel;
    }

    public String getPlacaAutomovel() {
        return placaAutomovel;
    }

    public void setPlacaAutomovel(String placaAutomovel) {
        this.placaAutomovel = placaAutomovel;
    }

    public String getCorAutomovel() {
        return corAutomovel;
    }

    public void setCorAutomovel(String corAutomovel) {
        this.corAutomovel = corAutomovel;
    }

    public int getAnoAutomovel() {
        return anoAutomovel;
    }

    public void setAnoAutomovel(int anoAutomovel) {
        this.anoAutomovel = anoAutomovel;
    }

    public double getQuilometragemAutomovel() {
        return quilometragemAutomovel;
    }

    public void setQuilometragemAutomovel(double quilometragemAutomovel) {
        this.quilometragemAutomovel = quilometragemAutomovel;
    }

    public double getPrecoAutomovel() {
        return precoAutomovel;
    }

    public void setPrecoAutomovel(double precoAutomovel) {
        this.precoAutomovel = precoAutomovel;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String registrarNomeProprietario(Scanner scan, char vendaOuCompra){
        if(vendaOuCompra == 'c'){
            System.out.printf("Comprador: ");
            String nomePessoa = scan.nextLine();
            return nomePessoa;
        }else{
            System.out.printf("Proprietário: ");
            String nomePessoa = scan.nextLine();
            return nomePessoa;
        }
    }

    public String registrarNomeAutomovel(Scanner scan){
        System.out.printf("Nome/modelo: ");
        String nomeAutomovel = scan.nextLine();
        return nomeAutomovel;
    }

    public String registrarPlacaAutomovel(Scanner scan){
        System.out.printf("Placa: ");
        String placaAutomovel = scan.nextLine();
        return placaAutomovel;
    }

    public String registrarCorAutomovel(Scanner scan){
        System.out.printf("Cor: ");
        String corAutomovel = scan.nextLine();
        return corAutomovel;
    }

    public int registrarAnoAutomovel(Scanner scan){
        System.out.printf("Ano: ");
        int anoAutomovel = scan.nextInt();
        return anoAutomovel;   
    }

    public double registrarQuilometragemAutomovel(Scanner scan){
        System.out.printf("Km's rodados(KM): ");
        double kmAutomovel = scan.nextDouble();
        return kmAutomovel;
    }

    public double registrarPrecoAutomovel(Scanner scan){
        System.out.printf("Preço($): ");
        double precoAutomovel = scan.nextDouble();
        return precoAutomovel;
    }
}
