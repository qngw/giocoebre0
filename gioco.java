import java.util.Scanner;

public class gioco {
    private giocatore giocatore1;
    private  eventi eventi1;
    private Scanner scanner;

    public gioco() {
        scanner = new Scanner(System.in);
        eventi1 = new eventi();
    }

    public void start() {
        System.out.println("=== LIFE SIMULATOR MEME ===");
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        giocatore1 = new giocatore(nome);

        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Giorno " + (i + 1) + " ---");
            eventi1.randomEvent(giocatore1, scanner);
        }

        System.out.println("\nFINE GIOCO 💀");
        System.out.println("Stress finale: " + giocatore1.getStress());
    }
}