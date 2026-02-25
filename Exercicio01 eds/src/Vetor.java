public class Vetor {

    private int tamanho;
    private String[] vetor;

    Vetor(int capacidade){
        this.tamanho = 0;
        this.vetor = new String[capacidade];
    }

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

    //versão sem reutilizar codigo

    /*public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }*/

    public boolean contem(String elemento){
        return buscar(elemento) != -1;
    }


    public void add(String elemento){
        if (vetor.length == tamanho) {
            throw new ArrayIndexOutOfBoundsException("Essse vetor está cheio");
        }
        if (contem(elemento) == false) {
            vetor[tamanho] = elemento;
            tamanho++;
        }
    }

    public int buscar(String elemento){
        for (int i = 0;i < tamanho;i++){
            if (vetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
