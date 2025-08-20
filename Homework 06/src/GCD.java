public class GCD {
    public static int GCD(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b != 0){
            return GCD(b ,a % b);
        }
        else{
            return Math.abs(a);
        }
    }
}
