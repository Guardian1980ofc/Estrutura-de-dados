public class Main {
    public static void main(String[] args) {

        Vetor testeVetor1 = new Vetor(3);
        testeVetor1.add("Maçã");
        testeVetor1.add("Banana");
        testeVetor1.add("Laranja");

        System.out.println("Tamanho do vetor numero 1 : " + testeVetor1.getTamanho());
        testeVetor1.imprimeUmPorLinha();

        Vetor testeVetor2 = new Vetor(10);
        testeVetor2.add("Playstation");
        testeVetor2.add("Xbox");
        testeVetor2.add("Nintendo");
        testeVetor2.add("Pc");

        System.out.println("Posição do elemento Xbox no vetor: "+ testeVetor2.buscar("Xbox"));
        System.out.println("Comtem pc no Vetor? : "+ testeVetor2.contem("Pc"));

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
    }
}
