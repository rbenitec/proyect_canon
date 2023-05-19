package service;

import java.text.DecimalFormat;
import util.dataUtil;

public class Calculos {

    private double angulo;
    private double v0;

    public double angulo() {
        return Math.toRadians(angulo);
    }

    // Calcular la velocidad inicial del proyectil (se usara en todo le proyecto)
    public double hallarVelocidadInicial(double masaProy, double resAire, double densAire, double potencia, double diametro) {
        System.out.println("Se llamo al metodo hallarVelocidadInicial!");
        System.out.println("masaProy: "+ masaProy);
         System.out.println("resAire: "+ resAire);
          System.out.println("densAire: "+ densAire);
           System.out.println("potencia: "+ potencia);
            System.out.println("diametro: "+ diametro);
        double v0=Math.sqrt((2 * potencia) / (masaProy * resAire * densAire * seccTransProy(diametro)));
        System.out.println(v0);
        return v0;
    }

    // Alcance máximo en metros || Se usara Velocidad inicial en X y Y
    public double alcMax() {
        double alcMax = (v0 * v0 / dataUtil.GRAVEDAD) * Math.sin(2 * Math.toRadians(angulo));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(alcMax));
    }

    // Calcular la altura máxima
    public double h_max() {
        double hMax = Math.pow(v0, 2) * Math.pow(Math.sin(Math.toRadians(angulo)), 2) / (2 * dataUtil.GRAVEDAD);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(hMax));
    }

    // Tiempo de vuelo en segundos
    public double timeS() {
        double timeS = (2 * v0 * Math.sin(Math.toRadians(angulo))) / dataUtil.GRAVEDAD;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(timeS));
    }

    // Sección transversal del proyectil || se asume que el radio del proyectil es 0.01m pq se asume que su diametro es de 2cm
    private double seccTransProy(double diametro) {
        return Math.PI * Math.pow(diametro / 2, 2); //Math.pow eleva el 0.01(radio) al cuadrado
    }

    // Calcular las velocidades iniciales en X y Y
    public double Vx() {
        return v0 * Math.cos(angulo);

    }

    public double Vy() {
        return v0 * Math.sin(angulo);
    }

    //Getter and Setter
    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getV0() {
        return v0;
    }

    public void setV0(double v0) {
        this.v0 = v0;
    }

}
