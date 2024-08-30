package usit;

class Rectangle {
    double width;
    double hight;

    Rectangle(double w, double h) {
        width = w;
        hight = h;
        
    }
    Rectangle() {
        width = 5;
        hight = 35;
        
    }
    Rectangle(double var) {
        width = hight = var;
        
    }

    double area() {
        return width * hight;
    }

}

public class classs {

    public static void main(String args[]) {
        Rectangle r0 = new Rectangle(5,5);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(25);
        // Rectangle r1 = new Rectangle();
        double area;
        area = r0.area();
        System.out.println(area);
        area = r1.area();
        System.out.println(area);
        area = r2.area();
        System.out.println( area);

    }

}
