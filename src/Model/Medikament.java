package Model;

public class Medikament {
    String name;
    int preis;
    String krankheit;

    public Medikament(String name, int preis, String krankheit) {
        this.name = name;
        this.preis = preis;
        this.krankheit = krankheit;
    }

    @Override
    public String toString() {
        return "Medikament{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", krankheit='" + krankheit + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }

    public String getKrankheit() {
        return krankheit;
    }
}
