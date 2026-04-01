import javax.swing.*;
import java.awt.*;

public class GameGUI {
    private JFrame frame;
    private JLabel labelNome, labelGiorno, labelSoldi, labelSocial, labelEventContent;
    private JProgressBar barStress, barEnergia;
    private JButton btnChoice1, btnChoice2, btnMarket, btnContinua;
    private JLabel imgPlayer, imgEvent;
    
    private giocatore g;
    private eventi e;
    private ModelloEvento eventCorrente;
    private int giornoCorrente = 1;

    private static final Color PANEL_BG = new Color(30, 39, 46, 200);
    private static final Color ACCENT_PURPLE = new Color(108, 92, 231);
    private static final Color ACCENT_GREEN = new Color(0, 184, 148);
    private static final Color ACCENT_RED = new Color(214, 48, 49);

    public GameGUI(giocatore g, eventi e) {
        this.g = g;
        this.e = e;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("LIFE SIMULATOR 2K27 - ULTIMATE EDITION");
        frame.setResizable(false);
        frame.setSize(1000, 650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon bg = new ImageIcon("bg.png");
                g.drawImage(bg.getImage(), 0, 0, getWidth(), getHeight(), null);
                g.setColor(new Color(0, 0, 0, 170));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        JPanel sidebar = new JPanel(null);
        sidebar.setBackground(PANEL_BG);
        sidebar.setBounds(20, 20, 250, 570);
        sidebar.setBorder(BorderFactory.createLineBorder(new Color(255,255,255,50)));
        mainPanel.add(sidebar);

        imgPlayer = new JLabel();
        imgPlayer.setBounds(25, 20, 200, 200);
        imgPlayer.setIcon(new ImageIcon(new ImageIcon("student.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        imgPlayer.setBorder(BorderFactory.createLineBorder(ACCENT_PURPLE, 2));
        sidebar.add(imgPlayer);

        labelNome = new JLabel(g.getNome().toUpperCase(), SwingConstants.CENTER);
        labelNome.setForeground(Color.WHITE);
        labelNome.setFont(new Font("SansSerif", Font.BOLD, 18));
        labelNome.setBounds(10, 230, 230, 30);
        sidebar.add(labelNome);

        addStat(sidebar, "😰 STRESS", 280, barStress = new JProgressBar(0, 100), ACCENT_RED);
        addStat(sidebar, "⚡ ENERGIA", 340, barEnergia = new JProgressBar(0, 100), new Color(116, 185, 255));
        
        labelSoldi = new JLabel("💰 100.00 €");
        labelSoldi.setForeground(ACCENT_GREEN);
        labelSoldi.setFont(new Font("SansSerif", Font.BOLD, 16));
        labelSoldi.setBounds(20, 420, 210, 30);
        sidebar.add(labelSoldi);

        labelSocial = new JLabel("㊙️ SOCIAL: 1000");
        labelSocial.setForeground(new Color(250, 177, 160));
        labelSocial.setFont(new Font("SansSerif", Font.BOLD, 16));
        labelSocial.setBounds(20, 450, 210, 30);
        sidebar.add(labelSocial);

        labelGiorno = new JLabel("📅 GIORNO 1 / 7");
        labelGiorno.setForeground(new Color(162, 155, 254));
        labelGiorno.setFont(new Font("SansSerif", Font.BOLD, 22));
        labelGiorno.setBounds(20, 520, 210, 30);
        sidebar.add(labelGiorno);

        JPanel eventPanel = new JPanel(null);
        eventPanel.setOpaque(false);
        eventPanel.setBounds(290, 20, 670, 400);
        mainPanel.add(eventPanel);

        imgEvent = new JLabel();
        imgEvent.setBounds(400, 50, 250, 350);
        imgEvent.setIcon(new ImageIcon(new ImageIcon("teacher.png").getImage().getScaledInstance(250, 350, Image.SCALE_SMOOTH)));
        eventPanel.add(imgEvent);

        labelEventContent = new JLabel();
        labelEventContent.setVerticalAlignment(SwingConstants.TOP);
        labelEventContent.setOpaque(true);
        labelEventContent.setBackground(new Color(0,0,0,180));
        labelEventContent.setForeground(Color.WHITE);
        labelEventContent.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(ACCENT_PURPLE, 1), BorderFactory.createEmptyBorder(20,20,20,20)));
        labelEventContent.setBounds(20, 50, 400, 180);
        eventPanel.add(labelEventContent);

        JPanel choicePanel = new JPanel(new GridLayout(1, 2, 20, 0));
        choicePanel.setBounds(310, 440, 630, 80);
        choicePanel.setOpaque(false);
        mainPanel.add(choicePanel);

        btnChoice1 = createStyledButton("SCELTA 1", ACCENT_PURPLE);
        btnChoice2 = createStyledButton("SCELTA 2", ACCENT_PURPLE);
        choicePanel.add(btnChoice1);
        choicePanel.add(btnChoice2);

        btnMarket = createStyledButton("VAI AL MARKET 🛒", new Color(230, 126, 34));
        btnMarket.setBounds(310, 530, 305, 60);
        btnMarket.setEnabled(false);
        mainPanel.add(btnMarket);

        btnContinua = createStyledButton("PASSA AL GIORNO SUCCESSIVO ⏩", new Color(44, 62, 80));
        btnContinua.setBounds(635, 530, 305, 60);
        btnContinua.setEnabled(false);
        mainPanel.add(btnContinua);

        btnChoice1.addActionListener(ev -> processChoice(0));
        btnChoice2.addActionListener(ev -> processChoice(1));
        btnMarket.addActionListener(ev -> apriMarketUI());
        btnContinua.addActionListener(ev -> caricaProssimoEvento());

        updateUI();
        frame.setVisible(true);
        caricaProssimoEvento();
    }

    private void addStat(JPanel p, String title, int y, JProgressBar bar, Color c) {
        JLabel l = new JLabel(title);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("SansSerif", Font.BOLD, 12));
        l.setBounds(20, y, 200, 20);
        p.add(l);
        bar.setBounds(20, y + 25, 210, 10);
        bar.setForeground(c);
        bar.setBackground(new Color(0,0,0,100));
        bar.setBorderPainted(false);
        p.add(bar);
    }

    private JButton createStyledButton(String text, Color bg) {
        JButton b = new JButton(text);
        b.setFont(new Font("SansSerif", Font.BOLD, 14));
        b.setBackground(bg);
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return b;
    }

    private void caricaProssimoEvento() {
        if (giornoCorrente > 7) { winGame(); return; }
        eventCorrente = e.getProssimoEvento();
        labelEventContent.setText("<html><body style='width: 320px; font-size: 14px;'>" + eventCorrente.testo + "</body></html>");
        btnChoice1.setText(eventCorrente.o1);
        btnChoice2.setText(eventCorrente.o2);
        btnChoice1.setEnabled(true);
        btnChoice2.setEnabled(true);
        btnMarket.setEnabled(false);
        btnContinua.setEnabled(false);
    }

    private void processChoice(int choiceIdx) {
        String result = (choiceIdx == 0) ? eventCorrente.r1 : eventCorrente.r2;
        int s, en, sol, soc;

        if (choiceIdx == 0) {
            s = 5 + (int)(Math.random() * 10);
            en = -5 - (int)(Math.random() * 10);
            sol = (Math.random() > 0.8) ? 10 : 0;
            soc = (Math.random() > 0.5) ? 30 : -10;
        } else {
            s = 10 + (int)(Math.random() * 20);
            en = -10 - (int)(Math.random() * 15);
            sol = (Math.random() > 0.5) ? -10 : 0;
            soc = (int)(Math.random() * 150) - 100;
        }

        g.addStress(s);
        g.addEnergia(en);
        g.addSoldi(sol);
        g.addSocialCredit(soc);

        labelEventContent.setText("<html><body style='width: 320px; font-size: 14px;'>" + 
            "<b>DICE:</b> " + result + "<br><br>" +
            "<hr style='border: 0; border-top: 1px solid #ccc;'>" +
            "<i>Stress: " + s + " | Energia: " + en + " | Soldi: " + sol + "€ | Social: " + soc + "</i>" +
            "</body></html>");

        btnChoice1.setEnabled(false);
        btnChoice2.setEnabled(false);
        btnMarket.setEnabled(true);
        btnContinua.setEnabled(true);
        updateUI();
    }

    private void apriMarketUI() {
        Object[] options = {"Caffè (20€)", "Camomilla (15€)", "Kebab (5€)", "Esci"};
        int n = JOptionPane.showOptionDialog(frame, "Benvenuto al Market!", "Market", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (n == 0 && g.getSoldi() >= 20) { g.addSoldi(-20); g.addEnergia(30); }
        else if (n == 1 && g.getSoldi() >= 15) { g.addSoldi(-15); g.addStress(-20); }
        else if (n == 2 && g.getSoldi() >= 5) { g.addSoldi(-5); g.addEnergia(10); g.addStress(5); }
        updateUI();
    }

    private void updateUI() {
        labelGiorno.setText("📅 GIORNO " + giornoCorrente + " / 7");
        labelSoldi.setText(String.format("💰 %.2f €", (double)g.getSoldi()));
        labelSocial.setText("㊙️ SOCIAL: " + g.getSocialCredit());
        barStress.setValue(g.getStress());
        barEnergia.setValue(g.getEnergia());
        if (g.getStress() >= 100) gameOver("💀 BURNED OUT!");
        if (g.getEnergia() <= 0) gameOver("😴 COMA TECNOLOGICO!");
        if (g.getSocialCredit() <= 0) gameOver("㊙️ CANCELLATO!");
    }

    private void gameOver(String msg) { JOptionPane.showMessageDialog(frame, msg, "Game Over", JOptionPane.ERROR_MESSAGE); System.exit(0); }
    private void winGame() { JOptionPane.showMessageDialog(frame, "🏆 VITTORIA! Sei un Chad del 2k27.", "Vittoria", JOptionPane.INFORMATION_MESSAGE); System.exit(0); }
}
