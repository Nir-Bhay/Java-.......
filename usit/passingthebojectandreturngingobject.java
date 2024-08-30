package usit;


class X {
    int a;
}

public class passingthebojectandreturngingobject {
    public static void main(String[] args) {
        X obj = new X();
        obj.a = 10;
        System.out.println("Value of a before calling method: " + obj.a);
        passingthebojectandreturngingobject b = new passingthebojectandreturngingobject();
        b.showcase(obj);
    }
 
    void showcase(X ref) {
    System.out.println(ref.a);
}
}
