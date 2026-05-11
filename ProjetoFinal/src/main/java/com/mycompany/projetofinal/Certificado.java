package com.mycompany.projetofinal;

public class Certificado {

    // atributos
    private int id;
    private String dataEmissao;
    private int cargaHoraria;

    private Participacao participacao;
    private Treinamento treinamento;

    // construtor
    public Certificado(int id, String dataEmissao, int cargaHoraria, Participacao participacao, Treinamento treinamento) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.cargaHoraria = cargaHoraria;
        this.participacao = participacao;
        this.treinamento = treinamento;
    }

    // metodos
    public boolean emitir() {
        if (!validarEmissao()) {
            System.err.println("Erro: dados invalidos para emissao do certificado.");
            return false;
        }
        if (participacao == null || participacao.getStatus() != StatusParticipacao.CONCLUIDO) {
            System.err.println("Erro: certificado so pode ser emitido para participantes concluidos.");
            return false;
        }
        System.out.println("Certificado emitido em: " + dataEmissao);
        return true;
    }

    public boolean validarEmissao() {
        return dataEmissao != null && !dataEmissao.isEmpty() && cargaHoraria > 0;
    }

    public String consultar() {
        return "Certificado [id=" + id + ", dataEmissao=" + dataEmissao + ", cargaHoraria=" + cargaHoraria + "horas]";
    }

    // gets sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Participacao getParticipacao() {
        return participacao;
    }

    public void setParticipacao(Participacao participacao) {
        this.participacao = participacao;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }
}
