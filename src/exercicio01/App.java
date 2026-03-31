/*Exercício 1 – Classe e objeto
Crie uma classe Carro com atributos: marca (String), modelo (String) e ano (int). Na Main:
a) Crie dois objetos Carro e atribua valores diretamente nos atributos.
b) Imprima os dados de cada carro no console. */

package exercicio01;

public class App {
    public static void main(String[] args){
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
    } 
}
