
package model;



public class ResultadoDisparo {
    
    private String nombreAutor;
    private double alcanceMaximo;
    private double alturaMaximo;
    private double tiempoDeVuelo;
    private double velocidadInicial;
    private double velocidadInicialEnX;
    private double velocidadInicialEnY;
    private int status;

    public ResultadoDisparo() {
    }

    public ResultadoDisparo(String nombreAutor, double alcanceMaximo, double alturaMaximo, double tiempoDeVuelo, double velocidadInicial, double velocidadInicialEnX, double velocidadInicialEnY, int status){
        this.nombreAutor = nombreAutor;
        this.alcanceMaximo = alcanceMaximo;
        this.alturaMaximo = alturaMaximo;
        this.tiempoDeVuelo = tiempoDeVuelo;
        this.velocidadInicial = velocidadInicial;
        this.velocidadInicialEnX = velocidadInicialEnX;
        this.velocidadInicialEnY = velocidadInicialEnY;
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

    public double getVelocidadInicialEnX() {
        return velocidadInicialEnX;
    }

    public void setVelocidadInicialEnX(double velocidadInicialEnX) {
        this.velocidadInicialEnX = velocidadInicialEnX;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getVelocidadInicialEnY() {
        return velocidadInicialEnY;
    }

    public void setVelocidadInicialEnY(double velocidadInicialEnY) {
        this.velocidadInicialEnY = velocidadInicialEnY;
    }

   
}
