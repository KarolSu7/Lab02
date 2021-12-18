
package zadanie3;


public class Zadanie3 {
    public static void main(String[] args) {
    
        MyNumber ob1 = new MyNumber(5.82);
        MyNumber ob2 = new MyNumber(2.2);
        
        System.out.println(ob1.isEven());
        System.out.println(ob1.isOdd());
        System.out.println(ob1.sqrt());
        System.out.println("pierwiastek " + ob1.pow(ob2));
        System.out.println(ob1.add(ob2));
        System.out.println(ob1.subract(ob2));        
    }
  }
