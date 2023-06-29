package model;

import repository.ExibirInterface;

import java.util.List;

public class Orcamento implements ExibirInterface {
    private static Long IdBase;
    private Long id;
    private List <ItemPedido> Itens;
    private Double ValorTotal;

    public Orcamento() {
        IdBase ++;
        id = IdBase;
    }

    public static Long getIdBase() {
        return IdBase;
    }

    public static void setIdBase(Long idBase) {
        IdBase = idBase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemPedido> getItens() {
        return Itens;
    }

    public void setItens(List<ItemPedido> itens) {
        Itens = itens;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        ValorTotal = valorTotal;
    }

    @Override
    public void exibir(boolean cmpleto) {

    }
}
