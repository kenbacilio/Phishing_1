import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DetectorPhishingPrincipal {
    public static void main(String[] args) {
        String rutaArchivo = "Nuevo Documento de texto.txt"; 

        StringBuilder textoAEvaluar = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                textoAEvaluar.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        AnalizadorSeguridad analizador = new AnalizadorSeguridad();
        analizador.analizarTexto(textoAEvaluar.toString());

        int puntajeTotal = analizador.obtenerPuntuacionTotal();
        System.out.println("Puntuación total de detección de phishing para el texto: " + puntajeTotal);
    }
}

