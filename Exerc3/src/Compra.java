import java.util.ArrayList;
import java.util.Scanner;

public class Compra {

    public static void listarCarrosParaCompra(ArrayList<Carro> automoveisDisponiveis){
        int cont = 0;
        for (Carro automovel : automoveisDisponiveis) {
            System.out.printf("\t\t\t\t\t\tCARRO %d\n",cont + 1);
            System.out.printf("\t\t\t\t\t\t-------\n");
            System.out.printf("Nome: %s\tCategória: %s\tPlaca: %s\tAno: %d\tKm's: %.2f\tCor: %s\tPreço: %.2f\tProprietario: %s\n",
            automovel.getNomeAutomovel(), automovel.getCategoriaCarro(), automovel.getPlacaAutomovel(),
            automovel.getAnoAutomovel(), automovel.getQuilometragemAutomovel(), automovel.getCorAutomovel(),
            automovel.getPrecoAutomovel(), automovel.getNomeProprietario()); 
            cont++;
        }
    }

    public static void listarComprasDeCarros(ArrayList<Carro> automoveisComprados){
        int cont = 0;
        for (Carro automovel : automoveisComprados) {
            System.out.printf("\t\t\t\t\t\tCARRO %d\n",cont + 1);
            System.out.printf("\t\t\t\t\t\t-------\n");
            System.out.printf("Nome: %s\tCategória: %s\tPlaca: %s\tAno: %d\tKm's: %.2f\tCor: %s\tPreço: %.2f\tComprador: %s\n",
            automovel.getNomeAutomovel(), automovel.getCategoriaCarro(), automovel.getPlacaAutomovel(),
            automovel.getAnoAutomovel(), automovel.getQuilometragemAutomovel(), automovel.getCorAutomovel(),
            automovel.getPrecoAutomovel(), automovel.getNomeProprietario()); 
            cont++;
        }
    }

    public static void listarMotosParaCompra(ArrayList<Moto> automoveisDisponiveis){
        int cont = 0;
        for (Moto automovel : automoveisDisponiveis) {
            System.out.printf("\t\t\t\t\t\tMOTO %d\n",cont + 1);
            System.out.printf("\t\t\t\t\t\t-------\n");
            System.out.printf("Nome: %s\tCilindradas: %.2f\tPlaca: %s\tAno: %d\tKm's: %.2f\n",
            automovel.getNomeAutomovel(), automovel.getCilindradras(), automovel.getPlacaAutomovel(), 
            automovel.getAnoAutomovel(), automovel.getQuilometragemAutomovel());
            System.out.printf("Potência Máx: %.2f\tPreço: %.2f\t Comprador: %s\n", 
            automovel.getPotenciaMax(), automovel.getPrecoAutomovel(), automovel.getNomeProprietario());
            cont++;
        }
    }

    public static void listarComprasDeMoto(ArrayList<Moto> automoveisComprados){
        int cont = 0;
        for (Moto automovel : automoveisComprados) {
            System.out.printf("\t\t\t\t\t\tMOTO %d\n",cont + 1);
            System.out.printf("\t\t\t\t\t\t-------\n");
            System.out.printf("Nome: %s\tCilindradas: %.2f\tPlaca: %s\tAno: %d\tKm's: %.2f\n",
            automovel.getNomeAutomovel(), automovel.getCilindradras(), automovel.getPlacaAutomovel(), 
            automovel.getAnoAutomovel(), automovel.getQuilometragemAutomovel());
            System.out.printf("Potência Máx: %.2f\tPreço: %.2f\t Comprador: %s\n", 
            automovel.getPotenciaMax(), automovel.getPrecoAutomovel(), automovel.getNomeProprietario());
            cont++;
        }
    }

    public static int selecionarAutomovelCompra(Scanner scan, int tamanhoListaDeAutomoveis){
        int carroEscolhido;
        do{
            System.out.printf("\nQual número do automóvel que deseja comprar: ");
            carroEscolhido = scan.nextInt();
        }while(carroEscolhido < 1 || carroEscolhido > tamanhoListaDeAutomoveis);

        carroEscolhido -= 1;
        return carroEscolhido;
    }

    public static void mensagemSucesso(){
        System.out.println("Compra Realizada!");
    }
}
