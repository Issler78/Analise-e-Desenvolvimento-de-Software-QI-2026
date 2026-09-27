/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author issler
 */
public class Funcionario {
    int id;
    int cracha;
    String cargo;
    Pessoa pessoa;
    Turno turno;

    public Funcionario(int id, int cracha, String cargo, Pessoa pessoa, Turno turno) {
        this.id = id;
        this.cracha = cracha;
        this.cargo = cargo;
        this.pessoa = pessoa;
        this.turno = turno;
    }

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
}
