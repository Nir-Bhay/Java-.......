package qusitions;
public class classvsobj {

    // attributes
    int speed;
    String brand;
    String model;
    int price;

    // constructur
    public classvsobj(int speed, String brand, String model, int price) {
        this.speed = speed;
        this.brand = brand;
        this.model = model;
        this.price = price;

    }

    // method
    public void cardetails() {

        System.out.println("speed is " + speed);
        System.out.println("brand is " + brand);
        System.out.println("model is " + model);
        System.out.println("price is " + price);

    }

    public static void main(String[] args) {
        
        classvsobj myfirscar = new classvsobj(250, "nirbhay", "fir345", 122320);
         myfirscar.cardetails();
    }
}
