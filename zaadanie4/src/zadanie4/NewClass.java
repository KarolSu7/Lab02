
package zadanie4;


public class NewClass {
    public int Punkt;
    public int Promien;
    double Powierzchnia, Srednica, Wsrodku;

    public NewClass(int Punkt, int Promien, double Powierzchnia, double Srednica, double Wsrodku) {
        this.Punkt = Punkt;
        this.Promien = Promien;
        this.Powierzchnia = Powierzchnia;
        this.Srednica = Srednica;
        this.Wsrodku = Wsrodku;
    }



    public int getPromien() {
        return Promien;
    }

    public double getPowierzchnia() {
        return Powierzchnia = (2*3.14*Promien);
    }

    public double setSrednica() {
        return Srednica = 2*Promien;
        
    }
    
    public boolean isPunkt(){
    if (Punkt <= Promien)
            return true;
        else 
            return false;
    }
    
    
}
