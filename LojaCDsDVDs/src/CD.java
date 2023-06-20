import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD() {
    }

    public CD(int c, double p, String n, int m) {
        super(c, p, n);
        nMusicas = m;
    }

    public String getTipo() {
        return "CD";
    }

    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    public void setMusicas(int m) {
        nMusicas = m;
    }

    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de músicas do CD: ");
        nMusicas = scanner.nextInt();
    }
}
