public class IsPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }

    private static int isPerfectSquare(int n) {
        if(n < 0) {
            return 0;
        }

        if(n == 0 || n ==1) {
            return 1;
        }

        int i = 2;

        while( i <= n/2 + 1) {
            if( i*i > n) {
                return i*i;
            }
            i++;
        }

        return 0;
    }
}