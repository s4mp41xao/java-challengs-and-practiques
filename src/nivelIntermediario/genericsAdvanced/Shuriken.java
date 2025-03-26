package nivelIntermediario.genericsAdvanced;

public class Shuriken {
    private int tamanho;

    public Shuriken(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Tamanho da Shuriken: " + tamanho;
    }
}
