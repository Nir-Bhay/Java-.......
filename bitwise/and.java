public class and {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(chekodd(n));
        System.out.println(checkeven(n));
    }

    public static boolean chekodd(int n) {
        return (n  & 1) == 1;
    }
    public static boolean checkeven(int n) {
        return (n - 1 & 1) == 1;
    }

}
