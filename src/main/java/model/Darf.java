package model;

public class Darf {

    private int codDarf;

    private double valor;
    private int codigoDoImposto;

    public int getCodDarf() {
        return codDarf;
    }

    public void setCodDarf(int codDarf) {
        this.codDarf = codDarf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigoDoImposto() {
        return codigoDoImposto;
    }

    public void setCodigoDoImposto(int codigoDoImposto) {
        this.codigoDoImposto = codigoDoImposto;
    }

    @Override
    public String toString() {
        return "Darf{" +
                "codDarf=" + codDarf +
                ", valor=" + valor +
                ", codigoDoImposto=" + codigoDoImposto +
                '}';
    }
}
