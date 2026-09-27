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
public class Relatorio {
    int id;
    String tipo;
    LocalDate data_emissao;    
    LocalDate data_inicio;    
    LocalDate data_final;
    Funcionario funcionario;

    public Relatorio(int id, String tipo, LocalDate data_emissao, LocalDate data_inicio, LocalDate data_final, Funcionario funcionario) {
        this.id = id;
        this.tipo = tipo;
        this.data_emissao = data_emissao;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.funcionario = funcionario;
    }

    public Relatorio() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(LocalDate data_emissao) {
        this.data_emissao = data_emissao;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
