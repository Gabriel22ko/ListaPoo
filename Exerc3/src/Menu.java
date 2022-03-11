import java.util.Scanner;

public class Menu {
    public static int menuInicial(Scanner scan){
        System.out.println("---------------------MENU---------------------");
        System.out.println("1 -> Vender veículo.");
        System.out.println("2 -> Comprar veículo.");
        System.out.println("3 -> Listar Vendas de Carros.");
        System.out.println("4 -> Listar Compras de Carros.");
        System.out.println("5 -> Vender Moto.");
        System.out.println("6 -> Comprar Moto.");
        System.out.println("7 -> Listar Vendas de Moto.");
        System.out.println("8 -> Listar Compras de Moto.");
        System.out.println("9 -> Salvar/Criar arquivos de registro.");
        System.out.println("10 -> Sair.");
        System.out.println("----------------------------------------------");
        System.out.printf("Opção desejada: ");
        int opcao = scan.nextInt();
        return opcao;
    }

    public static void limparTela(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void pause(Scanner scanStrings){
        System.out.printf("\nPressione enter para continuar...");
        String entrada = scanStrings.nextLine();
    }
}
