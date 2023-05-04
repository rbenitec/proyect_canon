package service;

import java.util.ArrayList;
import java.util.List;
import model.CondicionesIniciales;

public class ReporteCondicionesIniciales {
    private List<CondicionesIniciales> listCondIni = new ArrayList<>();
    
    public void guardarCondicionesIniciales(CondicionesIniciales ci){
        System.out.println("Se registro: "+ ci.toString());
        listCondIni.add(ci);
    }

    //Getter And Setter
    public List<CondicionesIniciales> getListCondIni() {
        return listCondIni;
    }

    public void setListCondIni(List<CondicionesIniciales> listCondIni) {
        this.listCondIni = listCondIni;
    }
    
}
