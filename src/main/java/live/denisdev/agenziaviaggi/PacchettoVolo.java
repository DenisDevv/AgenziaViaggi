package live.denisdev.agenziaviaggi;

public class PacchettoVolo extends PacchettoViaggi {
    boolean andataRitorno;
    public PacchettoVolo(double costo, String destinazione, int giorni, boolean andataRitorno) {
        super(costo, destinazione, giorni);
        this.andataRitorno = andataRitorno;
    }
    @Override
    public String toString() {
        return "Pacchetto volo: " + getDestinazione() + " Costo: " + getCosto() + " Durata: " + getGiorni() + " giorni" + (andataRitorno ? " Andata e ritorno" : " Solo andata");
    }
    
}
