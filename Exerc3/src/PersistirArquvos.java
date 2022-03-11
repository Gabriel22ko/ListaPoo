import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersistirArquvos {
    public static void registrarVendasDeCarroSerializado(ArrayList<Carro> carros) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("vendasCarro.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(carros);
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

    public static void registrarVendasDeMotoSerializado(ArrayList<Moto> motos) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("vendasMoto.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(motos);
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

    public static void registrarComprasDeCarroSerializado(ArrayList<Carro> carros) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("comprasCarro.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(carros);
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

    public static void registrarComprasDeMotoSerializado(ArrayList<Moto> motos) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("comprasMoto.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(motos);
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

    public static void registrarCarrosDisponiveisSerializado(ArrayList<Carro> carros) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("carrosParaVenda.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(carros);
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

    public static void registrarMotosDisponiveisSerializado(ArrayList<Moto> motos) throws IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("motosParavenda.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(motos);
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
}
