import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitura_cliente {
    public static void main(String[] args) {
        try {
            File myObj = new File("clientes.txt");
            Scanner leitura = new Scanner(myObj);
            while (leitura.hasNextLine()) {
                String data =leitura.nextLine();
                System.out.println(data);
            }
            leitura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }
}
