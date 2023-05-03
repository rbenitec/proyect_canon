
package service;

import util.dataUtil;

public class Calculos {
   
    public double angulo(double angulo) {
        return Math.toRadians(angulo);
    }
    
    // Calcular la velocidad inicial del proyectil (se usara en todo le proyecto)
    public double hallarVelocidadInicial(double masaProy, double resAire, double densAire, double p) {
        return Math.sqrt((2 * p) / (masaProy * resAire * densAire * seccTransProy()));
    }

    // Alcance máximo en metros || Se usara Velocidad inicial en X y Y
    public double alcMax(double v0, double angulo) {
        return (v0 * v0 / dataUtil.GRAVEDAD) * Math.sin(2 * Math.toRadians(angulo));
    }
    
    // Calcular la altura máxima
    public double h_max( double v0, double angulo) {
        return Math.pow(v0, 2) * Math.pow(Math.sin(Math.toRadians(angulo)), 2) / (2 * dataUtil.GRAVEDAD);
    }
    

    // Tiempo de vuelo en segundos
    public double timeS(double v0, double angulo) {
        return (2 * v0 * Math.sin(Math.toRadians(angulo))) / dataUtil.GRAVEDAD;
    }
    
    // Sección transversal del proyectil || se asume que el radio del proyectil es 0.01m pq se asume que su diametro es de 2cm
    private double seccTransProy() {
        return Math.PI * Math.pow(0.01, 2); //Math.pow eleva el 0.01(radio) al cuadrado
    }
    
    // Calcular las velocidades iniciales en X y Y
    public double Vx(double v0, double angulo) {
        return v0 * Math.cos(angulo);

    }

    public double Vy(double v0, double angulo) {
        return v0 * Math.sin(angulo);
    }
    
}
