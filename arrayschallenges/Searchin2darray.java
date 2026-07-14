// 48. Create a program to search an element in a 2-D array.

package arrayschallenges;

public class Searchin2darray {
    public static void main(String[] args) {
        int[][] twodarray = { { 1, 2, 3 }, { 4, 5, 6 } };
        int searchkey = 3;

        for (int i = 0; i < twodarray.length; i++) {
            for (int j = 0; j < twodarray[i].length; j++) {
                if (searchkey == twodarray[i][j]) {
                    System.out.println("Key " + searchkey +" found at row " + i + " column " + j);
                }
            }
        }
    }
}
