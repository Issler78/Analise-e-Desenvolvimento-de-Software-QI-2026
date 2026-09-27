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
public class Pessoa {
    int id;
    String nome;
    String cpf;
    LocalDate data_nascimento;
    String cep;
    String endereco;
    String bairro;
    int num_residencial;
    String telefone;
    String celular;
    Usuario usuario;

    public Pessoa(
        int id, 
        String nome, 
        String cpf, 
        LocalDate data_nascimento, 
        String cep, 
        String endereco, 
        String bairro, 
        int num_residencial, 
        String telefone, 
        String celular, 
        Usuario usuario
    ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.num_residencial = num_residencial;
        this.telefone = telefone;
        this.celular = celular;
        this.usuario = usuario;
    }

    public Pessoa() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    public int getNum_residencial() {
        return num_residencial;
    }

    public void setNum_residencial(int num_residencial) {
        this.num_residencial = num_residencial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
