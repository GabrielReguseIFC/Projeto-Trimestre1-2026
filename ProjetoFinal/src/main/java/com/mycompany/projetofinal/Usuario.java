/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Usuario {

    private int id;
    private String login;
    private String senha;
    private int perfil;
    
    public Usuario (int id, String login, String senha, int perfil){
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }
    
    public boolean autenticar (String login, String senha){
        boolean ok = this.login.equals(login) && this.senha.equals(senha);
        System.out.println("Autenticação: " + (ok ? "bem sucedida" : "falhou") + "para" + login);
        return ok;
    }
    public void gerenciarTreino(Treinamento treinamento){
        if (hasPermissao(PerfilUsuario.COORDENADOR) || hasPermissao(PerfilUsuario.SUPERVISOR)) {
            System.out.println("Gerenciando treinamento: " + treinamento.getNome());
        }else{
            System.out.println("Sem permissão para gerenciar treinamentos");
        }
    }
    public boolean hasPermissao (int acao){
        return this.perfil == acao;
    }
    public int logout(){
        System.out.println("Usuario" + login + "desconectado");
        return 0;
    }
    
    public int getId (){
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    
    public String getLogin(){
        return login;
    }
    public void setLogin (String login){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public int getperfil (){
        return perfil;
    }
    public void setPerfil (int perfil){
        this.perfil = perfil;
    }
}
