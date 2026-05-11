/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

/**
 *
 * @author aluno
 */
public class Participacao {
    //atributos
    private int id;
    private StatusParticipacao status;
    private String nome;
    private double frequencia;
    private double rota;
    
    //relaconamentos
    private Bombeiro bombeiro;
    private Treinamento treinamento;
    private Certificado certificado;
    
    //construtor

    public Participacao(int id, StatusParticipacao status, String nome, double frequencia, double rota, Bombeiro bombeiro, Treinamento treinamento) {
        this.id = id;
        this.status = status;
        this.nome = nome;
        this.frequencia = frequencia;
        this.rota = rota;
        this.bombeiro = bombeiro;
        this.treinamento = treinamento;
    }
    
    //metodos
    public boolean registrar(){
        System.out.println("Participacao registrada para: " + nome);
        return true;
    }
    
    public boolean atualizar(){
        System.out.println("Participacao atualizada: id= " + id);
        return true;
    }
    
    public boolean validarParticipacao(){
        return bombeiro != null && bombeiro.isAtivo();
    }
    
    public boolean isConcluido()
    //get set
}
