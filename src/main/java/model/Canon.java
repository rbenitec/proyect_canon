package model;

public class Canon {

    private String tipo;
    private double potencia; // unidad de medida Julios
    private String fechaFabricacion;

    public Canon(String tipo, double potencia, String fechaFabricacion) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Canon{" + "tipo=" + tipo + ", potencia=" + potencia + ", fechaFabricacion=" + fechaFabricacion + '}';
    }

}
