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

    }
}
