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

        // EXERCÍCIO 9 – final
        // Carro.ANO_PRIMEIRO_CARRO = 1900; // ERRO DE COMPILAÇÃO SE DESCOMENTAR
    }

}