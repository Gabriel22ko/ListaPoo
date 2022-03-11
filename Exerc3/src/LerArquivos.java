import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LerArquivos {

    public static ArrayList<Carro> lerVendasCarro(){
        ArrayList<Carro> carros = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("vendasCarro.bin");
            ois = new ObjectInputStream(fis);
            carros = (ArrayList<Carro>)ois.readObject();
            return carros;
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao criar arquivo!");
                }
            }
        }
        return null;
    }
    public static ArrayList<Moto> lerVendasMoto(){
        ArrayList<Moto> motos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("vendasMoto.bin");
            ois = new ObjectInputStream(fis);
            motos = (ArrayList<Moto>)ois.readObject();
            return motos;
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao criar arquivo!");
                }
            }
        }
        return null;
    }
    public static ArrayList<Carro> lerComprasCarro(){
        ArrayList<Carro> carros = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("comprasCarro.bin");
            ois = new ObjectInputStream(fis);
            carros = (ArrayList<Carro>)ois.readObject();
            return carros;
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao criar arquivo!");
                }
            }
        }
        return null;
    }
    public static ArrayList<Moto> lerComprasMoto(){
        ArrayList<Moto> motos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("comprasMoto.bin");
            ois = new ObjectInputStream(fis);
            motos = (ArrayList<Moto>)ois.readObject();
            return motos;
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao criar arquivo!");
                }
            }
        }
        return null;
    }
    public static ArrayList<Carro> lerCarrosParaVenda(ArrayList<Carro> carros){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("carrosParaVenda.bin");
            ois = new ObjectInputStream(fis);
            carros = (ArrayList<Carro>)ois.readObject();
            return carros;
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao criar arquivo!");
                }
            }
        }
        return carros;
    }
    public static void lerMotosParaVenda(ArrayList<Moto> motos){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("motosParaVenda.bin");
            ois = new ObjectInputStream(fis);
            motos = (ArrayList<Moto>)ois.readObject();
        }catch(ClassNotFoundException e){
            System.out.println("Classe não encontrada!");
        }catch(IOException e){
            System.out.println("Erro ao criar arquivo!");
        }finally{
            if(ois != null){
                try{
                    ois.close();
                }catch(IOException e){
                    System.out.println("Erro ao criar arquivo!");
                }
            }
        }
    }
}
