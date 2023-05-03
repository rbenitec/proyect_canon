
package service;

import model.Proyectil;

public class Calculos {
    
    private double vo; // Velocidad inicial del proyectil en metros por segundo
    private double angulo; // Ángulo de disparo en grados
    private double g;

    public Calculos() {
    }

    public Calculos(double vo, double angulo, double g) {
        this.vo = vo;
        this.angulo = angulo;
        this.g = g;
    }
    
    public double angulo(double angulo) {
        double theta = Math.toRadians(angulo);
        return theta;
    }

    // Alcance máximo en metros || Se usara Velocidad inicial en X y Y
    public double alcMax(double v0) {
        double max = (v0 * v0 / g) * Math.sin(2 * angulo());
        return max;
    }
    
    // Convertir el ángulo a radianes || se usara el angulo proporcionado por el usuario
//    public double anguloRad(double angulo) {
//        return Math.toRadians(angulo);
//    }

    // Calcular la altura máxima
    public double h_max( double v0, double angulo) {
        double alt_max = Math.pow(v0, 2) * Math.pow(Math.sin(Math.toRadians(angulo)), 2) / (2 * g);
        return alt_max;
    }
    
    // Ángulo de lanzamiento en radianes || se usara el angulo proporcionado por el usuario
    public double angulo() {
        double theta = Math.toRadians(60);
        return theta;
    }

    // Tiempo de vuelo en segundos
    public double timeS(double v0) {
        double tiempo = (2 * v0 * Math.sin(angulo())) / g;
        return tiempo;
    }
    
    // Sección transversal del proyectil || se asume que el radio del proyectil es 0.01m pq se asume que su diametro es de 2cm
    private double seccTransProy() {
        double A = Math.PI * Math.pow(0.01, 2); //Math.pow eleva el 0.01(radio) al cuadrado
        return A;
    }

    // Calcular la velocidad inicial del proyectil (se usara en todo le proyecto)
    public double vInicial(double masaProy, double resAire, double densAire, double p) {
        return Math.sqrt((2 * p) / (masaProy * resAire * densAire * seccTransProy()));
    }
    
    // Calcular las velocidades iniciales en X y Y
    public double Vx(double v0) {
        double veloX = v0 * Math.cos(angulo);
        return veloX;
    }

    public double Vy(double v0) {
        double veloY = v0 * Math.sin(angulo);
        return veloY;
    }
    
}
