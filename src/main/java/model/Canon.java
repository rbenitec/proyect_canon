package model;

public class Canon {
    private String tipo;
    private double peso;
    private double LargoDucto;
    private double DiametroInteriorDucto;
    private double capacidadPolvora;
    private String fechaFabricacion;

    public Canon(String tipo, double peso, double LargoDucto, double DiametroInteriorDucto, double capacidadPolvora, String fechaFabricacion) {
        this.tipo = tipo;
        this.peso = peso;
        this.LargoDucto = LargoDucto;
        this.DiametroInteriorDucto = DiametroInteriorDucto;
        this.capacidadPolvora = capacidadPolvora;
        this.fechaFabricacion = fechaFabricacion;
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

    public double getLargoDucto() {
        return LargoDucto;
    }

    public void setLargoDucto(double LargoDucto) {
        this.LargoDucto = LargoDucto;
    }

    public double getDiametroInteriorDucto() {
        return DiametroInteriorDucto;
    }

    public void setDiametroInteriorDucto(double DiametroInteriorDucto) {
        this.DiametroInteriorDucto = DiametroInteriorDucto;
    }

    public double getCapacidadPolvora() {
        return capacidadPolvora;
    }

    public void setCapacidadPolvora(double capacidadPolvora) {
        this.capacidadPolvora = capacidadPolvora;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Canon{" + "tipo=" + tipo + ", peso=" + peso + ", LargoDucto=" + LargoDucto + ", DiametroInteriorDucto=" + DiametroInteriorDucto + ", capacidadPolvora=" + capacidadPolvora + ", fechaFabricacion=" + fechaFabricacion + '}';
    }
    
    
    
    
}
