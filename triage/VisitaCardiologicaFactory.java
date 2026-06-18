import triage.VisitFactory;
import triage.Visita;
import triage.VisitaCardiologica;
import java.util.Scanner;

public class VisitaCardiologicaFactory implements VisitFactory {

    @Override
    public Visita creareVisita(String string) {
        // NOTA: assumo che lo Scanner 'sc' e le variabili comuni 'dat', 'med', 'dia'
        // siano accessibili (es. ereditati, passati o definiti a livello di
        // istanza/classe)
        // per replicare fedelmente l'esempio del tuo collega.

        String frequenzaCardiaca = "";
        String pressioneSist = "";
        String pressioneDiast = "";

        // 1. Controllo e inserimento Frequenza Cardiaca
        boolean condBpm = false;
        while (!condBpm) {
            System.out.println("Inserire la frequenza cardiaca (bpm):");
            frequenzaCardiaca = sc.nextLine().trim();

            // Validazione (es: stringa numerica non vuota e ragionevole)
            if (!frequenzaCardiaca.isEmpty() && frequenzaCardiaca.matches("\\d+")) {
                condBpm = true;
            } else {
                System.err.println("⚠️ Errore di inserimento, inserire un valore numerico valido per i bpm");
            }
        }

        // 2. Controllo e inserimento Pressione Sistolica (Massima)
        boolean condSist = false;
        while (!condSist) {
            System.out.println("Inserire la pressione sistolica (massima mmHg):");
            pressioneSist = sc.nextLine().trim();

            if (!pressioneSist.isEmpty() && pressioneSist.matches("\\d+")) {
                condSist = true;
            } else {
                System.err.println(
                        "⚠️ Errore di inserimento, inserire un valore numerico valido per la pressione sistolica");
            }
        }

        // 3. Controllo e inserimento Pressione Diastolica (Minima)
        boolean condDiast = false;
        while (!condDiast) {
            System.out.println("Inserire la pressione diastolica (minima mmHg):");
            pressioneDiast = sc.nextLine().trim();

            if (!pressioneDiast.isEmpty() && pressioneDiast.matches("\\d+")) {
                condDiast = true;
            } else {
                System.err.println(
                        "⚠️ Errore di inserimento, inserire un valore numerico valido per la pressione diastolica");
            }
        }

        // Creazione visita specifica cardiologica
        Visita visita = new VisitaCardiologica(frequenzaCardiaca, pressioneSist, pressioneDiast, dat, med, dia);
        return visita;
    }
}