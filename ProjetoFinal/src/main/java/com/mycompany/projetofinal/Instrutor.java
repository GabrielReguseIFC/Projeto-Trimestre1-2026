package com.mycompany.projetofinal;

public class Instrutor {

    // atributos
    private int id;
    private String nome;
    private String especialidade;
    private TipoInstrutor tipo;

    // construtor
    public Instrutor(int id, String nome, String especialidade, TipoInstrutor tipo) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.tipo = tipo;
    }

    // metodos
    public String consultar() {
        return "Instrutor [id=" + id + ", nome=" + nome
                + ", especialidade=" + especialidade + ", tipo=" + tipo + "]";
    }

    public boolean atualizar() {
        System.out.println("Instrutor atualizado: " + nome);
        return true;
    }

    public boolean getTreinoMinistrado() {
        System.out.println("Buscando treinamentos ministrados por: " + nome);
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public TipoInstrutor getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstrutor tipo) {
        this.tipo = tipo;
    }
}
