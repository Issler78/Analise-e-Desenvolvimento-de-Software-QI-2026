<%-- 
    Document   : CadAluno
    Created on : 26 de set. de 2026, 21:43:23
    Author     : issler
--%>

<%@page import="models.Pix"%>
<%@page import="models.Pagamento"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="models.Disciplina"%>
<%@page import="java.util.List"%>
<%@page import="models.Curso"%>
<%@page import="java.time.LocalDate"%>
<%@page import="models.Matricula"%>
<%@page import="models.Turno"%>
<%@page import="models.Turma"%>
<%@page import="models.Aluno"%>
<%@page import="models.Pessoa"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="models.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Cliente</title>
</head>
<body>

    <%
        Usuario usuario = new Usuario(1, "joao@gmail.com", "joao123", LocalDateTime.now());
        Pessoa pessoa = new Pessoa(
                1, 
                "João de Lima", 
                "111.222.333-44", 
                LocalDate.of(2009, 1, 19),
                "99999-999", 
                "Rua Osvaldo Oliveira", 
                "Centro", 
                123, 
                "5432423423", 
                "54932423423", 
                usuario
        );
        Turno turno = new Turno(1, "Manhã");
        Turma turma = new Turma(1, "1001B", "Laboratório de Informática", turno);
        Aluno aluno = new Aluno(1, "Matriculado", pessoa, turma);
        Curso curso = new Curso(
                1, "Informática Básica", 
                80, 
                List.of(
                        new Disciplina(1, "Digitação", 20),
                        new Disciplina(2, "Pacote Office", 40),
                        new Disciplina(3, "Terminal", 10),
                        new Disciplina(4, "Hardware", 10)
                    )
        );
        Matricula matricula = new Matricula(1, "Ativa", BigDecimal.valueOf(10.5), LocalDate.now(), 1, BigDecimal.valueOf(1299.99), BigDecimal.valueOf(1299.99), aluno, curso);
        Pagamento pagamento = new Pagamento(1, LocalDateTime.now(), "111.222.333-44", BigDecimal.valueOf(1299.99), "Pago", new Pix("PIX462783DAWDa8ja4324SD"), matricula);
        Pix pix = (Pix) pagamento.getMetodo();
    %>
    
    <h1>Dados do Aluno</h1>

    <p><strong>ID:</strong> <span id="codigo"><%= pessoa.getId() %></span></p>
    <p><strong>Nome:</strong> <span id="nome"><%= pessoa.getNome() %></span></p>
    <p><strong>E-mail:</strong> <span id="email"><%= usuario.getEmail() %></span></p>
    <p><strong>CPF:</strong> <span id="cpf"><%= pessoa.getCpf() %></span></p>
    <p><strong>Celular:</strong> <span id="celular"><%= pessoa.getCelular() %></span></p>
    <p><strong>CEP:</strong> <span id="cep"><%= pessoa.getCep() %></span></p>
    <br>
    <p><strong>MATRÍCULA:</strong></p>
    <p><strong>Turma:</strong> <span id="turma"><%= turma.getNome() %> (<%= turno.getTurno()%>)</span></p>
    <p><strong>Curso:</strong> <span id="curso"><%= curso.getNome() %></span></p>
    <p><strong>Valor total:</strong> <span id="valor_total"><%= matricula.getValor_total()%></span></p>
    <p><strong>Parcelas:</strong> <span id="parcelas"><%= matricula.getParcelas()%></span></p>
    <p><strong>Valor das parcelas:</strong> <span id="valor_parcelas"><%= matricula.getValor_parcelas()%></span></p>
    <p><strong>Status da matrícula:</strong> <span id="status_matricula"><%= matricula.getStatus() %></span></p>
    <br>
    <p><strong>PAGAMENTO:</strong></p>
    <p><strong>Valor:</strong> <span id="valor_pagamento"><%= pagamento.getValor() %></span></p>
    <p><strong>Status:</strong> <span id="status_pagamento"><%= pagamento.getStatus() %></span></p>
    <p><strong>Método:</strong> PIX</p>
    <p><strong>QR CODE:</strong> <span id="qr_code"><%= pix.getQr_code() %></span></p>

</body>
</html>
