public class Main {
    public static void main(String[] args) {

        System.out.println("Teste numero 1...");
        System.out.println("-=".repeat(30));
        Vetor testeVetor1 = new Vetor(3);
        testeVetor1.add("Maçã");
        testeVetor1.add("Banana");
        testeVetor1.add("Laranja");


        System.out.println("Tamanho do vetor numero 1 : " + testeVetor1.getTamanho());
        testeVetor1.imprimeUmPorLinha();
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 2...");
        System.out.println("-=".repeat(30));
        Vetor testeVetor2 = new Vetor(10);
        testeVetor2.add("Playstation");
        testeVetor2.add("Xbox");
        testeVetor2.add("Nintendo");
        testeVetor2.add("Pc");

        System.out.println("Posição do elemento Xbox no vetor: "+ testeVetor2.buscar("Xbox"));
        System.out.println("Comtem pc no Vetor? : "+ testeVetor2.contem("Pc"));
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 3...");
        System.out.println("-=".repeat(30));
        Vetor testeVetor3 = new Vetor(5);
        try{
            System.out.println(testeVetor3.ultimo());
        }
        catch(IllegalStateException e){
        System.out.println(e.getMessage());
        }

        testeVetor3.add("Edoardo");
        testeVetor3.add("Alecio");
        testeVetor3.add("Nicolas");

        System.out.println("O ultimo do vetor 3: " + testeVetor3.ultimo());
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 4...");
        Vetor testeVetor4 =  new Vetor(5);

        testeVetor4.add("Yakisoba");
        testeVetor4.add("Hamburguer");
        testeVetor4.add("Pizza");
        testeVetor4.add("Salgado");
        testeVetor4.add("Refrigerante");

        testeVetor4.imprimeUmPorLinha();
        System.out.println("Limpando lista...");
        testeVetor4.limpar();
        System.out.println(testeVetor4.getTamanho());

        testeVetor4.add("Pizza");
        testeVetor4.add("Yakisoba");
        testeVetor4.add("Pizza");
        testeVetor4.add("Salgado");
        testeVetor4.add("Pizza");

        System.out.println("O numero de vezes que O elemento Pizza apareceram foi: " + testeVetor4.contarOcorrencias("Pizza"));

        System.out.println("Substituindo Pizza por Hamburguer: " + testeVetor4.substituir("Pizza", "Hamburguer"));
        testeVetor4.imprimeUmPorLinha();

        System.out.println(" ");

        System.out.println("Tentendo substituir Macarronada por Salgado: " + testeVetor4.substituir("Macarronada", "Salgado"));
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 5...");
        Vetor testeVetor5 = new Vetor(5);

        testeVetor5.add("A");
        testeVetor5.add("B");
        testeVetor5.add("C");
        testeVetor5.add("D");
        testeVetor5.add("E");

        testeVetor5.remover(0);
        testeVetor5.imprimeUmPorLinha();
        System.out.println(testeVetor5.getTamanho());

        testeVetor5.remover(1);
        testeVetor5.imprimeUmPorLinha();
        System.out.println(testeVetor5.getTamanho());

        testeVetor5.remover(2);
        testeVetor5.imprimeUmPorLinha();
        System.out.println(testeVetor5.getTamanho());

        try{
            testeVetor5.remover(7);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 6...");
        Vetor testeVetor6 = new Vetor(5);

        testeVetor6.add("A");
        testeVetor6.add("B");
        testeVetor6.add("C");
        testeVetor6.add("D");
        testeVetor6.add("E");

        System.out.println(testeVetor6.remover("B"));
        testeVetor6.imprimeUmPorLinha();
        System.out.println(testeVetor6.getTamanho());

        System.out.println(testeVetor6.remover("X"));
        testeVetor6.imprimeUmPorLinha();
        System.out.println(testeVetor6.getTamanho());
        System.out.println("-=".repeat(30));

        //TODO Testes extras
        System.out.println("Teste numero 7...");
        Vetor testeVetor7 = new Vetor(6);

        testeVetor7.add("A");
        testeVetor7.add("B");
        testeVetor7.add("C");
        testeVetor7.add("B");
        testeVetor7.add("D");
        testeVetor7.add("B");

        System.out.println(testeVetor7.indiceUltimo("B"));
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 8...");
        Vetor testeVetor8 = new Vetor(6);

        testeVetor8.add("A");
        testeVetor8.add("B");
        testeVetor8.add("C");
        testeVetor8.add("B");
        testeVetor8.add("D");
        testeVetor8.add("B");

        testeVetor8.removerTodos("B");
        testeVetor8.imprimeUmPorLinha();
        System.out.println(testeVetor8.getTamanho());

        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 9...");
        Vetor testeVetor9 = new Vetor(6);

        testeVetor9.add("A");
        testeVetor9.add("B");
        testeVetor9.add("C");
        testeVetor9.add("D");
        testeVetor9.add("E");

        System.out.println(testeVetor9.addSeNaoExistente("F"));
        testeVetor9.imprimeUmPorLinha();
        System.out.println(testeVetor9.getTamanho());

        System.out.println(testeVetor9.addSeNaoExistente("C"));
        System.out.println("-=".repeat(30));

        System.out.println("Teste numero 10...");
        Vetor testeVetor10 = new Vetor(4);

        testeVetor10.add("A");
        testeVetor10.add("C");
        testeVetor10.add("D");

        System.out.println(testeVetor10.inserirDepois("A","B"));
        testeVetor10.imprimeUmPorLinha();
        System.out.println(testeVetor10.getTamanho());

    }
}
