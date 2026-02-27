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
        vetor[tamanho] = elemento;
        tamanho++;
    }

    public int buscar(String elemento){
        for (int i = 0;i < tamanho;i++){
            if (vetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void limpar(){
        tamanho = 0;
    }

    public int contarOcorrencias(String elemento){
        int ocorrencia = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i].equals(elemento)){
                ocorrencia ++;
            }
        }
        return ocorrencia;
    }


    /*public boolean substituir(String elemento, String novoElemento){
        if (buscar(elemento) != -1){
            vetor[buscar(elemento)] = novoElemento;
            return true;
        }
        return false;
    }*/
    public boolean substituir(String elemento, String novoElemento){
        int posicao = buscar(elemento);
        if (posicao != -1){
            vetor[posicao] = novoElemento;
            return true;
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
