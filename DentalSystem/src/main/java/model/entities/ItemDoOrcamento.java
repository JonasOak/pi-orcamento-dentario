package model.entities;
import java.math.BigDecimal;
import java.util.Objects;

public class ItemDoOrcamento {
    
    private Integer idItemDoOrcamento;
    private String dente;
    private String servico;
    private BigDecimal valor;
    
    private Orcamento orcamento;
    
    public ItemDoOrcamento() {
    }

    public ItemDoOrcamento(Integer idItemDoOrcamento, String dente, String servico, BigDecimal valor, Orcamento orcamento) {
        this.idItemDoOrcamento = idItemDoOrcamento;
        this.dente = dente;
        this.servico = servico;
        this.valor = valor;
        this.orcamento = orcamento;
    }

    public Integer getIdItemDoOrcamento() {
        return idItemDoOrcamento;
    }

    public void setIdItemDoOrcamento(Integer idItemDoOrcamento) {
        this.idItemDoOrcamento = idItemDoOrcamento;
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

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idItemDoOrcamento);
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
        return Objects.equals(this.idItemDoOrcamento, other.idItemDoOrcamento);
    }
    
    @Override
    public String toString() {
        return
               + idItemDoOrcamento
               + "\n" + orcamento 
               + "\n" + dente 
               + "\n" + servico 
               + "\n" + valor;
    } 
}