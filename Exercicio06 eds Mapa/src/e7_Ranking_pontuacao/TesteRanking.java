package e7_Ranking_pontuacao;

import estrutura.Mapa;

public class TesteRanking {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>(10);

        mapa.inserir("Edoardo", 1500);
        mapa.inserir("Nicolas", 2300);
        mapa.inserir("Alecio", 1800);
        mapa.inserir("Ana", 2100);

        System.out.println("Ranking:");
        System.out.println(mapa);

        // Atualizar pontuação
        mapa.inserir("Edoardo", 2500);
        System.out.println("Após atualizar Edoardo:");
        System.out.println(mapa);

        // Maior pontuação
        String maior = mapa.getChave(0);
        int maxPontos = mapa.getValor(0);
        for (int i = 1; i < mapa.getTamanho(); i++) {
            if (mapa.getValor(i) > maxPontos) {
                maxPontos = mapa.getValor(i);
                maior = mapa.getChave(i);
            }
        }
        System.out.println("Maior pontuação: " + maior + " com " + maxPontos + " pontos");
    }
}