import java.sql.Date;

public class OVChipkaart {
    private int kaartnummer;
    private Date geldigTot;
    private int klasse;
    private double saldo;
    private Reiziger reiziger; // Bidirectionele relatie met Reiziger
    private int reizigerId;

    // Constructor
    public OVChipkaart(int kaartnummer, Date geldigTot, int klasse, double saldo, int reizigerId) {
        this.kaartnummer = kaartnummer;
        this.geldigTot = geldigTot;
        this.klasse = klasse;
        this.saldo = saldo;
        this.reizigerId = reizigerId;
    }

    // Getter- en setter-methoden voor de attributen

    public int getKaartnummer() {
        return kaartnummer;
    }

    public void setKaartnummer(int kaartnummer) {
        this.kaartnummer = kaartnummer;
    }

    public Date getGeldigTot() {
        return geldigTot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    // toString()-methode voor een nette weergave van een OVChipkaart-object
    @Override
    public String toString() {
        return "OVChipkaart #" + kaartnummer + " (Geldig tot: " + geldigTot + ", Klasse: " + klasse + ", Saldo: " + saldo + ")";
    }

    public int getKaartNummer() {
        return kaartnummer;
    }

    public int getReizigerId() {
        return reizigerId;
    }

    public void setReizigerId(int reizigerId) {
        this.reizigerId = reizigerId;
    }
}
