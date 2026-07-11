public class primeNumber {
    public static void main(String[] args) {
        int num =11;
        int i =2;
        boolean isprime = true;
        while (i<num) { 
            if (num%1==0 && num%i==0) {
                isprime=false;
                break;
            } 
            i++;
        }
        if (isprime) {
            System.out.println(num+" is a primeNumber");
        } else {
                        System.out.println(num+" is not a primeNumber");

        }
    }
}
