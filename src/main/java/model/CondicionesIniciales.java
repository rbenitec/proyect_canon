package model;

public class CondicionesIniciales {
    
    private Canon canon;
    private Ambiente ambiente;
    private Proyectil proyectil;
    private double angulo;

    public CondicionesIniciales(Canon canon, Ambiente ambiente, Proyectil proyectil, double angulo) {
        this.canon = canon;
        this.ambiente = ambiente;
        this.proyectil = proyectil;
        this.angulo = angulo;
    }

    public Canon getCanon() {
        return canon;
    }

    public void setCanon(Canon canon) {
        this.canon = canon;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Proyectil getProyectil() {
        return proyectil;
    }

    public void setProyectil(Proyectil proyectil) {
        this.proyectil = proyectil;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    
    
}
