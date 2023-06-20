public class main {

    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.inserirDados();
        System.out.println("\nDetalhes do DVD:");
        dvd.printDados();

        System.out.println();

        CD cd = new CD();
        cd.inserirDados();
        System.out.println("\nDetalhes do CD:");
        cd.printDados();
    }
    
}
