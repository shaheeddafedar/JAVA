public class sumofdigit {
    public static void main(String[] args) {
        int num =12345;
        int digit=0;
        int sumofdigit=0;
        while (num>0) { 
             digit = num%10;
            sumofdigit+=digit;
            num=num/10;
        }
        System.out.println(sumofdigit);
    }
}
