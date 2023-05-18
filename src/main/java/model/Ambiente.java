
package model;

public class Ambiente {
    private double resistenciaAire;
    private double densidadAire;

    public Ambiente(double resistenciaAire, double densidadAire) {
        this.resistenciaAire = resistenciaAire;
        this.densidadAire = densidadAire;
    }
    
    public Ambiente(){
        
    }

    public double getResistenciaAire() {
        return resistenciaAire;
    }

    public void setResistenciaAire(double resistenciaAire) {
        this.resistenciaAire = resistenciaAire;
    }

    public double getDensidadAire() {
        return densidadAire;
    }

    public void setDensidadAire(double densidadAire) {
        this.densidadAire = densidadAire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ambiente{resistenciaAire=").append(resistenciaAire);
        sb.append(", densidadAire=").append(densidadAire);
        sb.append('}');
        return sb.toString();
    }
    
    
}
