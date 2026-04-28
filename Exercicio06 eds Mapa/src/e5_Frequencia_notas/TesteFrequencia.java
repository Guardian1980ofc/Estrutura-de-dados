package e5_Frequencia_notas;

import estrutura.Mapa;

public class TesteFrequencia {
    public static void main(String[] args) {
        int[] notas = {7, 8, 7, 10, 8, 7};

        Mapa<Integer, Integer> mapa = new Mapa<>(10);

        for (int nota : notas) {
            Integer count = mapa.buscar(nota);
            if (count == null) {
                mapa.inserir(nota, 1);
            } else {
                mapa.inserir(nota, count + 1);
            }
        }

        System.out.println(mapa);
    }
}