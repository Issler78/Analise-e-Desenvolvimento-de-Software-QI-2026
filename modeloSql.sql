-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.

CREATE TABLE Turma (
id INT AUTO_INCREMENT PRIMARY KEY,
sala VARCHAR(10),
nome VARCHAR(10),
turno INT
)

CREATE TABLE curso_disciplina (
curso INT,
disciplina INT
)

CREATE TABLE Disciplina (
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255) UNIQUE,
carga_horaria INT
)

CREATE TABLE professor_disciplina (
professor INT,
disciplina INT,
FOREIGN KEY(disciplina) REFERENCES Disciplina (id)
)

CREATE TABLE Funcionario (
id INT AUTO_INCREMENT PRIMARY KEY,
cracha INT,
cargo VARCHAR(255),
pessoa INT,
turno INT
)

CREATE TABLE Professor (
id INT AUTO_INCREMENT PRIMARY KEY,
formacao VARCHAR(255),
registro_profissional INT UNIQUE,
funcionario INT,
FOREIGN KEY(funcionario) REFERENCES Funcionario (id)
)

CREATE TABLE Turno (
id INT AUTO_INCREMENT PRIMARY KEY,
turno VARCHAR(20) UNIQUE
)

CREATE TABLE Avaliacao (
id INT AUTO_INCREMENT PRIMARY KEY,
data DATE,
titulo VARCHAR(100),
valor_maximo DECIMAL(10),
tipo VARCHAR(50),
disciplina INT,
FOREIGN KEY(disciplina) REFERENCES Disciplina (id)
)

CREATE TABLE Nota (
id INT AUTO_INCREMENT PRIMARY KEY,
valor DECIMAL(10),
aluno INT,
avaliacao INT,
FOREIGN KEY(avaliacao) REFERENCES Avaliacao (id)
)

CREATE TABLE Aviso (
id INT AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(255),
descricao VARCHAR(255),
data DATE
)

CREATE TABLE Administrador (
id INT AUTO_INCREMENT PRIMARY KEY,
pessoa INT
)

CREATE TABLE Pessoa (
id INT AUTO_INCREMENT PRIMARY KEY,
cpf CHAR(11) UNIQUE,
data_nascimento DATE,
bairro VARCHAR(255),
cep CHAR(8),
telefone CHAR(11) UNIQUE,
celular CHAR(11) UNIQUE,
nome VARCHAR(255),
num_residencial INT,
endereco VARCHAR(255),
usuario INT UNIQUE
)

CREATE TABLE Usuario (
id INT AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(255) UNIQUE,
senha VARCHAR(50),
ultimo_acesso DATETIME
)

CREATE TABLE Instituicao (
id INT AUTO_INCREMENT PRIMARY KEY,
bairro VARCHAR(255),
num_comercial INT,
cnpj CHAR(14) UNIQUE,
quantidade_funcionarios INT,
endereco VARCHAR(255),
nome VARCHAR(255)
)

CREATE TABLE Certificado (
id INT AUTO_INCREMENT PRIMARY KEY,
data_inicio DATE,
data_final DATE,
data_emissao DATE,
carga_horaria INT,
curso VARCHAR(10),
aluno INT
)

CREATE TABLE Frequencia (
id INT AUTO_INCREMENT PRIMARY KEY,
percentual DECIMAL(10,1),
aluno INT
)

CREATE TABLE Aluno (
id INT AUTO_INCREMENT PRIMARY KEY,
situacao VARCHAR(255),
pessoa INT UNIQUE,
turma INT,
FOREIGN KEY(pessoa) REFERENCES Pessoa (id),
FOREIGN KEY(turma) REFERENCES Turma (id)
)

CREATE TABLE Curso (
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(10) UNIQUE,
carga_horaria_total INT
)

CREATE TABLE Relatorio (
id INT AUTO_INCREMENT PRIMARY KEY,
tipo VARCHAR(30),
data_emissao DATE,
data_inicio DATE,
data_final DATE,
funcionario INT,
FOREIGN KEY(funcionario) REFERENCES Funcionario (id)
)

CREATE TABLE Solicitacao (
id INT AUTO_INCREMENT PRIMARY KEY,
titulo VARCHAR(255),
data DATE,
status VARCHAR(20),
descricao VARCHAR(255),
aluno INT,
FOREIGN KEY(aluno) REFERENCES Aluno (id)
)

CREATE TABLE Pagamento (
id INT AUTO_INCREMENT PRIMARY KEY,
data_horario DATETIME,
cpf_pagador CHAR(11),
valor DECIMAL(10,2),
tipo VARCHAR(20),
status VARCHAR(20),
matricula INT
)

CREATE TABLE Matricula (
id INT AUTO_INCREMENT PRIMARY KEY,
status VARCHAR(20),
data_matricula DATE,
valor_total DECIMAL(10.2),
valor_parcelas DECIMAL(10,2),
parcelas INT,
progresso DECIMAL(10,1),
aluno INT,
curso INT,
FOREIGN KEY(aluno) REFERENCES Aluno (id),
FOREIGN KEY(curso) REFERENCES Curso (id)
)

CREATE TABLE Financeiro (
id INT AUTO_INCREMENT PRIMARY KEY,
funcionario INT UNIQUE,
FOREIGN KEY(funcionario) REFERENCES Funcionario (id)
)

CREATE TABLE Gestor (
id INT AUTO_INCREMENT PRIMARY KEY,
funcionario INT UNIQUE,
FOREIGN KEY(funcionario) REFERENCES Funcionario (id)
)

CREATE TABLE Secretaria (
id INT AUTO_INCREMENT PRIMARY KEY,
departamento VARCHAR(10),
funcionario INT UNIQUE,
FOREIGN KEY(funcionario) REFERENCES Funcionario (id)
)

ALTER TABLE Turma ADD FOREIGN KEY(turno) REFERENCES Turno (id)
ALTER TABLE curso_disciplina ADD FOREIGN KEY(curso) REFERENCES Curso (id)
ALTER TABLE curso_disciplina ADD FOREIGN KEY(disciplina) REFERENCES Disciplina (id)
ALTER TABLE professor_disciplina ADD FOREIGN KEY(professor) REFERENCES Professor (id)
ALTER TABLE Funcionario ADD FOREIGN KEY(pessoa) REFERENCES Pessoa (id)
ALTER TABLE Funcionario ADD FOREIGN KEY(turno) REFERENCES Turno (id)
ALTER TABLE Nota ADD FOREIGN KEY(aluno) REFERENCES Aluno (id)
ALTER TABLE Administrador ADD FOREIGN KEY(pessoa) REFERENCES Pessoa (id)
ALTER TABLE Pessoa ADD FOREIGN KEY(usuario) REFERENCES Usuario (id)
ALTER TABLE Certificado ADD FOREIGN KEY(aluno) REFERENCES Aluno (id)
ALTER TABLE Frequencia ADD FOREIGN KEY(aluno) REFERENCES Aluno (id)
ALTER TABLE Pagamento ADD FOREIGN KEY(matricula) REFERENCES Matricula (id)
