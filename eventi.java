import java.util.*;

public class eventi {
    private List<ModelloEvento> tuttiEventi = new ArrayList<>();
    private List<ModelloEvento> eventiPescati = new ArrayList<>();

    public eventi() {
        caricaEventi();
        Collections.shuffle(tuttiEventi);
    }

    private void caricaEventi() {
        tuttiEventi.add(new ModelloEvento("Verifica a sorpresa, il prof ti fissa.", "Cerca di leggere il foglio del vicino", "Fai finta di svenire", "Ti becca subito e ti lancia un cancellino in testa", "Il prof chiama l'esorcista"));
        tuttiEventi.add(new ModelloEvento("TikTok infinito alle 3 di notte.", "Ancora un video, questo è l'ultimo", "Lancia il telefono sotto il letto", "Occhi come ciliegie e vedi i meme anche nei sogni", "Il telefono colpisce un demone nel buio"));
        tuttiEventi.add(new ModelloEvento("Crush ti scrive 'Dobbiamo parlare'.", "Scappa in un altro paese", "Rispondi con un meme di una capra", "Ti ritrovi in Moldavia senza passaporto", "Ti risponde con una foto di un asino: è amore"));
        tuttiEventi.add(new ModelloEvento("Il prof urla il tuo nome.", "Dì 'Presente!' con voce da soprano", "Fai finta di essere una statua", "Il prof ti chiede se vuoi un autografo", "Ti scambiano per un appendiabiti"));
        tuttiEventi.add(new ModelloEvento("Il Wifi muore mentre carichi il compito.", "Prendi a testate il router", "Usa i dati mobili dei tuoi", "Il router ora ha la forma della tua testa", "I tuoi ti diseredano per aver finito i Giga"));
        tuttiEventi.add(new ModelloEvento("Fame chimica notturna, frigo vuoto.", "Mangia un cubetto di ghiaccio", "Ordina un kebab abusivo", "Il ghiaccio ti si incolla alla lingua", "Il kebabbaro ti nomina suo erede"));
        tuttiEventi.add(new ModelloEvento("Arrivi tardi, classe in silenzio.", "Entra ballando la salsa", "Entra strisciando come un ninja", "Tutta la classe inizia a ballare con te", "Ti calpestano pensando fossi uno zaino"));
        tuttiEventi.add(new ModelloEvento("Troppi compiti per domani.", "Falli tutti con ChatGPT", "Dì che il cane ha mangiato il laptop", "L'IA scrive 'Fatteli da solo, pigro'", "Il prof ti porta una ciotola di croccantini"));
        tuttiEventi.add(new ModelloEvento("Interrogazione sorpresa, panico.", "Dì che hai un improvviso mal di testa", "Affidati alla forza del destino", "Ti portano in infermeria per finta lebbra", "Indovini tutto ma in un'altra lingua"));
        tuttiEventi.add(new ModelloEvento("Gruppo classe: 300 messaggi inutili.", "Metti silenzioso per 100 anni", "Abbandona il gruppo con stile", "Vieni rincorso dai messaggi nella vita reale", "Uscita drammatica con esplosioni (nella tua testa)"));
        tuttiEventi.add(new ModelloEvento("Prof arrabbiato lancia il gessetto.", "Schivalo come in Matrix", "Afferralo al volo e sorridi", "Diventi l'eletto, ma solo per la cancelleria", "Il prof ti regala un 2 con un cuoricino"));
        tuttiEventi.add(new ModelloEvento("Ti addormenti sulla scrivania a scuola.", "Russa così forte da svegliare il preside", "Dì che stavi meditando", "Il preside russa con te in armonia", "Inizi a levitare per la troppa pace"));
        tuttiEventi.add(new ModelloEvento("Crush ti visualizza e non risponde.", "Cancella il suo numero", "Scrivile 'Hai visto che bel tempo?'", "Ti senti libero, ma solo per 5 secondi", "Ti risponde: 'Chi sei? Ho cambiato telefono'"));
        tuttiEventi.add(new ModelloEvento("Cadi dalle scale davanti a tutti.", "Fai finta che fosse una breakdance", "Resta immobile e aspetta l'ambulanza", "Ti danno un premio per la coreografia", "Ti usano come tappetino per pulirsi le scarpe"));
        tuttiEventi.add(new ModelloEvento("Libro dimenticato a casa.", "Disegna il libro su un foglio A4", "Ruba il libro al compagno di banco", "Il disegno prende vita e ti morde", "Il compagno ti denuncia per furto aggravato"));
        tuttiEventi.add(new ModelloEvento("Amico ti fa uno scherzo pesante.", "Vendicati subito con l'acqua", "Fatti una risata isterica", "Allaghi la scuola, maremoto in corridoio", "Vieni ricoverato per risata inquietante"));
        tuttiEventi.add(new ModelloEvento("Cane del vicino ti ringhia.", "Corri come se fossi alle olimpiadi", "Ringhia più forte di lui", "Superi Bolt, ma inciampi su un tombino", "Il cane si scusa e ti offre un caffè"));
        tuttiEventi.add(new ModelloEvento("Tuo fratello ti ruba le cuffie.", "Nascondi i suoi calzini", "Fallo piangere urlando", "Usa i calzini come marionette per insultarti", "Tua madre ti mette in castigo per disturbo della quiete"));
        tuttiEventi.add(new ModelloEvento("Bar della scuola chiuso.", "Mangia la gomma da masticare usata", "Scatena una rivolta studentesca", "Cerchi di masticarla ma è cemento armato", "Vieni eletto Che Guevara della merenda"));
        tuttiEventi.add(new ModelloEvento("Messaggio hot al gruppo famiglia.", "Dici che era un esperimento sociale", "Fingi che ti abbiano hackerato", "Tuo nonno risponde: 'Bravo nipote, così si fa'", "Tutti in famiglia ti guardano come un alieno"));
    }

    public ModelloEvento getProssimoEvento() {
        if (tuttiEventi.isEmpty()) caricaEventi();
        return tuttiEventi.remove(0);
    }

    // Manteniamo questa firma per retrocompatibilità o la rimuoviamo se vogliamo pulire tutto
    public void randomEvent(giocatore g, Scanner s) {
        // Questa non serve più nel nuovo GameGUI diretto
    }
}
