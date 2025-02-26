class Outer {
    void display() {
        class LocalInner {
            void show() {
                System.out.println("Local Inner class method");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.show();
    }
}

public class outerclass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}
