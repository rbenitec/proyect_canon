package service;

public class alcanceMax {

    private double v0 = 50; // Velocidad inicial en metros por segundo (prueba) || se usara el valor de veloInicial 
    private double g = 9.81; // Aceleración debido a la gravedad en metros por segundo cuadrado || posible a cambio

    // Ángulo de lanzamiento en radianes || se usara el angulo proporcionado por el usuario
    double angulo() {
        double theta = Math.toRadians(45);
        return theta;
    }

    // Alcance máximo en metros || Se usara Velocidad inicial en X y Y
    double alcMax() {
        double max = (v0 * v0 / g) * Math.sin(2 * angulo());
        return max;
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
