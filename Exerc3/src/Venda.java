import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Venda implements Serializable {
    public static void persistirVendaCarro(ArrayList<Carro>carrosVendidos) throws FileNotFoundException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("vendas.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(carrosVendidos);
        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(oos != null){
                try{
                    oos.close();
                }catch(IOException e){
                    System.out.println("Erro ao fechar arquivo!");
                }
            }
        }
    }

    public static ArrayList<Carro> lerDadosVendaCarro() throws IOException{
        ArrayList<Carro> carrosVendidos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("vendas.bin");
            ois = new ObjectInputStream(fis);
            carrosVendidos = (ArrayList<Carro>)ois.readObject();
            return carrosVendidos;
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar o arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao fechar arquivo!");
                }
            }
        }
        return null;
    }

    public static void mensagemSucesso(){
        System.out.println("Registrado com sucesso!");
    }

    public static void listarCarrosVendidos(ArrayList<Carro> carrosVendidos){
        int cont = 0;
        for (Carro automovel : carrosVendidos) {
            System.out.printf("\t\t\t\t\t\tCARRO %d\n",cont + 1);
            System.out.printf("\t\t\t\t\t\t-------\n");
            System.out.printf("Nome: %s\tCategória: %s\tPlaca: %s\tAno: %d\tKm's: %.2f\tCor: %s\tPreço: %.2f\tProprietario: %s\n",
            automovel.getNomeAutomovel(), automovel.getCategoriaCarro(), automovel.getPlacaAutomovel(),
            automovel.getAnoAutomovel(), automovel.getQuilometragemAutomovel(), automovel.getCorAutomovel(),
            automovel.getPrecoAutomovel(), automovel.getNomeProprietario()); 
            cont++;
        }
    }

    public static void listarMotosVendidas(ArrayList<Moto> automoveisVendidos){
        int cont = 0;
        for (Moto automovel : automoveisVendidos) {
            System.out.printf("\t\t\t\t\t\tMOTO %d\n",cont + 1);
            System.out.printf("\t\t\t\t\t\t-------\n");
            System.out.printf("Nome: %s\tCilindradas: %.2f\tPlaca: %s\tAno: %d\tKm's: %.2f\n",
            automovel.getNomeAutomovel(), automovel.getCilindradras(), automovel.getPlacaAutomovel(), 
            automovel.getAnoAutomovel(), automovel.getQuilometragemAutomovel());
            System.out.printf("Potência Máx: %.2f\tPreço: %.2f\t Proprietário: %s\n", 
            automovel.getPotenciaMax(), automovel.getPrecoAutomovel(), automovel.getNomeProprietario());
            cont++;
        }
    }
}
