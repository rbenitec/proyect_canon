package util;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Canon;
import model.Proyectil;

public class dataUtil {

    private static final Map<String, Double> CONSTANTES_CALCULO;

    public static final Double GRAVEDAD = 9.80;
    
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
       final Map<String, Double> map = new HashMap<>();

       map.put("gravedad", 9.81);
       map.put("oro", 9.81);
       map.put("plata", 11.81);
       map.put("hierro", 13.81);
       map.put("plomo", 15.81);
        CONSTANTES_CALCULO = map;
    }
    
    public static Double getDensidadPorTipo(String value){
        Double densidad = CONSTANTES_CALCULO.get(value);
        return densidad != null ? densidad : 0.0 ; 
    }
}
