package com.mycompany.projetofinal;

public class Usuario {

    // atributos
    private int id;
    private String login;
    private String senha;
    private PerfilUsuario perfil;

    // construtor
    public Usuario(int id, String login, String senha, PerfilUsuario perfil) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    // metodos
    public boolean autenticar(String login, String senha) {
        if (this.login.equals(login) && this.senha.equals(senha)) {
            System.out.println("Login bem-sucedido: " + login);
            return true;
        }
        System.err.println("Login ou senha incorretos.");
        return false;
    }

    public void gerenciarTreino(Treinamento treinamento) {
        if (perfil == PerfilUsuario.COORDENADOR || perfil == PerfilUsuario.SUPERVISOR) {
            System.out.println("Gerenciando treinamento: " + treinamento.getNome());
        } else {
            System.out.println("Sem permissao para gerenciar treinamentos.");
        }
    }

    public boolean hasPermissao(PerfilUsuario perfilNecessario) {
        return this.perfil == perfilNecessario;
    }

    public int logout() {
        System.out.println("Usuario " + login + " desconectado.");
        return 0;
    }

    // gets sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }
}
