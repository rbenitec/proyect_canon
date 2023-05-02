package service;

public class veloInicialXY {

    private double g = 9.81; // aceleración debido a la gravedad en m/s^2
    private double h = 25.0; // altura máxima en metros
    
    private double angulo = Math.PI / 4.0; // depende del angulo del cañón, en radianes || se usara el angulo proporcionado por el usuario

    // Calcular la velocidad inicial || Usamos la clase veloInicial, esta es una prueba
    private double V0 = Math.sqrt(2 * g * h);

    // Calcular las velocidades iniciales en X y Y
    double Vx() {
        double veloX = V0 * Math.cos(angulo);
        return veloX;
    }

    double Vy() {
        double veloY = V0 * Math.sin(angulo);
        return veloY;
    }

    //Getter and Setter
    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getV0() {
        return V0;
    }

    public void setV0(double V0) {
        this.V0 = V0;
    }

    
}
