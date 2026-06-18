public class VisitaGenericaFactory implements VisitFactory {

    public Visita creareVisita() {
        // Controllo e inserimento reparto (generica)
        boolean cond4 = false;
        while (!cond4) {
            System.out.println("Inserire il reparto:");
            rep = sc.nextLine().trim();
            rep = rep.substring(0, 1).toUpperCase() + rep.substring(1);

            if (rep.length() < 50 && rep.length() > 0) {
                cond4 = true;
            } else {
                System.err.println("⚠️ Errore di inserimento, reparto non valido");
            }
        }

        // Creazione visita specifica
        visita = new VisitaGenerica(rep, dat, med, dia);
        return visita;
    }
}
