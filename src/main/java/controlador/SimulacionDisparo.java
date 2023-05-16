
package controlador;

import java.util.ArrayList;
import java.util.List;
import model.CondicionesIniciales;
import model.Disparo;
import model.ResultadoDisparo;
import service.Calculos;
import service.ReporteCondicionesIniciales;
import service.ReporteResultadoDisparo;

public class SimulacionDisparo {
    
    //Recuperar Data del Frame
    //Mostrar desplazamineto del proyectil
    private Calculos calculos;
    private ReporteCondicionesIniciales condicionesIniciales;
    private ReporteResultadoDisparo reportResultadoDisparo;
    private double velocidadInicial;
    private double angulo;
    
    public ResultadoDisparo ejecutarDisparo(Disparo disparo){
        ResultadoDisparo resultadoDisparo = new ResultadoDisparo();
        try{
            //Metodo para recuperar condiciones iniciales y guardarlos en una lista.
            condicionesIniciales.guardarCondicionesIniciales(disparo.getCondicionesIniciales());
        
            //Metodo para ejecutar calculos.
            angulo = disparo.getCondicionesIniciales().getAngulo();
            velocidadInicial = calculos.hallarVelocidadInicial(angulo,  
                                                           disparo.getCondicionesIniciales().getAmbiente().getResistenciaAire(), 
                                                           disparo.getCondicionesIniciales().getAmbiente().getDensidadAire(), 
                                                           disparo.getCondicionesIniciales().getAngulo(),
                                                           disparo.getCondicionesIniciales().getProyectil().getDiametro());
            calculos.setAngulo(angulo);
            calculos.setV0(velocidadInicial);
            resultadoDisparo.setAlcanceMaximo(calculos.alcMax());
            resultadoDisparo.setAlturaMaximo(calculos.h_max());
            resultadoDisparo.setTiempoDeVuelo(calculos.timeS());
            resultadoDisparo.setVelocidadInicialEnY(calculos.Vy());
            resultadoDisparo.setVelocidadInicialEnX(calculos.Vx());
            resultadoDisparo.setStatus(1);
           
            //Metodo para registrar resultados de calculos
            reportResultadoDisparo.guardarResultadosDisparo(resultadoDisparo);
            
            return resultadoDisparo;
        }catch(Exception e){
            e.printStackTrace();
            resultadoDisparo.setStatus(0);
        }
        return resultadoDisparo;
    }
    //Crear los Objetos con la data [Author, Canon, Proyectil, Condiciones Iniciales]
    //Generar sus Objetos
    //Registrar Reporte[Lista] Condiciones Iniciales
    // -- Crear metodo retornar Reporte de condiciones inciales
    //Registrar Reporte[Lista] REsultado Disparo
    // -- Crear metodo para retornar listado de Resultados de Disparo
    //Retornar como respuesta el obejeto Disparo, con todos sus atributos completos y con data.
}
