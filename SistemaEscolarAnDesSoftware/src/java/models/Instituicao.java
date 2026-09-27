/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author issler
 */
public class Instituicao {
    int id;
    String nome;
    String cnpj;
    String cep;
    String endereco;
    String bairro;
    int num_comercial;
    int quantidade_funcionarios;

    public Instituicao(int id, String nome, String cnpj, String cep, String endereco, String bairro, int num_comercial, int quantidade_funcionarios) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.num_comercial = num_comercial;
        this.quantidade_funcionarios = quantidade_funcionarios;
    }

    public Instituicao() {
    }

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNum_comercial() {
        return num_comercial;
    }

    public void setNum_comercial(int num_comercial) {
        this.num_comercial = num_comercial;
    }

    public int getQuantidade_funcionarios() {
        return quantidade_funcionarios;
    }

    public void setQuantidade_funcionarios(int quantidade_funcionarios) {
        this.quantidade_funcionarios = quantidade_funcionarios;
    }
      
}
