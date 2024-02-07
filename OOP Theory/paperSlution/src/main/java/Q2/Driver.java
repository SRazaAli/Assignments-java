
package Q2;

public class Driver {
    public static void main(String[] args){
        ThreadA obj1 = new ThreadA();
        ThreadB obj2 = new ThreadB();
        
        obj1.start();
        obj2.start();
    }
}
