package exercicio01;

import java.util.ArrayList;

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

        carro1.exibir();
        carro2.exibir();

        int idadeCarro = carro1.idadeDoCarro();
        System.out.println(idadeCarro);

        int idadeCarro2 = carro2.idadeDoCarro();
        System.out.println(idadeCarro2);

        /*
         * Na Main, crie um ArrayList<Carro>. Adicione 3 carros na lista. Percorra com
         * for-each
         * chamando exibir() em cada um.
         * 
         * ArrayList<Tipo> nome = new ArrayList<Tipo>();
         */
        ArrayList<Carro> listaCarros = new ArrayList<>();

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2022;

        Carro c2 = new Carro();
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.ano = 2020;

        Carro c3 = new Carro();
        c3.marca = "Hyundai";
        c3.modelo = "HB20";
        c3.ano = 2019;

        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);
        for (Carro c : listaCarros) {
            c.exibir();
        }
    }
}
