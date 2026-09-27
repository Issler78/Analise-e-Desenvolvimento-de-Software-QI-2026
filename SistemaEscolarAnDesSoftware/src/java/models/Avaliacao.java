/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author issler
 */
public class Avaliacao {
    int id;
    String titulo;
    LocalDate data;
    BigDecimal valor_maximo;
    String tipo;
    Disciplina disciplina;

    public Avaliacao(int id, String titulo, LocalDate data, BigDecimal valor_maximo, String tipo, Disciplina disciplina) {
        this.id = id;
        this.titulo = titulo;
        this.data = data;
        this.valor_maximo = valor_maximo;
        this.tipo = tipo;
        this.disciplina = disciplina;
    }

    public Avaliacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor_maximo() {
        return valor_maximo;
    }

    public void setValor_maximo(BigDecimal valor_maximo) {
        this.valor_maximo = valor_maximo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
}
