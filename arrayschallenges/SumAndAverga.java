//  Create a program to do sum and average of all elements in a 2-D array
package arrayschallenges;

public class SumAndAverga {
    public static void main(String[] args) {
        int [][]array=ArrayUtility.input2DArray();
    }
    public int sum(int []array){
        int sum =0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum+=sum;
            }
        }
        return sum;
    }
}
