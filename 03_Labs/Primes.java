public class Primes{
    public static boolean isPrime(int number){
        if (number == 1 || number == 2) return true;
        for (int g=2;g<(int)(Math.sqrt(number));++g)
            if (number % g == 0)
                return false;
        return true;
    }
    public static int largestPrimebeforeN(int N){
        for (int g=N-1;g>=1;--g)
            if (isPrime(g))
                return g;
        return -1;
    }
    public static void main(String[] args){
        int number = Integer.parseInt(args[0]);
        System.out.println("The prime number immediately before " + number + " is " + largestPrimebeforeN(number) + '.');
    } 
}
