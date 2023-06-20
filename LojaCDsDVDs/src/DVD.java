import java.util.Scanner;

import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
    }

    public DVD(int c, double p, String n, int f) {
        super(c, p, n);
        nFaixas = f;
    }

    public String getTipo() {
        return "DVD";
    }

    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        nFaixas = f;
    }

    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de faixas do DVD: ");
        nFaixas = scanner.nextInt();
    }
}
