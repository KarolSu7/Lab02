
package zadanie1;

public class Human {
//pola klasy
   int wiek,waga,wzrost;
   String imie;
   boolean plec;
 
    public Human(int wiek, int waga, int wzrost, String imie, boolean plec) {
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
        this.imie = imie;
        this.plec = plec;
    }
 
    public int getWiek() {
        return wiek;
    }
 
    public int getWaga() {
        return waga;
    }
 
 
    public int getWzrost() {
        return wzrost;
    }
 
    public String getImie() {
        return imie;
    }
 
    public boolean isPlec() {
        return plec;
    }
    public boolean isMale(){
        if (plec == true)
            return true;
        else 
            return false;
    }
    }
