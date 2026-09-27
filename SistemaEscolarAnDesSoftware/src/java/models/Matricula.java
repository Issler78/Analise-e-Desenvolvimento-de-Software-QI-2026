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
public class Matricula {
    int id;
    String status;
    BigDecimal progresso;
    LocalDate data_matricula;
    int parcelas;
    BigDecimal valor_total;
    BigDecimal valor_parcelas;
    Aluno aluno;
    Curso curso;

    public Matricula(
        int id, 
        String status, 
        BigDecimal progresso, 
        LocalDate data_matricula, 
        int parcelas, 
        BigDecimal valor_total, 
        BigDecimal valor_parcelas, 
        Aluno aluno, 
        Curso curso
    ) {
        this.id = id;
        this.status = status;
        this.progresso = progresso;
        this.data_matricula = data_matricula;
        this.parcelas = parcelas;
        this.valor_total = valor_total;
        this.valor_parcelas = valor_parcelas;
        this.aluno = aluno;
        this.curso = curso;
    }

    public Matricula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getProgresso() {
        return progresso;
    }

    public void setProgresso(BigDecimal progresso) {
        this.progresso = progresso;
    }

    public LocalDate getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(LocalDate data_matricula) {
        this.data_matricula = data_matricula;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }

    public BigDecimal getValor_parcelas() {
        return valor_parcelas;
    }

    public void setValor_parcelas(BigDecimal valor_parcelas) {
        this.valor_parcelas = valor_parcelas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
