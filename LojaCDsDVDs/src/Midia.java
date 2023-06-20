import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }

    public Midia(int c, double p, String n) {
        codigo = c;
        preco = p;
        nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: " + preco;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da mídia: ");
        codigo = scanner.nextInt();
        System.out.print("Digite o preço da mídia: ");
        preco = scanner.nextDouble();
        System.out.print("Digite o nome da mídia: ");
        scanner.nextLine(); // Consumir a nova linha pendente
        nome = scanner.nextLine();
    }
}
