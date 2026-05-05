
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class Treinamento {

    // Atributos
    private int id;
    private String nome;
    private String descricao;
    private TipoTreinamento tipo;
    private int cargaHoraria;
    private Date dataInicio;
    private Date dataFim;
    private StatusTreinamento status;
    private String local;

    // Relacionamentos
    private Instituicao instituicao;
    private Instrutor instrutor;
    private Certificado certificado;
    private List<Participacao> participacoes = new ArrayList<>();

    // Construtores
    public Treinamento(int id, String nome, String descricao, TipoTreinamento tipo, int cargaHoraria, Date dataInicio, Date dataFim, StatusTreinamento status, String local, Instituicao instituicao, Instrutor instrutor, Certificado certificado) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.cargaHoraria = cargaHoraria;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.local = local;
        this.instituicao = instituicao;
        this.instrutor = instrutor;
        this.certificado = certificado;
    }

    // Metodos
    public boolean cadastrar() {
        if (validarDados()) {
            System.out.println("Treinamento cadastrado: " + nome);
            return true;
        }
        return false;
    }

    public String consultar(List<String> filtros) {
        return "Treinamento [id=" + id + ", nome=" + nome + ", statu=" + status + "local=" + local + "]";
    }

    public boolean atualizar() {
        System.out.println("Treinamento atualiado: " + nome);
        return true;
    }

    public boolean excluir() {
        if (verificarVinculos) {
            System.out.println("Não é possivel apagar: treinamento possui vinculos");
            return false;
        }
        System.out.println("Treinamento excluido: " + nome);
        return true;
    }

    public boolean validarDados() {
        return nome != null && !nome.isEmpty() && cargaHoraria > 0 && dataInicio != null && dataFim != null && !dataFim.before(dataInicio);
    }

    public void acessarParticipantes(Bombeiro bombeiro) {
        System.out.println("Participações: " + bombeiro.getNome() + " no treinamento " + nome + ":");
        for (Participacao p : participacoes) {
            if (p.getBombeiro() != null && p.getBombeiro().getId() == bombeiro.getId()) {
                System.out.println("status: " + p.getStatus() + " nota: " + p.getNota() + " fre: " + p.getFrequencia() + "%");
            }
        }
    }

    public boolean inativar() {
        this.status = StatusTreinamento.CANCELADO;
        System.out.println("Treinamento inativado: " + nome);
        return true;
    }

    public boolean verificarVinculos() {
        return this.certificado != null || !this.participacoes.isEmpty();
    }

    // Gets Sets
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
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

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public List<Participacao> getParticipacoes() {
        return participacoes;
    }

    public void setParticipacoes(List<Participacao> participacoes) {
        this.participacoes = participacoes;
    }

}
