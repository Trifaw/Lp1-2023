package model;

import repository.ExibirInterface;

public class Pedido extends Orcamento implements ExibirInterface {
    private String DataEntrega;
    private Boolean Entrega = false;

    public Pedido(String dataEntrega) {
        DataEntrega = dataEntrega;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public Boolean getEntrega() {
        return Entrega;
    }

    public void setDataEntrega(String dataEntrega) {
        DataEntrega = dataEntrega;
    }
}
