package model.entities;

import java.util.Objects;

public class Usuario {
    
    private Integer idUsuario;
    private String nome;
    private String cargo;
    private String login;
    private String senha;
    private String email;
    
    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nome, String cargo, String login, String senha, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.idUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.idUsuario, other.idUsuario);
    }

    @Override
    public String toString() {
        return
               + idUsuario 
               + "\n" + nome 
               + "\n" + cargo 
               + "\n" + login 
               + "\n" + senha 
               + "\n" + email;
    }   
}