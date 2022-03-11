import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanStrings = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        ArrayList<Carro> carrosParaVenda = new ArrayList<Carro>();
        ArrayList<Carro> carrosVendidos = new ArrayList<Carro>();
        ArrayList<Carro> carrosComprados = new ArrayList<Carro>();
        ArrayList<Moto> motosDisponiveis = new ArrayList<Moto>();
        ArrayList<Moto> motosVendidas = new ArrayList<Moto>();
        ArrayList<Moto> motosCompradas = new ArrayList<Moto>();
        int opcaoMenu;

        do{
        Menu.limparTela();
        opcaoMenu = Menu.menuInicial(scanNum);
        switch(opcaoMenu){
            case 1:
                Menu.limparTela();
                Carro car1 = new Carro();
                car1.cadastrarCarro(car1, scanStrings, scanNum);
                carrosVendidos.add(car1);
                carrosParaVenda.add(car1);
                PersistirArquvos.registrarVendasDeCarroSerializado(carrosVendidos);
                PersistirArquvos.registrarCarrosDisponiveisSerializado(carrosParaVenda);
                Thread.sleep(2000);
                Menu.limparTela();
                break;
            case 2:
                Menu.limparTela();
                carrosParaVenda = LerArquivos.lerCarrosParaVenda(carrosParaVenda);
                Compra.listarCarrosParaCompra(carrosParaVenda);
                int indexCarroSelecionado = Compra.selecionarAutomovelCompra(scanNum, carrosParaVenda.size());
                carrosParaVenda.get(indexCarroSelecionado).setNomeProprietario(carrosParaVenda.
                get(indexCarroSelecionado).registrarNomeProprietario(scanStrings, 'c'));//atualiza nome proprietário.
                carrosComprados.add(carrosParaVenda.get(indexCarroSelecionado));
                PersistirArquvos.registrarComprasDeCarroSerializado(carrosComprados);
                Menu.limparTela();
                carrosParaVenda.remove(indexCarroSelecionado);
                PersistirArquvos.registrarCarrosDisponiveisSerializado(carrosParaVenda);
                Compra.mensagemSucesso();
                Thread.sleep(2000);
                Menu.limparTela();
                break;
            case 3:
                Menu.limparTela();
                carrosVendidos = LerArquivos.lerVendasCarro();
                Venda.listarCarrosVendidos(carrosVendidos);
                Menu.pause(scanStrings);
                Menu.limparTela();
                break;
            case 4:
                Menu.limparTela();
                carrosComprados = LerArquivos.lerComprasCarro();
                Compra.listarComprasDeCarros(carrosComprados);
                Menu.pause(scanStrings);
                Menu.limparTela();
                break;
            case 5:
                Menu.limparTela();
                Moto moto1 = new Moto();
                moto1.cadastrarMoto(moto1, scanNum, scanStrings);
                motosVendidas.add(moto1);
                motosDisponiveis.add(moto1);
                PersistirArquvos.registrarVendasDeMotoSerializado(motosVendidas);
                PersistirArquvos.registrarMotosDisponiveisSerializado(motosDisponiveis);
                Thread.sleep(2000);
                Menu.limparTela();
                break;
            case 6:
                Menu.limparTela();
                LerArquivos.lerMotosParaVenda(motosDisponiveis);
                Compra.listarMotosParaCompra(motosDisponiveis);
                int indexMotoSelecionada = Compra.selecionarAutomovelCompra(scanNum, motosDisponiveis.size());
                motosDisponiveis.get(indexMotoSelecionada).setNomeProprietario(motosDisponiveis.
                get(indexMotoSelecionada).registrarNomeProprietario(scanStrings, 'c'));//atualiza nome proprietário.
                motosCompradas.add(motosDisponiveis.get(indexMotoSelecionada));
                PersistirArquvos.registrarComprasDeMotoSerializado(motosCompradas);
                Menu.limparTela();
                motosDisponiveis.remove(indexMotoSelecionada);
                PersistirArquvos.registrarMotosDisponiveisSerializado(motosDisponiveis);
                Compra.mensagemSucesso();
                Thread.sleep(2000);
                Menu.limparTela();
                break;
            case 7:
                Menu.limparTela();
                motosVendidas = LerArquivos.lerVendasMoto();
                Venda.listarMotosVendidas(motosVendidas);
                Menu.pause(scanStrings);
                Menu.limparTela();
                break;
            case 8:
                Menu.limparTela();
                motosCompradas = LerArquivos.lerComprasMoto();
                Compra.listarComprasDeMoto(motosCompradas);
                Menu.pause(scanStrings);
                Menu.limparTela();
                break;
            case 9:
                PersistirArquvos.registrarVendasDeCarroSerializado(carrosVendidos);
                PersistirArquvos.registrarVendasDeMotoSerializado(motosVendidas);
                PersistirArquvos.registrarComprasDeCarroSerializado(carrosComprados);
                PersistirArquvos.registrarComprasDeMotoSerializado(motosCompradas);
                PersistirArquvos.registrarCarrosDisponiveisSerializado(carrosParaVenda);
                PersistirArquvos.registrarMotosDisponiveisSerializado(motosDisponiveis);
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida!");
                }
            }while(opcaoMenu != 10);
            scanNum.close();
            scanStrings.close();
    }
}
