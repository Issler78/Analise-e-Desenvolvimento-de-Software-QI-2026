/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;

/**
 *
 * @author issler
 */
public class Curso {
    int id;
    String nome;
    int carga_horaria_total;
    List<Disciplina> disciplinas;

    public Curso(int id, String nome, int carga_horaria_total, List<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.carga_horaria_total = carga_horaria_total;
        this.disciplinas = disciplinas;
    }
    
    public Curso(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarga_horaria_total() {
        return carga_horaria_total;
    }

    public void setCarga_horaria_total(int carga_horaria_total) {
        this.carga_horaria_total = carga_horaria_total;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
