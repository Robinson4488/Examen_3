import java.io.BufferedReader;
import java.io.FileReader;

public class Archivo {

    public static BufferedReader abrirArchivo(String nombreArchivo) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return br;
    }
}
