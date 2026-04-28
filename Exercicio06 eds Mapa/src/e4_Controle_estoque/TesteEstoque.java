package e4_Controle_estoque;

import estrutura.Mapa;

public class TesteEstoque {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>(10);

        mapa.inserir("Arroz", 50);
        mapa.inserir("Feijão", 30);
        mapa.inserir("Macarrão", 40);
        mapa.inserir("Óleo", 20);

        System.out.println("Estoque inicial:");
        System.out.println(mapa);

        // Simular venda de 5 unidades de Arroz
        int qtd = mapa.buscar("Arroz");
        mapa.inserir("Arroz", qtd - 5);

        System.out.println("Estoque após venda de 5 unidades de Arroz:");
        System.out.println(mapa);
    }
}