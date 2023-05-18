package util;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Author;
import model.Canon;
import model.Proyectil;

public class dataUtil {

    private static final Map<String, Double> CONSTANTES_CALCULO;

    public static final Double GRAVEDAD = 9.80;


    public List<Proyectil> proyectil = new ArrayList<>();
    public List<Canon> canones = new ArrayList<>();
    public static final Double PI = 3.1416;
    
    public dataUtil (){
        

        //Data de proyectol
        //                          Tipo, peso, diametro, material
        proyectil.add(new Proyectil("Naval", 110.25, 50.56, "Hierro"));
        proyectil.add(new Proyectil("Aereo", 150.25, 200.56, "oro"));
        proyectil.add(new Proyectil("Terrestre", 60.5, 20.56, "Plomo"));

        //Data de canoñes       tipo        potencia    fecha
        canones.add(new Canon("Balistico", 3000, "10/10/1850"));
        canones.add(new Canon("Maritimo", 5000, "10/10/1855"));
        canones.add(new Canon("Campo", 2000, "10/10/1860"));
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
    
    public static Author obtenerAuthorEjemplo(){
        Author a = new Author("Fabricio", 22, "fgutierrez@gmail.com");
        return a;
    }

    public static Double getDensidadPorTipo(String value) {
        Double densidad = CONSTANTES_CALCULO.get(value);
        return densidad != null ? densidad : 0.0;
    }

    public List<Canon> getCanones() {
        return canones;
    }
    public List<Proyectil> getProyectil() {
        return proyectil;
    }

    public void setProyectil(List<Proyectil> proyectil) {
        this.proyectil = proyectil;
    }

    public void setCanones(List<Canon> canones) {
        this.canones = canones;
    }
   
    
}
