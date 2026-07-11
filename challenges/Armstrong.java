public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int originalnum = num;
        int digit = 0;
        int checkarm = 0;
        int count = 0;
        while (num > 0) {
            num %= 10;
            count++;
            num /= 10;
        }
        num = originalnum;
        while (num > 0) {
            digit = num % 10;
            checkarm += (int) Math.pow(digit, count);
            num /= 10;
        }
        if (checkarm == originalnum) {
            System.out.println("num is a armstrong number ");

        }
    }
}




// public class Armstrong {
//     public static void main(String[] args) {
//         int num = 153;
//         int originalnum = num;
//         int digit = 0;
//         int checkarm = 0;
//         int count = 0;
//         while (num > 0) {
//             num %= 10;
//             count++;
//             num /= 10;
//         }
//         num = originalnum;
//         while (num > 0) {
//             digit = num % 10;
//             checkarm += (int) Math.pow(digit, count);
//             num /= 10;
//         }
//         if (checkarm == originalnum) {
//             System.out.println("num is a armstrong number ");

//         }
//     }
// }
