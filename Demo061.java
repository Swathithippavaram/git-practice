public class Demo061 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 10:");
        
        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

