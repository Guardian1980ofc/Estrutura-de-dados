package e1_Sistema_alunos;

import estrutura.Mapa;

public class TesteAlunos {
    public static void main(String[] args) {
        Mapa<Integer, String> mapa = new Mapa<>(10);

        mapa.inserir(1001, "Ana Silva");
        mapa.inserir(1002, "Carlos Souza");
        mapa.inserir(1003, "Maria Oliveira");
        mapa.inserir(1004, "João Santos");
        mapa.inserir(1005, "Fernanda Lima");

        System.out.println("Todos os alunos:");
        System.out.println(mapa);

        System.out.println("Buscar matrícula 1003: " + mapa.buscar(1003));

        mapa.remover(1002);
        System.out.println("Após remover 1002:");
        System.out.println(mapa);
    }
}