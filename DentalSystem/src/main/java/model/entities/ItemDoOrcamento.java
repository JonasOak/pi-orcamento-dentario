package model.entities;
import java.math.BigDecimal;

public class ItemDoOrcamento {
    
    private int idItemDoOrcamento;
    private Orcamento orcamento;
    private String dente;
    private String servico;
    private BigDecimal valor;
    
    public ItemDoOrcamento() {
    }

    public ItemDoOrcamento(int idItemDoOrcamento, Orcamento orcamento, String dente, String servico, BigDecimal valor) {
        this.idItemDoOrcamento = idItemDoOrcamento;
        this.orcamento = orcamento;
        this.dente = dente;
        this.servico = servico;
        this.valor = valor;
    }

    public int getIdItemDoOrcamento() {
        return idItemDoOrcamento;
    }

    public void setIdItemDoOrcamento(int idItemDoOrcamento) {
        this.idItemDoOrcamento = idItemDoOrcamento;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public String getDente() {
        return dente;
    }

    public void setDente(String dente) {
        this.dente = dente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idItemDoOrcamento;
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
        final ItemDoOrcamento other = (ItemDoOrcamento) obj;
        return this.idItemDoOrcamento == other.idItemDoOrcamento;
    }

    @Override
    public String toString() {
        return "ItemDoOrcamento"
               + "{" + "idItemDoOrcamento=" + idItemDoOrcamento
               + ", orcamento=" + orcamento 
               + ", dente=" + dente 
               + ", servico=" + servico 
               + ", valor=" + valor + '}';
    }
    
    
    
}
