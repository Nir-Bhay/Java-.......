package usit;

public class exercise02 {
   
    static int i;

    static  Test()
     {
        i+=4;
        System.out.println(i);
     }

    void show() 
     {
        i++;
        System.out.println(i);
    }

    {
        i += 10;
        System.out.println(i);
    }
    static {
        i += 10;
        System.out.println(i);
    }
   public static void main(String[] args) {
       
           i /= 10;
           System.out.println(i);
           Test t = new Test();
           t.show();

       }
    static{
        i+=10;
        System.out.println(i);
    }
   
}
