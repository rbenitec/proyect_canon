
package model;



public class ResultadoDisparo {
    
    private String nombreAutor;
    private double alcanceMaximo;
    private double alturaMaximo;
    private double tiempoDeVuelo;
    private double velocidadInicial;
    private double velocidadInicialXY;
    private int status;

    public ResultadoDisparo(String nombreAutor, double alcanceMaximo, double alturaMaximo, double tiempoDeVuelo, double velocidadInicial, double velocidadInicialXY, int status) {
        this.nombreAutor = nombreAutor;
        this.alcanceMaximo = alcanceMaximo;
        this.alturaMaximo = alturaMaximo;
        this.tiempoDeVuelo = tiempoDeVuelo;
        this.velocidadInicial = velocidadInicial;
        this.velocidadInicialXY = velocidadInicialXY;
        this.status = status;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public double getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public void setAlcanceMaximo(double alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
    }

    public double getAlturaMaximo() {
        return alturaMaximo;
    }

    public void setAlturaMaximo(double alturaMaximo) {
        this.alturaMaximo = alturaMaximo;
    }

    public double getTiempoDeVuelo() {
        return tiempoDeVuelo;
    }

    public void setTiempoDeVuelo(double tiempoDeVuelo) {
        this.tiempoDeVuelo = tiempoDeVuelo;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getVelocidadInicialXY() {
        return velocidadInicialXY;
    }

    public void setVelocidadInicialXY(double velocidadInicialXY) {
        this.velocidadInicialXY = velocidadInicialXY;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResultadoDisparo{" + "nombreAutor=" + nombreAutor + ", alcanceMaximo=" + alcanceMaximo + ", alturaMaximo=" + alturaMaximo + ", tiempoDeVuelo=" + tiempoDeVuelo + ", velocidadInicial=" + velocidadInicial + ", velocidadInicialXY=" + velocidadInicialXY + ", status=" + status + '}';
    }
    
    

}
