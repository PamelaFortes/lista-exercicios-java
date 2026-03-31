package exercicio01;

public class Carro {
    String marca;
    String modelo;
    int ano;

    void exibir() { // método void
        System.out.println("----------------");
        System.out.println("Carro1:");
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
    }

    // método de retorno
    int idadeDoCarro() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - ano;
    }
}
