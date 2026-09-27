package models;

import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issler
 */
public class Usuario {
    int id;
    String email;
    String senha;
    LocalDateTime ultimo_acesso;

    public Usuario(int id, String email, String senha, LocalDateTime ultimo_acesso) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.ultimo_acesso = ultimo_acesso;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimo_acesso() {
        return ultimo_acesso;
    }

    public void setUltimo_acesso(LocalDateTime ultimo_acesso) {
        this.ultimo_acesso = ultimo_acesso;
    }
    
}
