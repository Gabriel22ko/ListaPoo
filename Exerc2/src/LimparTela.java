import java.io.IOException;

public class LimparTela {
    public static void limparTela() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
