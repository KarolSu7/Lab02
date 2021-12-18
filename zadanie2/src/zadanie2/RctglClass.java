
package zadanie2;


public class RctglClass {
    
    double sz,dl,przekatna,obwod,pole;

    public RctglClass(double sz, double dl, double przekatna, double obwod ,double pole) {
        this.sz = sz;
        this.dl = dl;
        this.przekatna = przekatna;
        this.obwod = obwod;
        this.pole = pole;
    }

    public double getSz() {
        return sz;
    }

    public double getDl() {
        return dl;
    }
    
    public double getPrzekatna() {
        return przekatna = Math.sqrt((sz * sz + dl * dl));
    } 
    
    public double getObwod() {
        return obwod = 2*(sz+dl) ;
    }

    public double getPole() {
        return pole = sz * dl;
    }

}