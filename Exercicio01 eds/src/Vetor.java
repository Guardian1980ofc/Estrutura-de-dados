public class Vetor {

    private int tamanho;
    private String[] vetor;

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public String ultimo() {
        if (estaVazio()) {
            throw new IllegalStateException("O vetor está vazio.");

        }
        return vetor[tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);

        }
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
}
