package model;

import model.Author;
import model.CondicionesIniciales;

public class Disparo {

    private Integer idDisparo;
    private Author author;
    private CondicionesIniciales condicionesIniciales;
    private static Integer cont = 1000;

    public Disparo(Author author, CondicionesIniciales ci) {
        this.idDisparo = cont++;
        this.author = author;
        this.condicionesIniciales = ci;
    }
    
    public Disparo (){
        
    }

    public Integer getIdDisparo() {
        return idDisparo;
    }

    public void setIdDisparo(Integer idDisparo) {
        this.idDisparo = idDisparo;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public CondicionesIniciales getCondicionesIniciales() {
        return condicionesIniciales;
    }

    public void setCi(CondicionesIniciales ci) {
        this.condicionesIniciales = ci;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disparo{idDisparo=").append(idDisparo);
        sb.append(", author=").append(author);
        sb.append(", ci=").append(condicionesIniciales);
        sb.append('}');
        return sb.toString();
    }

}
