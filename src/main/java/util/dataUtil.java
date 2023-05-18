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
    public List<Author> author = new ArrayList<>();
    public static final Double PI = 3.1416;
    
    public dataUtil (){
        
        //                          Peso: la mas pesada 12kg                            
        //Data de proyectol         Diametro entre 110 y 130 mm a metros
        //                          Tipo, peso, diametro, material
        proyectil.add(new Proyectil("Naval", 10, 0.110, "Hierro"));
        proyectil.add(new Proyectil("Aereo", 9, 0.120, "oro"));
        proyectil.add(new Proyectil("Terrestre", 11, 0.125, "Plomo"));

        //Data de canoñes       tipo        potencia    fecha
        canones.add(new Canon("Balistico", 3000, "10/10/1850"));
        canones.add(new Canon("Maritimo", 5000, "10/10/1855"));
        canones.add(new Canon("Campo", 2000, "10/10/1860"));
        
        //Data del author
        author.add(new Author("Fabricio","admin","fgutierrez@gmail.com"));
    }

    static {
        final Map<String, Double> map = new HashMap<>();
//densidad en kg/m3
//oro old 9.81
        map.put("gravedad", 9.81);
        map.put("oro", 	19300.0);
        map.put("plata", 10490.0);
        map.put("Hierro", 7874.0);
        map.put("Plomo", 11340.0);
        CONSTANTES_CALCULO = map;
    }
    
    public static Author obtenerAuthorEjemplo(){
        Author a = new Author("Fabricio", "admin", "fgutierrez@gmail.com");
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
    
    public List<Author> getAuthor(){
        return author;
    }
   
    
}
