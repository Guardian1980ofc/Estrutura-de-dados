package e6_Inverter_mapa;

import estrutura.Mapa;

public class TesteInverter {
    public static void main(String[] args) {
        Mapa<Integer, String> original = new Mapa<>(10);
        original.inserir(1, "A");
        original.inserir(2, "B");
        original.inserir(3, "C");

        System.out.println("Mapa original:");
        System.out.println(original);

        Mapa<String, Integer> invertido = new Mapa<>(10);
        for (int i = 0; i < original.getTamanho(); i++) {
            invertido.inserir(original.getValor(i), original.getChave(i));
        }

        System.out.println("Mapa invertido:");
        System.out.println(invertido);
    }
}