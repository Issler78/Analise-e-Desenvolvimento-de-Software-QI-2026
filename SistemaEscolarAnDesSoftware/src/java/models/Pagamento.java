/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author issler
 */
public class Pagamento<T extends MetodoPagamento> {
    int id;
    LocalDateTime data_horario;
    String cpf_pagador;
    BigDecimal valor;
    String status;
    T metodo;
    Matricula matricula;

    public Pagamento(
        int id, 
        LocalDateTime data_horario, 
        String cpf_pagador, 
        BigDecimal valor, 
        String status, 
        T metodo, 
        Matricula matricula
    ) {
        this.id = id;
        this.data_horario = data_horario;
        this.cpf_pagador = cpf_pagador;
        this.valor = valor;
        this.status = status;
        this.metodo = metodo;
        this.matricula = matricula;
    }

    public Pagamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData_horario() {
        return data_horario;
    }

    public void setData_horario(LocalDateTime data_horario) {
        this.data_horario = data_horario;
    }

    public String getCpf_pagador() {
        return cpf_pagador;
    }

    public void setCpf_pagador(String cpf_pagador) {
        this.cpf_pagador = cpf_pagador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getMetodo() {
        return metodo;
    }

    public void setMetodo(T metodo) {
        this.metodo = metodo;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
   
}
