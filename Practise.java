public class Practise {
    public static void main(String[] args) {
        System.out.println(isTrue(-3.567,3.567));
    }

    private static boolean isTrue(double v, double v1) {
        long x1=(long) (v*1000);
        long x2 = (long) (v1*1000);
        if(x1==x2){
            return true;
        }
        return false;
    }



}
