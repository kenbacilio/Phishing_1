import java.util.Map;
import java.util.HashMap;

public class RegistroClaves {
    private static final Map<String, Integer> clavesPhishing = new HashMap<>();
    static {
        clavesPhishing.put("Contraseña", 1);
        clavesPhishing.put("Actualización", 1);
        clavesPhishing.put("verificación", 1);
        clavesPhishing.put("urgente", 1);
        clavesPhishing.put("Confirmación", 1);
        clavesPhishing.put("Alerta", 1);
        clavesPhishing.put("acceso", 1);
        clavesPhishing.put("Suspensión", 1);
        clavesPhishing.put("caducidad", 1);
        clavesPhishing.put("recuperar", 1);
        clavesPhishing.put("verificar", 1);
        clavesPhishing.put("Ganador", 1);
        clavesPhishing.put("Gratis", 1);
        clavesPhishing.put("Inusual", 1);
        clavesPhishing.put("Limitado", 1);
        clavesPhishing.put("oferta", 1);
        clavesPhishing.put("premio", 1);
        clavesPhishing.put("Problema", 1);
        clavesPhishing.put("Seguridad", 1);
        clavesPhishing.put("importante", 1);
    }

    public static Map<String, Integer> obtenerClavesPhishing() {
        return clavesPhishing;
    }
}
