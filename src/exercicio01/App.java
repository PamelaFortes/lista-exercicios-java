package exercicio01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Subaru", "Impreza", 2005);
        Carro carro2 = new Carro("Honda", "Civic", 2010);

        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());

        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());

        carro1.exibir();
        carro2.exibir();

        System.out.println("Idade carro 1: " + carro1.idadeDoCarro());
        System.out.println("Idade carro 2: " + carro2.idadeDoCarro());

        ArrayList<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Toyota", "Corolla", 2022));
        listaCarros.add(new Carro("Honda", "Civic", 2020));
        listaCarros.add(new Carro("Hyundai", "HB20", 2019));

        for (Carro c : listaCarros) {
            c.exibir();
        }
        Carro carro3 = new Carro();
        carro3.exibir();

        // EXERCÍCIO 7 – static
        Carro carro4 = new Carro("A", "B", 2000);
        Carro carro5 = new Carro("C", "D", 2001);
        Carro carro6 = new Carro("E", "F", 2002);
        Carro carro7 = new Carro("G", "H", 2003);
        Carro carro8 = new Carro("I", "J", 2004);

        System.out.println("Total de carros: " + Carro.totalCarros);
        Carro.imprimirTotal();

        /*
         * public static void main(String[] args) {
         * if (true) {
         * int x = 10;
         * }
         * System.out.println(x);
         * }
         * 
         * b) corrigido abaixo
         */
        int x;

        if (true) {
            x = 10;
        }

        System.out.println(x);
        /*
         * a) Não compila, porque x foi criada dentro do if e não existe fora dele.
         * 
         * c) Escopo é a área do código onde uma variável existe.
         * A variável x foi criada dentro do bloco "if", então só existe lá dentro.
         * Fora do if ela não pode ser acessada.
         * Para resolver, declaramos a variável fora do bloco.
         */

        // EXERCÍCIO 11 – valor (primitivo)

        int a = 10;
        int b = a;

        b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*a)
         * a = 10
         * b = 99
         * 
         * b) Alterar b não mudou a porque tipos primitivos são copiados por valor.
         * Isso significa que b recebe uma cópia do valor de a.
         * Depois disso, cada variável é independente.
         */
    }

}