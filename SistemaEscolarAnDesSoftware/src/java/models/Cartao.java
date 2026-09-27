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
public class Cartao implements MetodoPagamento {
    String tipo;
    String nome_titular;
    String numero_cartao;
    LocalDate data_validade;
    int cvv;

    public Cartao(String tipo, String nome_titular, String numero_cartao, LocalDate data_validade, int cvv) {
        this.tipo = tipo;
        this.nome_titular = nome_titular;
        this.numero_cartao = numero_cartao;
        this.data_validade = data_validade;
        this.cvv = cvv;
    }

    public Cartao() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public LocalDate getData_validade() {
        return data_validade;
    }

    public void setData_validade(LocalDate data_validade) {
        this.data_validade = data_validade;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
