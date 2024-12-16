package live.denisdev.agenziaviaggi;

public abstract class PacchettoViaggi {
    private double costo;
    public String destinazione;
    public int giorni;
    public PacchettoViaggi() {
        setCosto(0);
        setDestinazione("Sconosciuta");
        setGiorni(0);
    }
    public PacchettoViaggi(double costo, String destinazione, int giorni) {
        setCosto(costo);
        setDestinazione(destinazione);
        setGiorni(giorni);
    }
    public double getCosto() {
        return costo;
    }
    public  void setCosto(double costo) {
        this.costo = costo;
    }
    public String getDestinazione() {
        return destinazione;
    }
    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }
    public int getGiorni() {
        return giorni;
    }
    public void setGiorni(int giorni) {
        this.giorni = giorni;
    }
    @Override
    public String toString() {
        return "Pacchetto viaggio: " + getCosto();
    }
}
