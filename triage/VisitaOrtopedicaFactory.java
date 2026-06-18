import triage.VisitFactory;
import triage.Visita;
import triage.VisitaOrtopedica;

public class VisitaOrtopedicaFactory implements VisitFactory {

    @Override
    public Visita creareVisita() {
        // Controllo e inserimento parteCorpo (ortopedica)
        boolean cond5 = false;
        while (!cond5) {
            System.out.println("Inserire la zona del corpo interessata:");
            parteCorpo = sc.nextLine().trim();
            parteCorpo = parteCorpo.substring(0, 1).toUpperCase() + parteCorpo.substring(1);

            if (parteCorpo.length() < 50 && parteCorpo.length() > 0) {
                cond5 = true;
            } else {
                System.err.println("⚠️ Errore di inserimento, Errore di inserimento, lunghezza testo non valida");
            }
        }

        // Creazione visita specifica
        visita = new VisitaOrtopedica(parteCorpo, dat, med, dia);
        return visita;
    }
}
