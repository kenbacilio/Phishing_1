import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class AnalizadorSeguridad {
    private final Map<String, Long> recuentoPalabras = new HashMap<>();

    public void analizarTexto(String texto) {
        RegistroClaves.obtenerClavesPhishing().forEach((clave, valor) -> {
            long conteo = contarOcurrencias(texto, clave);
            if (conteo > 0) {
                recuentoPalabras.merge(clave, conteo, Long::sum);
            }
        });
    }

    public int obtenerPuntuacionTotal() {
        int puntuacionTotal = 0;
        for (Map.Entry<String, Long> entrada : recuentoPalabras.entrySet()) {
            int puntuacion = RegistroClaves.obtenerClavesPhishing().get(entrada.getKey()) * Math.toIntExact(entrada.getValue());
            puntuacionTotal += puntuacion;
            System.out.println("Detectado: " + entrada.getKey() + " - Ocurrencias: " + entrada.getValue() + " - Puntos: " + puntuacion);
        }
        return puntuacionTotal;
    }

    private long contarOcurrencias(String texto, String palabra) {
        return Stream.of(texto.split("\\s+"))
                     .filter(palabra::equals)
                     .count();
    }
}



