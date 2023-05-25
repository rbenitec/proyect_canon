package controlador;

import java.util.ArrayList;
import java.util.List;
import model.*;
import service.*;
import util.dataUtil;

public class SimulacionDisparo {
    private double angulo;

    ReporteCondicionesIniciales reporteCondicionesIniciales = new ReporteCondicionesIniciales();

    public ResultadoDisparo ejecutarDisparo(Disparo disparo) {
        System.out.println("Se llamo al metodo Ejecutar Disparo: " + disparo);
        Calculos calculos =  new Calculos();
        dataUtil data=new dataUtil();
        ReporteResultadoDisparo reportResultadoDisparo =  new ReporteResultadoDisparo();
        
        
        double velocidadInicial=0;
        double masaProyectil = 0;
        ResultadoDisparo resultadoDisparo = new ResultadoDisparo();
        try {
            //Metodo para recuperar condiciones iniciales y guardarlos en una lista.
            //reporteCondicionesIniciales.guardarCondicionesIniciales(disparo.getCondicionesIniciales());
            
            data.guardarCondicionesIniciales(disparo.getCondicionesIniciales());

            //Metodo para ejecutar calculos.
            angulo = disparo.getCondicionesIniciales().getAngulo();
            System.out.println("angulo: " + angulo);

//            masaProyectil = disparo.getCondicionesIniciales().getProyectil().o
            if (disparo != null) {
                System.out.println("disparo no es nulo");
                if (disparo.getCondicionesIniciales() != null) {
                    System.out.println("CondicionesIniciales no es nulo");
                    if (disparo.getCondicionesIniciales().getProyectil() != null) {
                        System.out.println("proyectil no es nulo");
                        
                        velocidadInicial = calculos.hallarVelocidadInicial(
                                disparo.getCondicionesIniciales().getProyectil().getMasa(),
                                disparo.getCondicionesIniciales().getAmbiente().getResistenciaAire(),
                                disparo.getCondicionesIniciales().getAmbiente().getDensidadAire(),
                                disparo.getCondicionesIniciales().getCanon().getPotencia(),
                                disparo.getCondicionesIniciales().getProyectil().getDiametro()
                        );
                        // Resto del código...
                    } else {
                        System.out.println("proyectil es nulo");
                    }
                } else {
                    System.out.println("CondicionesIniciales es nulo");
                }
            } else {
                System.out.println("disparo es nulo");
            }
            System.out.println("dataUtil.nombreAutor: "+ dataUtil.nombreAutor);
            calculos.setAngulo(angulo);
            calculos.setV0(velocidadInicial);
            resultadoDisparo.setAlcanceMaximo(calculos.alcMax());
            resultadoDisparo.setAlturaMaximo(calculos.h_max());
            resultadoDisparo.setTiempoDeVuelo(calculos.timeS());
            resultadoDisparo.setVelocidadInicial(velocidadInicial);
            resultadoDisparo.setVelocidadInicialEnY(calculos.Vy());
            resultadoDisparo.setVelocidadInicialEnX(calculos.Vx());
            resultadoDisparo.setNombreAutor(dataUtil.nombreAutor);
            resultadoDisparo.setId(disparo.getIdDisparo());
            resultadoDisparo.setStatus(1);

            //Metodo para registrar resultados de calculos
            data.guardarResultadosDisparo(resultadoDisparo);
            
            

            return resultadoDisparo;
        } catch (Exception e) {
            e.printStackTrace();
            resultadoDisparo.setStatus(0);
        }
        return resultadoDisparo;
    }
    
    //Registrar Reporte[Lista] Condiciones Iniciales
    
    public void resgitrarCondicionesIniciales(CondicionesIniciales ci){
        
    }
    
    
    //Crear los Objetos con la data [Author, Canon, Proyectil, Condiciones Iniciales]
    //Generar sus Objetos
    
    // -- Crear metodo retornar Reporte de condiciones inciales
    //Registrar Reporte[Lista] REsultado Disparo
    // -- Crear metodo para retornar listado de Resultados de Disparo
    //Retornar como respuesta el obejeto Disparo, con todos sus atributos completos y con data.
}
