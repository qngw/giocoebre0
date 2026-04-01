import java.util.Scanner;

import javax.swing.JOptionPane;

public class gioco {
    private giocatore giocatore1;
    private eventi eventi1;

    public gioco() {
        eventi1 = new eventi();
    }

    public void start() {
        String nome = JOptionPane.showInputDialog(null, "Inserisci il tuo nome:", "Benvenuto!", JOptionPane.QUESTION_MESSAGE);
        
        if (nome == null || nome.isEmpty()) nome = "MemeLord";
        
        giocatore1 = new giocatore(nome);
        
        // Avvia la GUI
        new GameGUI(giocatore1, eventi1);
    }
}

