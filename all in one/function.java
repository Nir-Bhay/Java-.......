import java.util.*;


public class function {
    

    public static int Sum(int a, int b , int c) {
        int sum = a + b + c;
        return sum;
    }
 
    public static int addnumberSum(int sum) {
        int addsum = 0;
        for (int i = 0; i <= sum; i++) {
            if (i % 2 != 0) {
                addsum = addsum + i;
                System.out.print(i + " ");
            }

        }
         System.out.println(" ");
        return addsum;

   }

   public static int numAverage(int a, int b, int c) {
       int average = (a + b + c) / 2;
       return average;

   }

   public static int greaterNumber(int a, int b, int c) {
      
     System.out.print("Number ");
     if (a >= b || a >= c) {
          System.out.println(a + "  is greater then " + b + " and " + c);
    }else  if (b >= a || b >= c) {
        System.out.println(b + "  is greater then " + a + " and " + c);
    } else if (c >= a || c >= b) {
        System.out.println(c + "  is greater then " + a + " and " + b);

    }
    // System.out.println(" ");
    return 1 ;
    
   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter two number for sum a and b , c::");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = Sum(a, b,c);
         System.out.println("sum will be ::" + sum);
         System.out.println(" Avarage will be :: " + numAverage(a, b, c));
         System.out.println("sum of add number " + addnumberSum(sum));
        //  System.out.println("sum of add number " + greaterNumber(a, b, c));
        System.out.println("greater number between " + greaterNumber(a, b, c) );
        
    }
}
