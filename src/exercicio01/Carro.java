package exercicio01;

public class Carro {
    static int totalCarros = 0;
    private String marca;
    private String modelo;
    private int ano;

    // CONSTRUTOR PARAMETRIZADO
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano); // usa a validação
        totalCarros++;
    }

    // CONSTRUTOR VAZIO
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    // GETTERS
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // MÉTODOS
    void exibir() {
        System.out.println(marca + " | " + modelo + " | " + ano);
    }

    int idadeDoCarro() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - ano;

    }

    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);

        // System.out.println(modelo); // ERRO! Se descomentar acontece non-static variable modelo cannot be referenced from a static context
        // Um método static não pode acessar atributos de instância (como "modelo")
        // porque ele pertence à classe e não a um objeto específico.
        // Para acessar "modelo", seria necessário ter um objeto criado.
    }
}