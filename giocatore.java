public class giocatore {
    private String nome;
    private int stress;
    private int soldi;
    private int energia;
    private int socialCredit;

    public giocatore(String nome) {
        this.nome = nome;
        this.stress = 0;
        this.soldi = 100;
        this.energia = 100;
        this.socialCredit = 1000;
    }

    public void addStress(int value) {
        stress = Math.max(0, Math.min(100, stress + value));
    }

    public void addSoldi(int value) {
        soldi += value;
    }

    public void addEnergia(int value) {
        energia = Math.min(100, Math.max(0, energia + value));
    }

    public void addSocialCredit(int value) {
        socialCredit = Math.max(0, socialCredit + value);
    }

    public int getStress() {
        return stress;
    }

    public int getSoldi() {
        return soldi;
    }

    public int getEnergia() {
        return energia;
    }

    public int getSocialCredit() {
        return socialCredit;
    }

    public String getNome() {
        return nome;
    }

    public void displayStatus() {
        String colorStress = (stress > 70) ? "\u001B[31m" : "\u001B[32m";
        String colorEnergia = (energia < 30) ? "\u001B[31m" : "\u001B[34m";
        String colorSocial = (socialCredit < 500) ? "\u001B[31m" : "\u001B[36m";
        
        System.out.println("\n\u001B[33m[ STATISTICHE DI " + nome.toUpperCase() + " ]\u001B[0m");
        System.out.println("😰 Stress: " + colorStress + stress + "\u001B[0m");
        System.out.println("⚡ Energia: " + colorEnergia + energia + "/100\u001B[0m");
        System.out.println("💰 Soldi: \u001B[33m" + soldi + "€\u001B[0m");
        System.out.println("⭐ Social Credit: " + colorSocial + socialCredit + "\u001B[0m");
        System.out.println("--------------------------------");
    }
}