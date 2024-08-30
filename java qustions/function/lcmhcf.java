package function;
public class lcmhcf {
    public static void main(String[] args) {

        int n = 18;
        int m = 20;
        if (m>= n) {
            
        }

        /*
         * 18 9 3
         * 
         * 
         */

        // i wnat ot calculat ethe hcf and the lcm of the numnber

        int table = 2;
        int tablevalue = 0;
        int i = 1;
        while (i <= n) {
            tablevalue = table * i;
            if (tablevalue == n) {
                int ans = n / table;
                System.out.println(ans);
            }
            System.out.println(tablevalue);
            table++;
            i++;
        }
    }
}
