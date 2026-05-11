package com.mycompany.projetofinal;

public class Instituicao {

    // atributos
    private int id;
    private String nome;
    private String cnpj;
    private String contato;

    // construtor
    public Instituicao(int id, String nome, String cnpj, String contato) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
    }

    // metodos
    public boolean cadastrar() {
        if (nome == null || nome.isEmpty()) {
            System.err.println("Erro: nome da instituicao e obrigatorio.");
            return false;
        }
        System.out.println("Instituicao cadastrada: " + nome);
        return true;
    }

    public String consultar() {
        return "Instituicao [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + "]";
    }

    public boolean atualizar() {
        System.out.println("Instituicao atualizada: " + nome);
        return true;
    }

    // gets sets
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
