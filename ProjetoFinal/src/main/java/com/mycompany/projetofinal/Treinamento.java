package com.mycompany.projetofinal;

import java.util.ArrayList;

public class Treinamento {

    // atributos
    private int id;
    private String nome;
    private String descricao;
    private TipoTreinamento tipo;
    private int cargaHoraria;
    private String dataInicio;
    private String dataFim;
    private StatusTreinamento status;
    private String local;

    private Instituicao instituicao;
    private Instrutor instrutor;
    private ArrayList<Participacao> participacoes = new ArrayList<Participacao>();
    private ArrayList<Certificado> certificados = new ArrayList<Certificado>();

    // construtor
    public Treinamento(int id, String nome, String descricao, TipoTreinamento tipo, int cargaHoraria, String dataInicio, String dataFim, StatusTreinamento status, String local, Instrutor instrutor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.cargaHoraria = cargaHoraria;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.local = local;
        this.instrutor = instrutor;
    }

    // metodos
    public boolean cadastrar() {
        if (!validarDados()) {
            System.err.println("Erro: dados invalidos para o treinamento.");
            return false;
        }
        System.out.println("Treinamento cadastrado: " + nome);
        return true;
    }

    public String consultar() {
        return "Treinamento [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", status=" + status + ", local=" + local + "]";
    }

    public boolean atualizar() {
        System.out.println("Treinamento atualizado: " + nome);
        return true;
    }

    public boolean excluir() {
        if (verificarVinculos()) {
            System.out.println("Exclusao nao permitida: treinamento possui certificados emitidos.");
            return false;
        }
        System.out.println("Treinamento excluido: " + nome);
        return true;
    }

    public boolean validarDados() {
        if (nome == null || nome.isEmpty()) {
            return false;
        }
        if (cargaHoraria <= 0) {
            return false;
        }
        if (dataInicio == null || dataFim == null) {
            return false;
        }
        if (tipo == TipoTreinamento.EXTERNO && instituicao == null) {
            System.err.println("Erro: treinamento externo precisa de uma instituicao.");
            return false;
        }
        return true;
    }

    public void acessarParticipantes() {
        System.out.println("Participantes do treinamento: " + nome);
        for (int i = 0; i < participacoes.size(); i++) {
            Participacao p = participacoes.get(i);
            String nomeBombeiro = "desconhecido";
            if (p.getBombeiro() != null) {
                nomeBombeiro = p.getBombeiro().getNome();
            }
            System.out.println("  - " + nomeBombeiro + " | " + p.getStatus());
        }
    }

    public boolean inativar() {
        this.status = StatusTreinamento.CANCELADO;
        System.out.println("Treinamento inativado: " + nome);
        return true;
    }

    public boolean verificarVinculos() {
        return certificados.size() > 0;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoTreinamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoTreinamento tipo) {
        this.tipo = tipo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public StatusTreinamento getStatus() {
        return status;
    }

    public void setStatus(StatusTreinamento status) {
        this.status = status;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ArrayList<Participacao> getParticipacoes() {
        return participacoes;
    }

    public void adicionarParticipacao(Participacao p) {
        participacoes.add(p);
    }

    public ArrayList<Certificado> getCertificados() {
        return certificados;
    }

    public void adicionarCertificado(Certificado c) {
        certificados.add(c);
    }
}
