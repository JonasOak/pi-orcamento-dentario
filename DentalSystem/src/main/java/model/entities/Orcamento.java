package model.entities;

import java.util.Date;
import java.util.Objects;

public class Orcamento {
    
    private Integer idOrcamento;
    private Date dataRegistro;
    private String plano;
    private Date dataAgendamento;
    private String observacao;
    
    private Cliente cliente;
    
    public Orcamento() {
    }

    public Orcamento(Integer idOrcamento, Date dataRegistro, String plano, Date dataAgendamento, String observacao, Cliente cliente) {
        this.idOrcamento = idOrcamento;
        this.dataRegistro = dataRegistro;
        this.plano = plano;
        this.dataAgendamento = dataAgendamento;
        this.observacao = observacao;
        this.cliente = cliente;
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idOrcamento);
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
        final Orcamento other = (Orcamento) obj;
        return Objects.equals(this.idOrcamento, other.idOrcamento);
    }

    @Override
    public String toString() {
        String clienteString = cliente != null ? cliente.toStringBuscaId() : "Cliente não especificado";
        return 
               "ID Orçamento: " + idOrcamento + "\n"
               + "Data Registro: " + dataRegistro + "\n"
               + "Plano: " + plano + "\n" 
               + "Data Agendamento: " + dataAgendamento + "\n" 
               + "Observação: " + observacao + "\n"
               + "ID Cliente: " + clienteString;
    }
    
    public String toStringBuscaCliente() {
        String clienteString = cliente != null ? cliente.toStringBuscaId() : "Cliente não especificado";
        return 
               "Nome Cliente: " + cliente.getNomeCliente() + "\n"
               + "ID Orçamento: " + idOrcamento + "\n"
               + "Data Registro: " + dataRegistro + "\n"
               + "Plano: " + plano + "\n" 
               + "Data Agendamento: " + dataAgendamento + "\n" 
               + "Observação: " + observacao + "\n";
    }
}