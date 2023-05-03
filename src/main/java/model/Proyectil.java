
package model;

import util.dataUtil;

public class Proyectil {
    private String tipo;
    private double peso;
    private double diametro;
    private String material;
    private double masa;

    public Proyectil(String tipo, double peso, double diametro, String material) {
        this.tipo = tipo;
        this.peso = peso;
        this.diametro = diametro;
        this.material = material;
        this.masa = obtenerMasa(diametro, peso, tipo);
        
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
    
    public double obtenerMasa(double volumen, double densidad, String tipoBala){
        return volumen * dataUtil.getDensidadPorTipo(tipoBala);
    }
    
    public double obtenerVolumen(double diametro){
        return (4/3)*Math.PI*Math.pow((diametro/2), 3);
    }

    @Override
    public String toString() {
        return "Proyectil{" + "tipo=" + tipo + ", peso=" + peso + ", diametro=" + diametro + ", material=" + material + '}';
    }
    
    
}
