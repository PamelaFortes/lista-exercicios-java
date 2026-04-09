package exercicio01;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    // CONSTRUTOR PARAMETRIZADO
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano); // usa a validação
    }

    // CONSTRUTOR VAZIO (mantido se você já estava usando)
    public Carro() {}

    // GETTERS
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    // SETTERS
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // MÉTODOS
    void exibir() {
        System.out.println("----------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    int idadeDoCarro() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - ano;
    }
}