package util;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Canon;
import model.Proyectil;

public class dataUtil {

    private static final Map<String, String> CONSTANTES_CALCULO;

    private List<Proyectil> proyectil = new ArrayList<>();
    private List<Canon> canones = new ArrayList<>();
    
    public dataUtil (){
        
        //Data de proyectol
        proyectil.add(new Proyectil("Naval", 110.25, 50.56, "Hierro"));
        proyectil.add(new Proyectil("Aereo", 150.25, 200.56, "Metal"));
        proyectil.add(new Proyectil("Terrestre", 60.5, 20.56, "Plomo"));
        
        //Data de canoñes
        
        canones.add(new Canon ("Balistico", 350, 120,30, 3, "10/10/1850"));
        canones.add(new Canon ("Maritimo", 300, 100,20, 5, "10/10/1855"));
        canones.add(new Canon ("Campo", 400, 150, 35, 7, "10/10/1860"));
    }

    static {
       final Map<String, String> map = new HashMap<>();

       map.put("Gravedad", "9.81");
        CONSTANTES_CALCULO = map;
    }
}
