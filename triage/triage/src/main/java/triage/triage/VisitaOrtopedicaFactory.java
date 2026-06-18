package triage.triage;

import java.util.Scanner;

public class VisitaOrtopedicaFactory implements VisitFactory {
    private static Scanner sc = new Scanner(System.in);

    @Override
    public Visita creareVisita(String string) {
        // Metodo richiesto dall'interfaccia
        return null;
    }

    // Il metodo effettivo che usi nel MainTriage
    public Visita creareVisita(String dat, String med, String dia) {
        String parteCorpo = "";
        boolean cond5 = false;
        while (!cond5) {
            System.out.println("Inserire la zona del corpo interessata:");
            parteCorpo = sc.nextLine().trim();
            if (parteCorpo.length() < 50 && parteCorpo.length() > 0) {
                parteCorpo = parteCorpo.substring(0, 1).toUpperCase() + parteCorpo.substring(1);
                cond5 = true;
            } else {
                System.err.println("⚠️ Lunghezza testo non valida");
            }
        }
        return new VisitaOrtopedica(parteCorpo, dat, med, dia);
    }
}