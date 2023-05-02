
package model;

public class Proyectil {
    private String tipo;
    private double peso;
    private double diametro;
    private String material;

    public Proyectil(String tipo, double peso, double diametro, String material) {
        this.tipo = tipo;
        this.peso = peso;
        this.diametro = diametro;
        this.material = material;
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

    @Override
    public String toString() {
        return "Proyectil{" + "tipo=" + tipo + ", peso=" + peso + ", diametro=" + diametro + ", material=" + material + '}';
    }
    
    
}
