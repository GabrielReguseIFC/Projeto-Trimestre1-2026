package com.mycompany.projetofinal;

import java.util.ArrayList;

public class Bombeiro {

    // atributos
    private int id;
    private String nome;
    private String cpf;
    private String matricula;
    private String dataNascimento;
    private String patente;
    private String especialidade;
    private String contato;
    private StatusBombeiro status;

    private ArrayList<Participacao> participacoes = new ArrayList<Participacao>();

    // construtor
    public Bombeiro(int id, String nome, String cpf, String matricula, String dataNascimento, String patente, String especialidade, String contato, StatusBombeiro status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.patente = patente;
        this.especialidade = especialidade;
        this.contato = contato;
        this.status = status;
    }

    // metodos
    public boolean cadastrar() {
        if (nome == null || nome.isEmpty()) {
            System.err.println("Erro: nome do bombeiro e obrigatorio.");
            return false;
        }
        System.out.println("Bombeiro cadastrado: " + nome);
        return true;
    }

    public String consultar() {
        return "Bombeiro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", patente=" + patente + ", status=" + status + "]";
    }

    public boolean atualizar() {
        System.out.println("Dados do bombeiro atualizados: " + nome);
        return true;
    }

    public boolean isAtivo() {
        return status == StatusBombeiro.ATIVO;
    }

    public String getHistoricoTreinamento() {
        String historico = "Historico de " + nome + ": ";
        for (int i = 0; i < participacoes.size(); i++) {
            Participacao p = participacoes.get(i);
            String nomeTreinamento = "N/A";
            if (p.getTreinamento() != null) {
                nomeTreinamento = p.getTreinamento().getNome();
            }
            historico = historico + " " + nomeTreinamento + ", status= " + p.getStatus() + ", nota= " + p.getNota() + ", frequencia= " + p.getFrequencia();
        }
        return historico;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public StatusBombeiro getStatus() {
        return status;
    }

    public void setStatus(StatusBombeiro status) {
        this.status = status;
    }

    public ArrayList<Participacao> getParticipacoes() {
        return participacoes;
    }

    public void adicionarParticipacao(Participacao p) {
        participacoes.add(p);
    }
}
