
package zadanie3;


public class MyNumber {
    
    private double wartosc;

    public MyNumber(double wartosc) {
        this.wartosc = wartosc;
    }
    
    public boolean isOdd(){
        return ! isEven();
    
    }
    public boolean isEven() {
        return wartosc % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(wartosc);
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber(Math.pow(wartosc,x.wartosc));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(wartosc + x.wartosc);
    }

    public MyNumber subract(MyNumber x) {
        return new MyNumber(wartosc - x.wartosc);
    }
    @Override
    public String toString() {
       return String.valueOf(wartosc);
    }
   
    
}