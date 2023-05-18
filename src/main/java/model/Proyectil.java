package model;

import util.dataUtil;

public class Proyectil {

    private String tipo;
    private double peso;
    private double diametro;
    private String material;
    private double masa;
    private double densidad;

    public Proyectil(String tipo, double peso, double diametro, String material) {
        this.tipo = tipo;
        this.peso = peso;
        this.diametro = diametro;
        this.material = material;
        this.densidad = dataUtil.getDensidadPorTipo(tipo);
        this.masa = calcularMasa();

    }
    
    public Proyectil(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double calcularMasa() {
        return calcularVolumen() * densidad;
    }

    public double calcularVolumen() {
        return (4 / 3) * Math.PI * Math.pow((diametro / 2), 3);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proyectil{tipo=").append(tipo);
        sb.append(", peso=").append(peso);
        sb.append(", diametro=").append(diametro);
        sb.append(", material=").append(material);
        sb.append(", masa=").append(masa);
        sb.append('}');
        return sb.toString();
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    
}
