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

        // ArrayList com construtor
        ArrayList<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Toyota", "Corolla", 2022));
        listaCarros.add(new Carro("Honda", "Civic", 2020));
        listaCarros.add(new Carro("Hyundai", "HB20", 2019));

        for (Carro c : listaCarros) {
            c.exibir();

            // Vantagem do construtor:
            // Permite criar o objeto já com todos os dados definidos,
            // evitando ter que chamar vários setters depois.
            // Isso deixa o código mais organizado e seguro.
        }
    }
}