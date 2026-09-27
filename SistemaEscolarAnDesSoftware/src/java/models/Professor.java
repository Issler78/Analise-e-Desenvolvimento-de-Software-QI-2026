/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author issler
 */
public class Professor {
    int id;
    String formacao;
    int registro_profissional;
    Funcionario funcionario;

    public Professor(int id, String formacao, int registro_profissional, Funcionario funcionario) {
        this.id = id;
        this.formacao = formacao;
        this.registro_profissional = registro_profissional;
        this.funcionario = funcionario;
    }

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getRegistro_profissional() {
        return registro_profissional;
    }

    public void setRegistro_profissional(int registro_profissional) {
        this.registro_profissional = registro_profissional;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
