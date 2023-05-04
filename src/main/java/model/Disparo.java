
package model;

import model.Author;
import model.CondicionesIniciales;
import model.ResultadoDisparo;

public class Disparo {
    private Integer idDisparo;
    private Author author;
    private CondicionesIniciales condicionesIniciales;
    private ResultadoDisparo res;
    private static Integer cont = 1000;

    public Disparo(Integer idDisparo, Author author, CondicionesIniciales ci, ResultadoDisparo res) {
        this.idDisparo = cont++;
        this.author = author;
        this.condicionesIniciales = ci;
        this.res = res;
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

    public ResultadoDisparo getRes() {
        return res;
    }

    public void setRes(ResultadoDisparo res) {
        this.res = res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disparo{idDisparo=").append(idDisparo);
        sb.append(", author=").append(author);
        sb.append(", ci=").append(condicionesIniciales);
        sb.append(", res=").append(res);
        sb.append('}');
        return sb.toString();
    }
    
    
}
