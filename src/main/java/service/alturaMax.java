package service;

public class alturaMax {

    private double vo = 50; // Velocidad inicial del proyectil en metros por segundo
    private double angulo = 60; // Ángulo de disparo en grados
    private double g = 9.81; // Aceleración gravitatoria en metros por segundo al cuadrado

    // Convertir el ángulo a radianes || se usara el angulo proporcionado por el usuario
    double anguloRad() {
        double rad = Math.toRadians(angulo);
        return rad;
    }

    // Calcular la altura máxima
    double h_max() {
        double alt_max = Math.pow(vo, 2) * Math.pow(Math.sin(anguloRad()), 2) / (2 * g);
        return alt_max;
    }
    
    //Getter and Setter

    public double getVo() {
        return vo;
    }

    public void setVo(double vo) {
        this.vo = vo;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }
    
}
