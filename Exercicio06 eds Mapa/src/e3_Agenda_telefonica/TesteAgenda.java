package e3_Agenda_telefonica;

import estrutura.Mapa;

public class TesteAgenda {
    public static void main(String[] args) {
        Mapa<String, String> mapa = new Mapa<>(10);

        mapa.inserir("Ana", "(83) 99999-1111");
        mapa.inserir("Carlos", "(83) 99999-2222");
        mapa.inserir("Maria", "(83) 99999-3333");
        mapa.inserir("João", "(83) 99999-4444");

        System.out.println("Todos os contatos:");
        System.out.println(mapa);

        System.out.println("Telefone de Maria: " + mapa.buscar("Maria"));

        mapa.remover("Carlos");
        System.out.println("Após remover Carlos:");
        System.out.println(mapa);
    }
}