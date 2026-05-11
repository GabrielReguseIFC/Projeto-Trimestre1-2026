package com.mycompany.projetofinal;

public class Participacao {

    // atributos
    private int id;
    private StatusParticipacao status;
    private double frequencia;
    private double nota;

    private Bombeiro bombeiro;
    private Treinamento treinamento;

    // construtor
    public Participacao(int id, StatusParticipacao status, double frequencia, double nota, Bombeiro bombeiro, Treinamento treinamento) {
        this.id = id;
        this.status = status;
        this.frequencia = frequencia;
        this.nota = nota;
        this.bombeiro = bombeiro;
        this.treinamento = treinamento;
    }

    // metodos
    public boolean registrar() {
        if (!validarParticipante()) {
            System.err.println("Erro: bombeiro inativo ou nao cadastrado.");
            return false;
        }
        System.out.println("Participacao registrada com sucesso.");
        return true;
    }

    public boolean atualizar() {
        System.out.println("Participacao atualizada: id=" + id);
        return true;
    }

    public boolean validarParticipante() {
        return bombeiro != null && bombeiro.isAtivo();
    }

    public boolean isConcluido() {
        return status == StatusParticipacao.CONCLUIDO;
    }

    // gets sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusParticipacao getStatus() {
        return status;
    }

    public void setStatus(StatusParticipacao status) {
        this.status = status;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }
}
