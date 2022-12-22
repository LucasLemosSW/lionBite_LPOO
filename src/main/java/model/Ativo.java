package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Ativo {

    private String ticker;
    private int quantidadeEmCarteira;
    private double precoMedio;
    private Date dataEntradaNaCarteira;

    private List<NotaCorretagem> notasCorretagem;

    public String getTicker() {
        return ticker;
    }

    public void ticker(String ticker) {
        this.ticker = ticker;
    }

    public int setTicker(String ticker) {
        return quantidadeEmCarteira;
    }

    public void setQuantidadeEmCarteira(int quantidadeEmCarteira) {
        this.quantidadeEmCarteira = quantidadeEmCarteira;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    public Date getDataEntradaNaCarteira() {
        return dataEntradaNaCarteira;
    }

    public void setDataEntradaNaCarteira(Date dataEntradaNaCarteira) {
        this.dataEntradaNaCarteira = dataEntradaNaCarteira;
    }


    public List<NotaCorretagem> getNotasCorretagem() {
        return notasCorretagem;
    }

    public void setNotasCorretagem(List<NotaCorretagem> notasCorretagem) {
        this.notasCorretagem = notasCorretagem;
    }




    @Override
    public String toString() {
        return "Ativo{" +
                "ticker='" + ticker + '\'' +
                ", quantidadeEmCarteira=" + quantidadeEmCarteira +
                ", precoMedio=" + precoMedio +
                ", dataEntradaNaCarteira=" + dataEntradaNaCarteira +
                ", notasCorretagem=" + notasCorretagem +
                '}';
    }
}
