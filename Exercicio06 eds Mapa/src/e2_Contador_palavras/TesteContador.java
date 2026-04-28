package e2_Contador_palavras;

import estrutura.Mapa;

public class TesteContador {
    public static void main(String[] args) {
        String frase = "java java mapa lista mapa mapa";
        String[] palavras = frase.split(" ");

        Mapa<String, Integer> mapa = new Mapa<>(10);

        for (String palavra : palavras) {
            Integer count = mapa.buscar(palavra);
            if (count == null) {
                mapa.inserir(palavra, 1);
            } else {
                mapa.inserir(palavra, count + 1);
            }
        }

        System.out.println(mapa);
    }
}