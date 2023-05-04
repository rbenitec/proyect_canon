
package service;

import java.util.List;
import java.util.ArrayList;
import model.ResultadoDisparo;

public class ReporteResultadoDisparo {
    private List<ResultadoDisparo> listResultadosDisparo = new ArrayList<>();
    
    public void guardarResultadosDisparo(ResultadoDisparo resultadoDisparo){
        System.out.println("Se registro: "+resultadoDisparo.toString());
        listResultadosDisparo.add(resultadoDisparo);
    }

    //Getter And Setter
    public List<ResultadoDisparo> getListResultadosDisparo() {
        return listResultadosDisparo;
    }

    public void setListResultadosDisparo(List<ResultadoDisparo> listResultadosDisparo) {
        this.listResultadosDisparo = listResultadosDisparo;
    }
    
    
}
