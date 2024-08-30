package qusitions;
public class reversetheNumber {
    public static void main(String[] args) {
        int num = 1234;
        int value = 0;
       

        while (num!=0) {
            int num2 = num % 10;
            value = value * 10 + num2;

            num = num / 10;

            System.out.println(value);
           
        }
    }
}
