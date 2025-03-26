package nivelIntermediario.genericsAdvanced;

public class Kunai {
    private String tipo;

    public Kunai(String tipo) {
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
        return "Tipo da kunai: " + tipo;
    }
}
