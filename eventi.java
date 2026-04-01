import java.util.*;

public class eventi {
    private List<Integer> eventiDisponibili = new ArrayList<>();

    public eventi() {
        for (int i = 0; i < 100; i++) {
            eventiDisponibili.add(i);
        }
        Collections.shuffle(eventiDisponibili);
    }

    public void randomEvent(giocatore g, Scanner s) {
        if (eventiDisponibili.isEmpty()) {
            System.out.println("Hai vissuto tutti gli eventi");
            return;
        }

        int evento = eventiDisponibili.remove(0);

        switch (evento) {
            case 0:
                evento0(g, s);
                break;
            case 1:
                evento1(g, s);
                break;
            case 2:
                evento2(g, s);
                break;
            case 3:
                evento3(g, s);
                break;
            case 4:
                evento4(g, s);
                break;
            case 5:
                evento5(g, s);
                break;
            case 6:
                evento6(g, s);
                break;
            case 7:
                evento7(g, s);
                break;
            case 8:
                evento8(g, s);
                break;
            case 9:
                evento9(g, s);
                break;
            case 10:
                evento10(g, s);
                break;
            case 11:
                evento11(g, s);
                break;
            case 12:
                evento12(g, s);
                break;
            case 13:
                evento13(g, s);
                break;
            case 14:
                evento14(g, s);
                break;
            case 15:
                evento15(g, s);
                break;
            case 16:
                evento16(g, s);
                break;
            case 17:
                evento17(g, s);
                break;
            case 18:
                evento18(g, s);
                break;
            case 19:
                evento19(g, s);
                break;
            case 20:
                evento20(g, s);
                break;
            case 21:
                evento21(g, s);
                break;
            case 22:
                evento22(g, s);
                break;
            case 23:
                evento23(g, s);
                break;
            case 24:
                evento24(g, s);
                break;
            case 25:
                evento25(g, s);
                break;
            case 26:
                evento26(g, s);
                break;
            case 27:
                evento27(g, s);
                break;
            case 28:
                evento28(g, s);
                break;
            case 29:
                evento29(g, s);
                break;
            case 30:
                evento30(g, s);
                break;
            case 31:
                evento31(g, s);
                break;
            case 32:
                evento32(g, s);
                break;
            case 33:
                evento33(g, s);
                break;
            case 34:
                evento34(g, s);
                break;
            case 35:
                evento35(g, s);
                break;
            case 36:
                evento36(g, s);
                break;
            case 37:
                evento37(g, s);
                break;
            case 38:
                evento38(g, s);
                break;
            case 39:
                evento39(g, s);
                break;
            case 40:
                evento40(g, s);
                break;
            case 41:
                evento41(g, s);
                break;
            case 42:
                evento42(g, s);
                break;
            case 43:
                evento43(g, s);
                break;
            case 44:
                evento44(g, s);
                break;
            case 45:
                evento45(g, s);
                break;
            case 46:
                evento46(g, s);
                break;
            case 47:
                evento47(g, s);
                break;
            case 48:
                evento48(g, s);
                break;
            case 49:
                evento49(g, s);
                break;
            case 50:
                evento50(g, s);
                break;
            case 51:
                evento51(g, s);
                break;
            case 52:
                evento52(g, s);
                break;
            case 53:
                evento53(g, s);
                break;
            case 54:
                evento54(g, s);
                break;
            case 55:
                evento55(g, s);
                break;
            case 56:
                evento56(g, s);
                break;
            case 57:
                evento57(g, s);
                break;
            case 58:
                evento58(g, s);
                break;
            case 59:
                evento59(g, s);
                break;
            case 60:
                evento60(g, s);
                break;
            case 61:
                evento61(g, s);
                break;
            case 62:
                evento62(g, s);
                break;
            case 63:
                evento63(g, s);
                break;
            case 64:
                evento64(g, s);
                break;
            case 65:
                evento65(g, s);
                break;
            case 66:
                evento66(g, s);
                break;
            case 67:
                evento67(g, s);
                break;
            case 68:
                evento68(g, s);
                break;
            case 69:
                evento69(g, s);
                break;
            case 70:
                evento70(g, s);
                break;
            case 71:
                evento71(g, s);
                break;
            case 72:
                evento72(g, s);
                break;
            case 73:
                evento73(g, s);
                break;
            case 74:
                evento74(g, s);
                break;
            case 75:
                evento75(g, s);
                break;
            case 76:
                evento76(g, s);
                break;
            case 77:
                evento77(g, s);
                break;
            case 78:
                evento78(g, s);
                break;
            case 79:
                evento79(g, s);
                break;
            case 80:
                evento80(g, s);
                break;
            case 81:
                evento81(g, s);
                break;
            case 82:
                evento82(g, s);
                break;
            case 83:
                evento83(g, s);
                break;
            case 84:
                evento84(g, s);
                break;
            case 85:
                evento85(g, s);
                break;
            case 86:
                evento86(g, s);
                break;
            case 87:
                evento87(g, s);
                break;
            case 88:
                evento88(g, s);
                break;
            case 89:
                evento89(g, s);
                break;
            case 90:
                evento90(g, s);
                break;
            case 91:
                evento91(g, s);
                break;
            case 92:
                evento92(g, s);
                break;
            case 93:
                evento93(g, s);
                break;
            case 94:
                evento94(g, s);
                break;
            case 95:
                evento95(g, s);
                break;
            case 96:
                evento96(g, s);
                break;
            case 97:
                evento97(g, s);
                break;
            case 98:
                evento98(g, s);
                break;
            case 99:
                evento99(g, s);
                break;
        }
    }

    private void baseEvent(giocatore g, Scanner s, String testo, String o1, String o2, String r1, String r2) {
        System.out.println("\n" + testo);
        System.out.println("1. " + o1);
        System.out.println("2. " + o2);
        System.out.print("Scegli: ");
        int c = 0;
        try {
            c = s.nextInt();
            s.nextLine();
        } catch (Exception e) {
            s.nextLine();
            c = 1;
        }

        if (c == 1) {
            System.out.println("Esito: " + r1 + " ✅ (+Stress casuale)");
            g.addStress((int) (Math.random() * 15));
        } else {
            System.out.println("Esito: " + r2 + " ❌ (+Molto Stress)");
            g.addStress((int) (Math.random() * 25));
        }
    }

    // --- METODI EVENTI 0 → 99 CON SCELTE UNICHE ---
    private void evento0(giocatore g, Scanner s) {
        baseEvent(g, s, "Verifica a sorpresa, il prof ti fissa.", "Cerca di leggere il foglio del vicino",
                "Fai finta di svenire", "Ti becca subito e ti lancia un cancellino in testa", "Il prof chiama l'esorcista");
    }

    private void evento1(giocatore g, Scanner s) {
        baseEvent(g, s, "TikTok infinito alle 3 di notte.", "Ancora un video, questo è l'ultimo",
                "Lancia il telefono sotto il letto", "Occhi come ciliegie e vedi i meme anche nei sogni", "Il telefono colpisce un demone nel buio");
    }

    private void evento2(giocatore g, Scanner s) {
        baseEvent(g, s, "Crush ti scrive 'Dobbiamo parlare'.", "Scappa in un altro paese",
                "Rispondi con un meme di una capra", "Ti ritrovi in Moldavia senza passaporto", "Ti risponde con una foto di un asino: è amore");
    }

    private void evento3(giocatore g, Scanner s) {
        baseEvent(g, s, "Il prof urla il tuo nome.", "Dì 'Presente!' con voce da soprano",
                "Fai finta di essere una statua", "Il prof ti chiede se vuoi un autografo", "Ti scambiano per un appendiabiti");
    }

    private void evento4(giocatore g, Scanner s) {
        baseEvent(g, s, "Il Wifi muore mentre carichi il compito.", "Prendi a testate il router",
                "Usa i dati mobili dei tuoi", "Il router ora ha la forma della tua testa", "I tuoi ti diseredano per aver finito i Giga");
    }

    private void evento5(giocatore g, Scanner s) {
        baseEvent(g, s, "Fame chimica notturna, frigo vuoto.", "Mangia un cubetto di ghiaccio",
                "Ordina un kebab abusivo", "Il ghiaccio ti si incolla alla lingua", "Il kebabbaro ti nomina suo erede");
    }

    private void evento6(giocatore g, Scanner s) {
        baseEvent(g, s, "Arrivi tardi, classe in silenzio.", "Entra ballando la salsa",
                "Entra strisciando come un ninja", "Tutta la classe inizia a ballare con te", "Ti calpestano pensando fossi uno zaino");
    }

    private void evento7(giocatore g, Scanner s) {
        baseEvent(g, s, "Troppi compiti per domani.", "Falli tutti con ChatGPT",
                "Dì che il cane ha mangiato il laptop", "L'IA scrive 'Fatteli da solo, pigro'", "Il prof ti porta una ciotola di croccantini");
    }

    private void evento8(giocatore g, Scanner s) {
        baseEvent(g, s, "Interrogazione sorpresa, panico.", "Dì che hai un improvviso mal di testa",
                "Affidati alla forza del destino", "Ti portano in infermeria per finta lebbra", "Indovini tutto ma in un'altra lingua");
    }

    private void evento9(giocatore g, Scanner s) {
        baseEvent(g, s, "Gruppo classe: 300 messaggi inutili.", "Metti silenzioso per 100 anni",
                "Abbandona il gruppo con stile", "Vieni rincorso dai messaggi nella vita reale", "Uscita drammatica con esplosioni (nella tua testa)");
    }

    private void evento10(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof arrabbiato lancia il gessetto.", "Schivalo come in Matrix",
                "Afferralo al volo e sorridi", "Diventi l'eletto, ma solo per la cancelleria", "Il prof ti regala un 2 con un cuoricino");
    }

    private void evento11(giocatore g, Scanner s) {
        baseEvent(g, s, "Serata con amici troppo intensa.", "Bevi 4 RedBull per sopravvivere",
                "Dormi sulla panchina più vicina", "Vedi i suoni e senti i colori", "Vieni adottato da una famiglia di piccioni");
    }

    private void evento12(giocatore g, Scanner s) {
        baseEvent(g, s, "Ti addormenti sulla scrivania a scuola.", "Russa così forte da svegliare il preside",
                "Dì che stavi meditando", "Il preside russa con te in armonia", "Inizi a levitare per la troppa pace");
    }

    private void evento13(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof ti insulta velatamente.", "Rispondi con un 'Ok boomer'",
                "Piangi in silenzio nell'angolino", "Il prof ti sfida a una battaglia rap", "L'angolino diventa la tua nuova residenza");
    }

    private void evento14(giocatore g, Scanner s) {
        baseEvent(g, s, "Crush ti visualizza e non risponde.", "Cancella il suo numero",
                "Scrivile 'Hai visto che bel tempo?'", "Ti senti libero, ma solo per 5 secondi", "Ti risponde: 'Chi sei? Ho cambiato telefono'");
    }

    private void evento15(giocatore g, Scanner s) {
        baseEvent(g, s, "Il panino cade nel fango.", "Regola dei 5 secondi (anche se è fango)",
                "Piangi la scomparsa del tuo pasto", "Scopri nuovi sapori batterici", "Il panino ti saluta mentre affonda");
    }

    private void evento16(giocatore g, Scanner s) {
        baseEvent(g, s, "Cadi dalle scale davanti a tutti.", "Fai finta che fosse una breakdance",
                "Resta immobile e aspetta l'ambulanza", "Ti danno un premio per la coreografia", "Ti usano come tappetino per pulirsi le scarpe");
    }

    private void evento17(giocatore g, Scanner s) {
        baseEvent(g, s, "Libro dimenticato a casa.", "Disegna il libro su un foglio A4",
                "Ruba il libro al compagno di banco", "Il disegno prende vita e ti morde", "Il compagno ti denuncia per furto aggravato");
    }

    private void evento18(giocatore g, Scanner s) {
        baseEvent(g, s, "Amico ti fa uno scherzo pesante.", "Vendicati subito con l'acqua",
                "Fatti una risata isterica", "Allaghi la scuola, maremoto in corridoio", "Vieni ricoverato per risata inquietante");
    }

    private void evento19(giocatore g, Scanner s) {
        baseEvent(g, s, "Password errata per la decima volta.", "Distruggi la tastiera",
                "Prega i santi dell'informatica", "La tastiera ora è in orbita", "Il computer ti risponde: 'Riprova tra un secolo'");
    }

    private void evento20(giocatore g, Scanner s) {
        baseEvent(g, s, "Cane del vicino ti ringhia.", "Corri come se fossi alle olimpiadi",
                "Ringhia più forte di lui", "Superi Bolt, ma inciampi su un tombino", "Il cane si scusa e ti offre un caffè");
    }

    private void evento21(giocatore g, Scanner s) {
        baseEvent(g, s, "Il bus parte mentre corri.", "Corri dietro al bus per 2km",
                "Siediti a terra e accetta la sconfitta", "Il bus accelera e ti fa il medio dal lunotto", "Vieni scambiato per un barbone e ti regalano un euro");
    }

    private void evento22(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof dimentica di interrogarti (miracolo).", "Resta immobile per non farti notare",
                "Ricordaglielo (sei un traditore)", "Sei diventato invisibile!", "Gli altri compagni ti lanciano oggetti contundenti");
    }

    private void evento23(giocatore g, Scanner s) {
        baseEvent(g, s, "Tuo fratello ti ruba le cuffie.", "Nascondi i suoi calzini", "Fallo piangere urlando", "Usa i calzini come marionette per insultarti", "Tua madre ti mette in castigo per disturbo della quiete");
    }

    private void evento24(giocatore g, Scanner s) {
        baseEvent(g, s, "Lezione noiosissima di 3 ore.", "Fai disegni strani sul diario", "Guarda il vuoto cosmico", "I disegni iniziano a parlare di filosofia", "Vedi la fine dell'universo");
    }

    private void evento25(giocatore g, Scanner s) {
        baseEvent(g, s, "Trovi 50 centesimi a terra.", "Comprati una caramella gommosa", "Conservali per la pensione", "La caramella è così dura che perdi un dente", "L'inflazione li rende inutili all'istante");
    }

    private void evento26(giocatore g, Scanner s) {
        baseEvent(g, s, "Laptop si spegne senza salvare.", "Urla come un licantropo", "Accetta che la vita è ingiusta", "Vieni scambiato per una sirena della nebbia", "Il compagno di banco ti ruba le idee rimaste");
    }

    private void evento27(giocatore g, Scanner s) {
        baseEvent(g, s, "Bar della scuola chiuso.", "Mangia la gomma da masticare usata",
                "Scatena una rivolta studentesca", "Cerchi di masticarla ma è cemento armato", "Vieni eletto Che Guevara della merenda");
    }

    private void evento28(giocatore g, Scanner s) {
        baseEvent(g, s, "Frigo vuoto, solo limoni vecchi.", "Fatti una limonata tristissima",
                "Mangiati il limone intero", "È così acida che la tua faccia si contrae per sempre", "Diventi una batteria umana");
    }

    private void evento29(giocatore g, Scanner s) {
        baseEvent(g, s, "Foto imbarazzante su IG.", "Segnala la foto per terrorismo", "Postane una peggio dell'amico", "L'FBI bussa alla sua porta", "Inizia una guerra nucleare di selfie orrendi");
    }

    private void evento30(giocatore g, Scanner s) {
        baseEvent(g, s, "Compiti di mate non fatti.", "Dì che hai scoperto una nuova geometria",
                "Improvvisa tutto alla lavagna", "Il prof ti nomina Rettore honoris causa", "Scrivi formule magiche e appare un demone");
    }

    private void evento31(giocatore g, Scanner s) {
        baseEvent(g, s, "Esercizio impossibile assegnato a TE.", "Fissa la lavagna finché non svanisce",
                "Scrivi 'X = 42' e vai via", "La lavagna ti risucchia in un'altra dimensione", "Il prof scrive 42 sul tuo diario");
    }

    private void evento32(giocatore g, Scanner s) {
        baseEvent(g, s, "Crush posta una foto con un tipo.", "Analizza i pixel della foto",
                "Esci a correre per non pensarci", "Scopri che è suo cugino di terzo grado", "Hai i polmoni in fiamme ma il cuore a pezzi");
    }

    private void evento33(giocatore g, Scanner s) {
        baseEvent(g, s, "Chiavi di casa perse.", "Sfondala con un calcio rotante", "Aspetta i tuoi fuori per 5 ore", "La porta non si apre, la tua gamba sì", "Inizi a parlare con le formiche");
    }

    private void evento34(giocatore g, Scanner s) {
        baseEvent(g, s, "Il cane vomita sul tappeto.", "Usa il phon per asciugare",
                "Chiama la ditta di pulizie spaziali", "Il tappeto ora è un'opera di Pollock", "Ti mandano un preventivo da 10.000 euro");
    }

    private void evento35(giocatore g, Scanner s) {
        baseEvent(g, s, "Telefono al 1% di batteria.", "Disattiva pure il battito cardiaco",
                "Cerca un caricatore disperatamente", "Il telefono muore mentre scrivi 'Ti a...'", "Ti scambiano per un tossico in cerca di dosi");
    }

    private void evento36(giocatore g, Scanner s) {
        baseEvent(g, s, "Opinione su massimi sistemi.", "Dì 'Dipende' e guarda lontano",
                "Spara parole a caso tipo 'Dicotomia'", "Tutti annuiscono pensando tu sia un genio", "Ti chiedono di spiegare la supercazzola");
    }

    private void evento37(giocatore g, Scanner s) {
        baseEvent(g, s, "Treno in ritardo eterno.", "Sostituisci il capotreno", "Dormi sui sedili sporchi", "Diventi il nuovo proprietario della stazione", "Ti svegli a Vladivostok");
    }

    private void evento38(giocatore g, Scanner s) {
        baseEvent(g, s, "Piove e non hai l'ombrello.", "Usa lo zaino come scudo",
                "Canta sotto la pioggia come un matto", "Lo zaino si inzuppa e i libri diventano cartapesta", "Tutti ti guardano come se fossi Joker");
    }

    private void evento39(giocatore g, Scanner s) {
        baseEvent(g, s, "Amico ti percula forte.", "Ridi della tua stessa sfiga", "Tira fuori un suo segreto oscuro", "Ride così tanto che cade dalla sedia", "Silenzio tombale, l'amicizia finisce qui");
    }

    private void evento40(giocatore g, Scanner s) {
        baseEvent(g, s, "Pizza carbonizzata.", "Mangiala, è croccante!", "Chiama i pompieri", "È così dura che puoi usarla come frisbee", "Vieni arrestato per tentata strage culinaria");
    }

    private void evento41(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof ti zittisce male.", "Fai il gesto del silenzio a lui", "Ingoia le parole e lo stress", "Lui ti risponde con un dito nell'occhio (metaforico)", "Ti senti un buco nero di tristezza");
    }

    private void evento42(giocatore g, Scanner s) {
        baseEvent(g, s, "Cadi dalla bici.", "Rialzati e dì 'Tutto calcolato'", "Restaci e aspetta il carro attrezzi", "Tutti applaudono pensando fosse una mossa di judo", "Diventi una statua commemorativa del marciapiede");
    }

    private void evento43(giocatore g, Scanner s) {
        baseEvent(g, s, "Zaino dimenticato (completamente).", "Usa un pennarello sulla pelle", "Torna a casa correndo", "Ti scambiano per un tatuatore abusivo", "Hai i polpacci come marmo");
    }

    private void evento44(giocatore g, Scanner s) {
        baseEvent(g, s, "Video cringe caricato online.", "Cambia identità e scappa", "Rendilo virale apposta", "Ti offrono un contratto a Dubai (per non tornare mai più)", "Diventi il nuovo 'Star Wars Kid'");
    }

    private void evento45(giocatore g, Scanner s) {
        baseEvent(g, s, "Stampante esplode.", "Pulisci l'inchiostro con la faccia", "Compra una nuova stampante", "Sembri uno di quegli avatar blu di Avatar", "La stampante ti chiede il riscatto");
    }

    private void evento46(giocatore g, Scanner s) {
        baseEvent(g, s, "Merenda rubata.", "Trova il colpevole e sfidalo", "Ruba la merenda al prof", "Scopri che è stato il bidello per fame atavica", "Il prof ti dà una nota: 'Ruba ai poveri per dare ai ricchi'");
    }

    private void evento47(giocatore g, Scanner s) {
        baseEvent(g, s, "Messaggio al prof ignorato.", "Mandagli 500 messaggi d'odio", "Prenditi un 2 automatico", "Il server della scuola esplode per il troppo spam", "Il 2 ti sorride beffardo");
    }

    private void evento48(giocatore g, Scanner s) {
        baseEvent(g, s, "Allarme antincendio (falso).", "Fuggi urlando 'Siamo spacciati!'", "Siediti e goditi il caos", "Vieni multato per procurato allarme nel nulla", "Gli altri fuggono e ti lasciano solo col fuoco (immaginario)");
    }

    private void evento49(giocatore g, Scanner s) {
        baseEvent(g, s, "Diario perso.", "Dì che l'hanno rubato gli alieni", "Usa un foglio di carta igienica", "Gli alieni ti rispediscono il diario: 'Troppo noioso'", "Ti pulisci e poi ti penti amaramente");
    }

    private void evento50(giocatore g, Scanner s) {
        baseEvent(g, s, "Cane ruba scarpe.", "Inseguilo nudo per strada", "Usa i piedi nudi a scuola", "Finisci in tendenza su TikTok: #NudoPerLeScarpe", "Le tue impronte restano sui muri della scuola");
    }

    private void evento51(giocatore g, Scanner s) {
        baseEvent(g, s, "Compito extra di 20 pagine.", "Inizia a piangere preventivamente",
                "Dì che la religione lo vieta", "Allaghi la camera e devi usare il gommone", "Vieni scomunicato dal Papa");
    }

    private void evento52(giocatore g, Scanner s) {
        baseEvent(g, s, "Verifica? Quale verifica?", "Dì che sei nel giorno sbagliato",
                "Prendi il primo voto negativo della vita", "Il prof ride: 'Sì, quello del giudizio universale'", "Benvenuto nel club degli emarginati del registro");
    }

    private void evento53(giocatore g, Scanner s) {
        baseEvent(g, s, "Messaggio hot al gruppo famiglia.", "Dici che era un esperimento sociale",
                "Fingi che ti abbiano hackerato", "Tuo nonno risponde: 'Bravo nipote, così si fa'", "Tutti in famiglia ti guardano come un alieno");
    }

    private void evento54(giocatore g, Scanner s) {
        baseEvent(g, s, "PC crasha a fine esame.", "Lancia il PC dalla finestra", "Fai un pianto liberatorio", "Il PC rimbalza e colpisce un drone", "Vieni espulso per inquinamento acustico");
    }

    private void evento55(giocatore g, Scanner s) {
        baseEvent(g, s, "Portafoglio vuoto.", "Mangiati le monete da 1 cent", "Vendi un rene su eBay", "Hai l'alito che sa di rame", "Il compratore vuole anche il fegato in omaggio");
    }

    private void evento56(giocatore g, Scanner s) {
        baseEvent(g, s, "Cane mangia scarpe (ancora).", "Cucinalo (scherzo)", "Compra scarpe di ferro", "Il cane ha lo stomaco d'acciaio", "Ti rompi un dito cercando di infilarle");
    }

    private void evento57(giocatore g, Scanner s) {
        baseEvent(g, s, "Amico ti tradisce all'interrogazione.", "Escludilo dalla tua vita",
                "Tiragli una gomma da cancellare", "L'amicizia finisce, inizia la guerra dei mondi", "La gomma colpisce l'occhio del prof: espulso");
    }

    private void evento58(giocatore g, Scanner s) {
        baseEvent(g, s, "Dormi in classe (russando).", "Dì che stavi simulando un motore", "Chiedi scusa al muro", "Vieni spedito in officina meccanica", "Il muro ti risponde: 'Non ti scuso'");
    }

    private void evento59(giocatore g, Scanner s) {
        baseEvent(g, s, "Lettura ad alta voce (balbettando).", "Leggi con accento russo",
                "Fai finta di aver perso la voce", "Il prof risponde in cirillico", "Vieni iscritto d'ufficio a un corso di mimo");
    }

    private void evento60(giocatore g, Scanner s) {
        baseEvent(g, s, "Borraccia persa.", "Bevi dalle pozzanghere", "Muori di sete", "Ti scambiano per un cammello smarrito", "Vieni mummificato dalla sete");
    }

    private void evento61(giocatore g, Scanner s) {
        baseEvent(g, s, "Calze spaiate.", "Dì che è l'ultima moda a Parigi", "Nascondi i piedi nelle scarpe", "Diventi l'icona del trash mondiale", "Ti crescono i funghi tra le dita per l'umidità");
    }

    private void evento62(giocatore g, Scanner s) {
        baseEvent(g, s, "Canzone di Peppa Pig parte al massimo.", "Inizia a ballare fortissimo",
                "Lancia il telefono sotto il banco", "La preside entra e inizia a twerkare", "Il telefono esplode per la vergogna");
    }

    private void evento63(giocatore g, Scanner s) {
        baseEvent(g, s, "Zaino al contrario.", "Dì che serve per l'aerodinamica", "Corri a girarlo in bagno", "Voli via come un calabrone", "Ti incastri nella tazza del cesso");
    }

    private void evento64(giocatore g, Scanner s) {
        baseEvent(g, s, "Nome sbagliato dall'amico.", "Chiamalo 'Gigi' per vendetta", "Correggilo con un urlo", "Lui risponde: 'Ok, Poldo'", "Tutta la scuola urla con te in coro");
    }

    private void evento65(giocatore g, Scanner s) {
        baseEvent(g, s, "Figura da pirla epica.", "Ridi come uno psicopatico", "Tirati un secchio d'acqua", "Diventi un meme virale su WhatsApp", "L'acqua è gelata e ti si ferma il cuore");
    }

    private void evento66(giocatore g, Scanner s) {
        baseEvent(g, s, "Telefono vibra durante il silenzio.", "Tossisci fortissimo per coprire",
                "Dì che hai un pacemaker rumoroso", "Vieni scambiato per un malato terminale e ti regalano un iPad", "Il prof ti smonta il petto per controllare");
    }

    private void evento67(giocatore g, Scanner s) {
        baseEvent(g, s, "Niente penna nera.", "Scrivi col sangue (o col ketchup)", "Ruba la matita al vicino", "Vieni scambiato per un vampiro o un cuoco distratto", "La matita è al 2H e non si vede nulla");
    }

    private void evento68(giocatore g, Scanner s) {
        baseEvent(g, s, "Pasta al sugo sui pantaloni bianchi.", "Dì che è un'opera d'arte moderna",
                "Usa il correttore per coprire", "L'esame diventa una sfilata di moda astratta", "Sembri un dálmata rosso");
    }

    private void evento69(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof ti interrompe sul finale.", "Urla 'NON HO FINITO!'", "Siediti offeso a morte", "I compagni ti applaudono per il coraggio (e per la follia)", "Ti trasformi in una statua di sale");
    }

    private void evento70(giocatore g, Scanner s) {
        baseEvent(g, s, "Compito non consegnato.", "Dì che lo hai inviato per via telepatica",
                "Corri dal prof piangendo", "Il prof ti risponde: 'Ricevuto, ci vediamo nel 2030'", "Le lacrime bagnano il registro e cancellano i tuoi voti");
    }

    private void evento71(giocatore g, Scanner s) {
        baseEvent(g, s, "Lavagna sporchissima.", "Puliscila con la tua maglietta", "Lasciala così e scrivi sopra", "La tua maglietta ora è nera come l'anima del prof", "Scrivi e non si capisce nulla, sembri un medico");
    }

    private void evento72(giocatore g, Scanner s) {
        baseEvent(g, s, "Cadi dalla sedia (rumore assordante).", "Fai finta di essere morto",
                "Dì che la gravità è aumentata", "I compagni ti portano i fiori", "Ti mettono al centro del sistema solare");
    }

    private void evento73(giocatore g, Scanner s) {
        baseEvent(g, s, "Confusione mentale totale.", "Contrati su te stesso e scompari", "Spara numeri a caso", "Diventi una singolarità gravitazionale", "Dici 3.14 e tutti pensano alla pizza");
    }

    private void evento74(giocatore g, Scanner s) {
        baseEvent(g, s, "Cibo scivola via.", "Raccoglilo e mangialo subito", "Addio mondo crudele", "Lo mangi col tappeto incluso", "Ti iscrivi a un convento in Tibet");
    }

    private void evento75(giocatore g, Scanner s) {
        baseEvent(g, s, "Diario in bagno.", "Lascialo lì per sempre", "Torna a prenderlo con i guanti", "Ora è proprietà del re delle fogne", "Sembri un medico chirurgo che opera un paziente radioattivo");
    }

    private void evento76(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof ride di te.", "Ridi con lui (tristezza interiore)", "Mandalo a quel paese", "Ridi così tanto che ti esce il latte dal naso (anche se non lo bevevi)", "Vieni spedito su Marte con un calcio");
    }

    private void evento77(giocatore g, Scanner s) {
        baseEvent(g, s, "Scarpe ginnastica dimenticate.", "Fai educazione fisica nei calzini",
                "Dì che hai le caviglie di vetro", "I tuoi piedi diventano neri come il carbone", "Ti portano in un museo di cristalleria");
    }

    private void evento78(giocatore g, Scanner s) {
        baseEvent(g, s, "Vocale imbarazzante di 3 minuti.", "Elimina per tutti (troppo tardi)",
                "Spegni il telefono per 3 giorni", "Vieni denunciato per inquinamento acustico", "Il mondo dimentica la tua esistenza");
    }

    private void evento79(giocatore g, Scanner s) {
        baseEvent(g, s, "Cane ruba snack.", "Lotta col cane per l'ultimo pezzo", "Compine un altro", "Vinci tu, ma il cane ti morde il sedere", "Lo snack è scaduto nel 1998");
    }

    private void evento80(giocatore g, Scanner s) {
        baseEvent(g, s, "Telefono spento.", "Usa i segnali di fumo", "Parla con le persone vere (orrore)", "Inizi a comunicare con gli dei del meteo", "Vieni arrestato per vagabondaggio tecnologico");
    }

    private void evento81(giocatore g, Scanner s) {
        baseEvent(g, s, "Figura da matto in mensa.", "Urla 'SONO IL RE DEL MONDO!'",
                "Scappa via senza guardare indietro", "Il mondo ti incorona, ma in un manicomio", "Ti ritrovi in un'altra nazione senza saperlo");
    }

    private void evento82(giocatore g, Scanner s) {
        baseEvent(g, s, "Perculata brutale.", "Fai una battuta su sua madre", "Fingi di non aver sentito", "Tua madre appare e gli dà un ceffone", "Diventi l'uomo invisibile per la vergogna");
    }

    private void evento83(giocatore g, Scanner s) {
        baseEvent(g, s, "Maglietta al contrario.", "Dì che è il nuovo brand di Kanye", "Giratela davanti a tutti", "Diventi il nuovo consulente di stile di Kim Jong-un", "Vieni espulso per atti osceni in luogo pubblico (secondo il prof)");
    }

    private void evento84(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof ti ignora all'interrogazione.", "Dì 'Grazie Dio'", "Ballaci sopra", "Gli angeli cantano 'Hallelujah'", "Il prof ti lancia un libro di preghiere");
    }

    private void evento85(giocatore g, Scanner s) {
        baseEvent(g, s, "Senza acqua a scuola.", "Bevi dal rubinetto del bagno (coraggio)",
                "Fatti prestare un sorso da uno sconosciuto", "Diventi un supereroe mutante a causa dei batteri", "Lo sconosciuto è un agente segreto e ti arresta");
    }

    private void evento86(giocatore g, Scanner s) {
        baseEvent(g, s, "Zaino si rompe.", "Portalo in braccio come un neonato", "Lascialo lì e vattene libero", "Vieni scambiato per una partoriente", "Ti accusano di abbandono di zaino pericoloso");
    }

    private void evento87(giocatore g, Scanner s) {
        baseEvent(g, s, "Amico ti chiama 'Amore' per sbaglio.", "Rispondi 'Sì tesoro'",
                "Fai finta di nulla (imbarazzo)", "La classe intera celebra il vostro matrimonio", "Ti trasferisci in un'altra galassia");
    }

    private void evento88(giocatore g, Scanner s) {
        baseEvent(g, s, "Cibo cade dalla borsa.", "Dì che sono briciole per gli uccellini", "Pulisci con imbarazzo", "Le briciole formano un cerchio nel grano", "Vieni scambiato per un addetto alle pulizie cieco");
    }

    private void evento89(giocatore g, Scanner s) {
        baseEvent(g, s, "Prof ti interrompe (di nuovo).", "Sospira rumorosamente", "Guarda l'orologio ogni 5 secondi", "Il sospiro spegne le candele della torta (che non c'era)", "L'orologio esplode per la troppa pressione");
    }

    private void evento90(giocatore g, Scanner s) {
        baseEvent(g, s, "Compito dimenticato (di nuovo).", "Dì che hai avuto un'amnesia selettiva",
                "Scrivi tutto in 2 minuti", "Il prof ti prescrive una cura a base di fosforo", "Scrivi così veloce che la carta prende fuoco");
    }

    private void evento91(giocatore g, Scanner s) {
        baseEvent(g, s, "Stampante rotta (di nuovo).", "Colpiscila con un martello",
                "Chiedi aiuto al tecnico (che non c'è)", "Vieni denunciato per crudeltà verso le macchine", "Il tecnico ti chiede se hai provato a spegnere e riaccendere");
    }

    private void evento92(giocatore g, Scanner s) {
        baseEvent(g, s, "Nome sbagliato (di nuovo).", "Accetta il nuovo nome", "Arrabbiati come una bestia", "Diventi una persona completamente nuova", "Ti trasformi in un lupo mannaro per la rabbia");
    }

    private void evento93(giocatore g, Scanner s) {
        baseEvent(g, s, "Risate generali su di te.", "Fai un inchino", "Scompari tra le ombre", "Ricevi un Oscar per la miglior figura di... melma", "Le ombre ti chiedono di andartene");
    }

    private void evento94(giocatore g, Scanner s) {
        baseEvent(g, s, "Cane mangia snack (di nuovo).", "Educa il cane con amore", "Compra un gatto", "Il cane ora ha la laurea in filosofia", "Il gatto ti ignora ancora di più");
    }

    private void evento95(giocatore g, Scanner s) {
        baseEvent(g, s, "Vocale errato (di nuovo).", "Dì che era uno scherzo", "Spara al telefono", "Tutti ridono, ma per pietà", "Vieni accusato di tentato omicidio tecnologico");
    }

    private void evento96(giocatore g, Scanner s) {
        baseEvent(g, s, "Diario in classe (rubato?).", "Fai una denuncia ai carabinieri", "Comprane uno nuovo", "I carabinieri ti ridono in faccia", "Il nuovo diario è magico e ti insulta");
    }

    private void evento97(giocatore g, Scanner s) {
        baseEvent(g, s, "Sedia rotta.", "Siediti per terra con dignità", "Ruba la sedia al prof", "Vieni adorato come un dio della terra", "Il prof ti mette una nota sul soffitto");
    }

    private void evento98(giocatore g, Scanner s) {
        baseEvent(g, s, "Batteria 0% (addio).", "Usa la forza del pensiero", "Torna all'età della pietra", "La tua mente si illumina di immenso (no, è solo fame)", "Vieni scambiato per un uomo di Neanderthal");
    }

    private void evento99(giocatore g, Scanner s) {
        baseEvent(g, s, "Figura da pirla finale.", "Accetta il tuo destino di meme", "Cancella il gioco", "Vieni immortalato per l'eternità nel museo del cringe", "Il gioco si autodistrugge per la troppa sfiga");
    }
}
