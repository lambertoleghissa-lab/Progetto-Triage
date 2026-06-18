package triage.triage;

import java.util.Scanner;

public class VisitaCardiologicaFactory implements VisitFactory {
    private static Scanner sc = new Scanner(System.in);

    @Override
    public Visita creareVisita(String string) {
        // Metodo richiesto dall'interfaccia
        return null;
    }

    // Il metodo effettivo che usi nel MainTriage
    public Visita creareVisita(String dat, String med, String dia) {
        String frequenzaCard = "";
        String pressioneSist = "";
        String pressioneDiast = "";

        boolean cond6 = false;
        while (!cond6) {
            System.out.println("Inserire la frequenza cardiaca registrata:");
            frequenzaCard = sc.nextLine().trim();
            if (!frequenzaCard.isEmpty() && frequenzaCard.matches("\\d+")) {
                cond6 = true;
            } else {
                System.err.println("⚠️ Inserire una cifra valida");
            }
        }

        boolean cond7 = false;
        while (!cond7) {
            System.out.println("Inserire la pressione sistolica registrata:");
            pressioneSist = sc.nextLine().trim();
            if (!pressioneSist.isEmpty() && pressioneSist.matches("\\d+")) {
                cond7 = true;
            } else {
                System.err.println("⚠️ Inserire una cifra valida");
            }
        }

        boolean cond8 = false;
        while (!cond8) {
            System.out.println("Inserire la pressione diastolica registrata:");
            pressioneDiast = sc.nextLine().trim();
            if (!pressioneDiast.isEmpty() && pressioneDiast.matches("\\d+")) {
                cond8 = true;
            } else {
                System.err.println("⚠️ Inserire una cifra valida");
            }
        }

        return new VisitaCardiologica(frequenzaCard, pressioneSist, pressioneDiast, dat, med, dia);
    }
}