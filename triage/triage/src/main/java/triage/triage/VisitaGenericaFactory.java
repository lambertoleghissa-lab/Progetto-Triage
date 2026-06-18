package triage.triage;

public class VisitaGenericaFactory implements VisitFactory {

    @Override
    public Visita creareVisita(String rep) {
        // Metodo richiesto dall'interfaccia
        return null;
    }

    // Il metodo effettivo che usi nel MainTriage per passare tutti i parametri
    public Visita creareVisita(String rep, String dat, String med, String dia) {
        return new VisitaGenerica(rep, dat, med, dia);
    }
}