package live.denisdev.agenziaviaggi;

import java.util.ArrayList;

public class Agenzia {
    private ArrayList<PacchettoViaggi> pacchettoViaggi;
    public Agenzia() {
        pacchettoViaggi = new ArrayList<>();
    }
    public void addVolo(String destinazione, double costo, int giorni) {
        pacchettoViaggi.add(new PacchettoVolo(costo, destinazione, giorni));
    }
}
