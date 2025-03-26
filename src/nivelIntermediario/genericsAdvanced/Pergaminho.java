package nivelIntermediario.genericsAdvanced;

public class Pergaminho {
    private String tipo;

    public Pergaminho(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo do pergaminho" + tipo;
    }
}
