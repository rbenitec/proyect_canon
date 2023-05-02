package util;

import java.util.HashMap;
import java.util.Map;

public class dataUtil {

    private static final Map<String, String> CONSTANTES_CALCULO;

    static {
        final Map<String, String> map = new HashMap<>();

        map.put("Gravedad", "9.81");
        CONSTANTES_CALCULO = map;
    }
}
