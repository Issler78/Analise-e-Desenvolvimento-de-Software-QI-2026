/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author issler
 */
public class Certificado {
    int id;
    LocalDate data_inicio;
    LocalDate data_final;
    LocalDate data_emissao;
    int carga_horaria;
    String curso;
    Aluno aluno;

    public Certificado(int id, LocalDate data_inicio, LocalDate data_final, LocalDate data_emissao, int carga_horaria, String curso, Aluno aluno) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.data_emissao = data_emissao;
        this.carga_horaria = carga_horaria;
        this.curso = curso;
        this.aluno = aluno;
    }

    public Certificado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_final() {
        return data_final;
    }

    public void setData_final(LocalDate data_final) {
        this.data_final = data_final;
    }

    public LocalDate getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(LocalDate data_emissao) {
        this.data_emissao = data_emissao;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
