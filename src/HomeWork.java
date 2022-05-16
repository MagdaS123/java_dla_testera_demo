public class HomeWork {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int c = 77;
        int d = 1;

        int sum1;
        sum1 = a + b;

        if (sum1 % 2 == 0){
            System.out.println("Suma a i b jest parzysta");
        } else {
            System.out.println("Suma a i b jest nieparzysta");
        }

        int sum2;
        sum2 = c + d;
        if (sum2 % 2 == 0){
            System.out.println("Suma c i d jest parzysta");
        } else {
            System.out.println("Suma c id jest nieparzysta");
        }

        if (sum1 % 2 == 0 && sum2 % 2 == 0){
            System.out.println("Obie sumy są parzyste");
        } else {
            System.out.println("Obie sumy NIE są parzyste");
        }
    }
}
