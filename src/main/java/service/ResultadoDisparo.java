
package service;

import service.AlcanceMax;
import service.AlturaMax;
import service.Calculos;
import service.TiempoVuelo;
import service.VeloInicial;
import service.VeloInicialXY;

public class ResultadoDisparo {
    
    double alcanceMaximo;
    double alturaMaximo;
    double tiempoDeVuelo;
    double velocidadInicial;
    double velocidadInicialXY;
    
    public ResultadoDisparo calcularResultadoDisparo(){
        Calculos c = new Calculos();
        
        AlcanceMax al = new AlcanceMax();
        AlturaMax am = new AlturaMax();
        TiempoVuelo tv = new TiempoVuelo();
        VeloInicial vi = new VeloInicial();
        VeloInicialXY xy = new VeloInicialXY();
        
        this.alcanceMaximo = al.alcMax();
        this.alturaMaximo = am.h_max();
        this.tiempoDeVuelo = tv.timeS();
        this.velocidadInicial = vi.vInicial();
        
        return null;
    }
}
