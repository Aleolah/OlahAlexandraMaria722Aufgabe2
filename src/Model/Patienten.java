package Model;

import java.util.ArrayList;

public class Patienten {
    private int id;
    private String name;
    private int age;
    private String diagnose;
    private ArrayList<Medikament> medikament;

    public Patienten(int id, String name, int age, String diagnose, ArrayList<Medikament> medikament) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnose = diagnose;
        this.medikament = medikament;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public ArrayList<Medikament> getMedikament() {
        return medikament;
    }

    @Override
    public String toString() {
        return "Patienten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", diagnose='" + diagnose + '\'' +
                ", medikament=" + medikament +
                '}';
    }
}
