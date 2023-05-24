package model;

public class CondicionesIniciales {
    
    private int id;
    private String nombreAutor;
    private Canon canon;
    private Ambiente ambiente;
    private Proyectil proyectil;
    private double angulo;

    public CondicionesIniciales(int id, String nombreAutor, Canon canon, Ambiente ambiente, Proyectil proyectil, double angulo) {
        this.id= id;
        this.nombreAutor = nombreAutor;
        this.canon = canon;
        this.ambiente = ambiente;
        this.proyectil = proyectil;
        this.angulo = angulo;
    }
    
    public CondicionesIniciales(){
        
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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CondicionesIniciales{id=").append(id);
        sb.append(", nombreAutor=").append(nombreAutor);
        sb.append(", canon=").append(canon);
        sb.append(", ambiente=").append(ambiente);
        sb.append(", proyectil=").append(proyectil);
        sb.append(", angulo=").append(angulo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
