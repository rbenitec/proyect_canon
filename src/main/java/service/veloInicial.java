package service;

public class veloInicial {

    private double P = 10000; // Potencia del disparo en vatios || posible a cambio
    private double masaProy = 0.01; // Masa del proyectil en kilogramos || posible a cambio
    private double resAire = 0.5; // Coeficiente de resistencia del aire || posible a cambio
    private double densAire = 1.2; // Densidad del aire en kilogramos por metro cúbico || posible a cambio

    // Sección transversal del proyectil || se asume que el radio del proyectil es 0.01m pq se asume que su diametro es de 2cm
    private double seccTransProy() {
        double A = Math.PI * Math.pow(0.01, 2); //Math.pow eleva el 0.01(radio) al cuadrado
        return A;
    }

    // Calcular la velocidad inicial del proyectil (se usara en todo le proyecto)
    public double vInicial() {
        double vo = Math.sqrt((2 * P) / (masaProy * resAire * densAire * seccTransProy()));
        return vo;
    }

    //Getter and Setter
    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }

    public double getMasaProy() {
        return masaProy;
    }

    public void setMasaProy(double masaProy) {
        this.masaProy = masaProy;
    }

    public double getResAire() {
        return resAire;
    }

    public void setResAire(double resAire) {
        this.resAire = resAire;
    }

    public double getDensAire() {
        return densAire;
    }

    public void setDensAire(double densAire) {
        this.densAire = densAire;
    }

    
}
