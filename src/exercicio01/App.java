package exercicio01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("Subaru");
        carro1.setModelo("Impreza");
        carro1.setAno(2005);

        Carro carro2 = new Carro();
        carro2.setMarca("Honda");
        carro2.setModelo("Civic");
        carro2.setAno(2010);

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

        // ArrayList
        ArrayList<Carro> listaCarros = new ArrayList<>();

        Carro c1 = new Carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setAno(2022);

        Carro c2 = new Carro();
        c2.setMarca("Honda");
        c2.setModelo("Civic");
        c2.setAno(2020);

        Carro c3 = new Carro();
        c3.setMarca("Hyundai");
        c3.setModelo("HB20");
        c3.setAno(2019);

        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);

        for (Carro c : listaCarros) {
            c.exibir();
        }
    }
}