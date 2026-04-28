package estrutura;

public class Mapa<K, V> {
    private Object[] chaves;
    private Object[] valores;
    private int tamanho;

    public Mapa(int capacidade) {
        chaves = new Object[capacidade];
        valores = new Object[capacidade];
        tamanho = 0;
    }

    public void inserir(K chave, V valor) {
        for (int i = 0; i < tamanho; i++) {
            if (chaves[i].equals(chave)) {
                valores[i] = valor;
                return;
            }
        }
        chaves[tamanho] = chave;
        valores[tamanho] = valor;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    public V buscar(K chave) {
        for (int i = 0; i < tamanho; i++) {
            if (chaves[i].equals(chave)) {
                return (V) valores[i];
            }
        }
        return null;
    }

    public boolean remover(K chave) {
        for (int i = 0; i < tamanho; i++) {
            if (chaves[i].equals(chave)) {
                for (int j = i; j < tamanho - 1; j++) {
                    chaves[j] = chaves[j + 1];
                    valores[j] = valores[j + 1];
                }
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    @SuppressWarnings("unchecked")
    public K getChave(int indice) {
        return (K) chaves[indice];
    }

    @SuppressWarnings("unchecked")
    public V getValor(int indice) {
        return (V) valores[indice];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(chaves[i]).append(" → ").append(valores[i]).append("\n");
        }
        return sb.toString();
    }
}