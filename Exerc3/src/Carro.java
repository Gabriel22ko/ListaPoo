import java.util.Scanner;

public class Carro extends Automovel {
    private String categoriaCarro;

    public String getCategoriaCarro() {
        return categoriaCarro;
    }

    public void setCategoriaCarro(int valorTipoCarro) {
        if(valorTipoCarro == 1){
            this.categoriaCarro = "HATCH";
        }else if(valorTipoCarro == 2){
            this.categoriaCarro = "SEDAN";
        }else if(valorTipoCarro == 3){
            this.categoriaCarro = "CAMINHONETE";
        }else if(valorTipoCarro == 4){
            this.categoriaCarro = "SUV";
        }
    }

    public int registrarCategoriaCarro(Scanner scan) {
        int valorTipoCarro = 0;
        exibirCategorias();
        do{
            System.out.printf("Categoria do carro: ");
            valorTipoCarro = scan.nextInt();
        }while(valorTipoCarro < 1 || valorTipoCarro > 4);
        return valorTipoCarro;
    }

    private void exibirCategorias(){
        System.out.println("[1] -> HATCH");
        System.out.println("[2] -> SEDAN");
        System.out.println("[3] -> CAMINHONETE");
        System.out.println("[4] -> SUV");
    }

    public void cadastrarCarro(Carro carro, Scanner scanStrings, Scanner scanNum){
        carro.setCategoriaCarro(carro.registrarCategoriaCarro(scanNum));
        Menu.limparTela();
        carro.setNomeAutomovel(carro.registrarNomeAutomovel(scanStrings));
        carro.setPlacaAutomovel(carro.registrarPlacaAutomovel(scanStrings)); 
        carro.setAnoAutomovel(carro.registrarAnoAutomovel(scanNum));
        carro.setQuilometragemAutomovel(carro.registrarQuilometragemAutomovel(scanNum));
        carro.setCorAutomovel(carro.registrarCorAutomovel(scanStrings));
        carro.setPrecoAutomovel(carro.registrarPrecoAutomovel(scanNum));
        carro.setNomeProprietario(carro.registrarNomeProprietario(scanStrings, 'v'));
        System.out.println("Venda Inserida!");
    }
}
