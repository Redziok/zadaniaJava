package pl.imiajd.Mingielewicz.Test2;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Rekrutacja rekrutacja = new Rekrutacja();
        Rekrutacja.setDoswiadczenie();
        ArrayList<Kandydat> grupa = new ArrayList<>();


        grupa.add(new Kandydat("Adam Mickiewicz", 28, "licencjat",2));
        grupa.add(new Kandydat("Juliusz Słowacki", 28, "mistrz",2));
        grupa.add(new Kandydat("Jan Brzechwa", 28, "licencjat",2));
        grupa.add(new Kandydat("Bolesław Prus", 32, "licencjat",2));
        grupa.add(new Kandydat("Jan Kochanowski", 28, "licencjat",2));
        grupa.add(new Kandydat("Aleksander Fredro ", 28, "licencjat",3));

        for (Kandydat p : grupa) {
            System.out.println(p.getNazwa() + ", " + p.getWiek() + "lat,  " + p.getWyksztalcony() + ", " + p.getLataDoswiadczenia() + " lata doswiadczenia");
        }

        System.out.print("Porównanie: " + grupa.get(0).compareTo(grupa.get(2)));
        System.out.println();
        grupa.sort(Kandydat::compareTo);

        for (Kandydat p : grupa) {
            System.out.println(p.getNazwa() + ", " + p.getWiek() + "lat,  " + p.getWyksztalcony() + ", " + p.getLataDoswiadczenia() + " lata doswiadczenia");
        }

        for(Kandydat p : grupa) {
            if(qualified(p)) {
                rekrutacja.dodajKandydata(p);
            }
        }

        System.out.println("\nKandydaci ktorzy zakwalifikowali sie: ");
        Map<String, Integer> kandydaciZakwalifkowani = recruitmentMap(grupa);
        for(Map.Entry e : kandydaciZakwalifkowani.entrySet()) {
            System.out.println(e.getKey() + ", " + e.getValue() + " lata doswiadczenia");
        }
    }

    public static class Kandydat implements Cloneable, Comparable<Kandydat> {
        private String nazwa;
        private int wiek;
        private String wyksztalcony;
        private int lataDoswiadczenia;

        public Kandydat(String nazwa, int wiek, String wyksztalcony, int lataDoswiadczenia) {
            this.nazwa = nazwa;
            this.wiek = wiek;
            if (!wyksztalcony.toLowerCase().equals("licencjat") && !wyksztalcony.toLowerCase().equals("mistrz")) {
                throw new IllegalArgumentException("W polu wyksztalcenie mozna tylko wpisac licencjat lub mistrz");
            }
            this.wyksztalcony = wyksztalcony;
            this.lataDoswiadczenia = lataDoswiadczenia;
        }

        public String getNazwa() { return nazwa; }

        public int getWiek() { return wiek; }

        public String getWyksztalcony() { return wyksztalcony; }

        public int getLataDoswiadczenia() { return lataDoswiadczenia; }

        @Override
        public String toString() {
            return getNazwa() + ", " + getWiek() + "lat,  " + getWyksztalcony() + ", " + getLataDoswiadczenia() + " lata doswiadczenia";
        }

        @Override
        public int compareTo(Kandydat o) {
            int result = this.wyksztalcony.compareTo(o.wyksztalcony);
            if(result==0) {
                result = Integer.valueOf(this.wiek).compareTo(o.getWiek());
            }
            if(result==0) {
                result = Integer.valueOf(this.lataDoswiadczenia).compareTo(o.getLataDoswiadczenia());
            }
            return result;
        }
    }

    public static class Rekrutacja {
        private static int doswiadczenie;
        private ArrayList<Kandydat> listaKandydatow;

        public Rekrutacja() { this.listaKandydatow = new ArrayList<>(); }

        public static void setDoswiadczenie() { doswiadczenie = 2; }

        public static int getDoswiadczenie() { return doswiadczenie; }

        public void setListaKandydatow(ArrayList<Kandydat> listaKandydatow) {
            this.listaKandydatow = listaKandydatow;
        }

        public ArrayList<Kandydat> getListaKandydatow() { return listaKandydatow; }

        public void dodajKandydata(Kandydat k) { this.listaKandydatow.add(k); }
    }

    public static boolean qualified(Kandydat k) {
        if(k.getLataDoswiadczenia()>=Rekrutacja.getDoswiadczenie())
            return true;
        return false;
    }

    public static Map<String, Integer> recruitmentMap(ArrayList<Kandydat> klist) {
        Map<String, Integer> kandydaciZakwalifkowani = new HashMap<>();
        for(Kandydat k : klist) {
            if(qualified(k)) {
                kandydaciZakwalifkowani.put(k.getNazwa(), k.getLataDoswiadczenia());
            }
        }
        return kandydaciZakwalifkowani;
    }
}