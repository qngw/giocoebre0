public class giocatore {
    private String nome;
    private int stress;

    public giocatore(String nome) {
        this.nome = nome;
        this.stress = 0;
    }

    public void addStress(int value) {
        stress += value;
    }

    public int getStress() {
        return stress;
    }

    public String getNome() {
        return nome;
    }
}