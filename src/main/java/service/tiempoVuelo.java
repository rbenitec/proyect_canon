package service;

public class tiempoVuelo {

    private double v0 = 50; // Velocidad inicial en metros por segundo || 
    private double g = 9.81; // Aceleración debido a la gravedad en metros por segundo cuadrado || posible a cambio

    // Ángulo de lanzamiento en radianes || se usara el angulo proporcionado por el usuario
    double angulo() {
        double theta = Math.toRadians(60);
        return theta;
    }

    // Tiempo de vuelo en segundos
    double timeS() {
        double tiempo = (2 * v0 * Math.sin(angulo())) / g;
        return tiempo;
    }

    //Getter and Setter
    public double getV0() {
        return v0;
    }

    public void setV0(double v0) {
        this.v0 = v0;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
    
    
}
