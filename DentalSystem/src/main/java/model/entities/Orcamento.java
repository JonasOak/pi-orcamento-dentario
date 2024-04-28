package model.entities;

import java.util.Date;

public class Orcamento {
    
    private int idOrcamento;
    private Date dataRegistro;
    private String plano;
    private Date dataAgendamento;
    private Cliente cliente;
    private String observacao;
    
    public Orcamento() {
    }

    public Orcamento(int idOrcamento, Date dataRegistro, String plano, Date dataAgendamento, Cliente cliente, String observacao) {
        this.idOrcamento = idOrcamento;
        this.dataRegistro = dataRegistro;
        this.plano = plano;
        this.dataAgendamento = dataAgendamento;
        this.cliente = cliente;
        this.observacao = observacao;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.idOrcamento;
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
        return this.idOrcamento == other.idOrcamento;
    }

    @Override
    public String toString() {
        return "Orcamento"
               + "{" + "idOrcamento=" + idOrcamento 
               + ", dataRegistro=" + dataRegistro 
               + ", plano=" + plano 
               + ", dataAgendamento=" + dataAgendamento 
               + ", cliente=" + cliente 
               + ", observacao=" + observacao + '}';
    } 
}
