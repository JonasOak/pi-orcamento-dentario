package model.entities;

import java.util.Objects;

public class Cliente {
    
    private static final long serialVersionUID = 1L;
    
    private Integer idCliente;
    private String nomeCliente;
    private String endereco;
    private String uf;
    private String telefone;
    private String documento;
    private String email;
    
    public Cliente() {  
    }

    public Cliente(Integer idCliente, String nomeCliente, String endereco, String uf, String telefone, String documento, String email) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.uf = uf;
        this.telefone = telefone;
        this.documento = documento;
        this.email = email;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
        hash = 97 * hash + Objects.hashCode(this.idCliente);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.idCliente, other.idCliente);
    }

    @Override
    public String toString() {
        return 
               + idCliente 
               + "\n" + nomeCliente 
               + "\n" + endereco
               + "\n" + uf
               + "\n" + telefone
               + "\n" + documento 
               + "\n" + email;
    } 
}