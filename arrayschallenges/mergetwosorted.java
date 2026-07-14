// 47. Create a program to merge two sorted arrays.

package arrayschallenges;

public class mergetwosorted {
    public static void main(String[] args) {
        int []arr1=ArrayUtility.inputArray();
        int []arr2=ArrayUtility.inputArray();
        int length =arr1.length+arr2.length;
        int []arr3= mergeArray(arr1, arr2);
        System.out.println("Merged Array is ");
        System.out.println(arr3);

        } 

        public static int []mergeArray(int []arr1,int []arr2){
            int arraySize = arr1.length+arr2.length;
            int []newArr= new int[arraySize];
        int i =0,j=0,k=0;
        while(i<arr1.length || j<arr2.length){
            if (j==arr2.length||(i<arr1.length && arr1[i]<arr2[j])) {
             newArr[k]=arr1[i];
             i++;
             k++;
            } else{
                newArr[k]=arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
        }
    }

