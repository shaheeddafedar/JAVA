// 50. Create a program to find the sum of two diagonal elements.
package arrayschallenges;

public class Sumofdiagonal {
    public static void main(String[] args) {
         int[][] array = ArrayUtility.input2DArray();
         int sum = sum(array);
         System.out.println("Sum : "+sum);
    }
    public static int sum(int [][]array){
        int sumright =rightsum(array);
        int sumleft = leftsum(array);
        int sum = sumright+sumleft;
        if (array.length%2!=0) {
            int ind = array.length/2;
            sum-=array[ind][ind];
        }
        return sum;
    }
    public static  int rightsum(int [][]array){
        int lenght=array.length;
        int sum =0;
        for (int i = 0; i <lenght; i++) {
            for (int j = 0; j <lenght; j++) {
                if (i ==j) {
                    sum=sum+array[i][j];
                }
            }
        }
        return sum;
    }
     public static  int leftsum(int [][]array){
        int lenght=array.length;
        int sum =0;
        for (int i = 0; i <lenght; i++) {
            for (int j = 0; j <lenght; j++) {
                if (i +j==lenght-1) {
                    sum=sum+array[i][j];
                }
            }
        }
        return sum;
    }

}
