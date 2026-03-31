/*Exercício 1 – Classe e objeto
Crie uma classe Carro com atributos: marca (String), modelo (String) e ano (int). Na Main:
a) Crie dois objetos Carro e atribua valores diretamente nos atributos.
b) Imprima os dados de cada carro no console. */

package exercicio01;

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Subaru";
        carro1.modelo = "impreza";
        carro1.ano = 2005;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2010;

        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

        /*
         * Exercício 2 – Método void vs método com retorno
         * Na classe Carro:
         * a) Crie um método void exibir() que imprime marca, modelo e ano formatados.
         * b) Crie um método int idadeDoCarro() que retorna 2026 - ano.
         * c) Na Main, chame os dois métodos. Comente no código: qual devolve valor?
         * Qual só executa uma ação?
         */

        carro1.exibir();
        carro2.exibir();
        /*
         * O método exibir() é do tipo void, ou seja, NÃO retorna valor. Ele apenas executa uma ação.
         * -----------------------------------
         */

        int idadeCarro = carro1.idadeDoCarro();
        System.out.println(idadeCarro);

        int idadeCarro2 = carro2.idadeDoCarro();
        System.out.println(idadeCarro2);
        /*
         * - O método idadeDoCarro() retorna um valor do tipo int.Esse valor pode ser armazenado em uma variável ou usado diretamente.
         */
    }
}
