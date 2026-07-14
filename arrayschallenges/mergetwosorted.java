// 47. Create a program to merge two sorted arrays.


 package arrayschallenges;

public class mergetwosorted {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArray(arr1, arr2);

        System.out.println("Merged Array:");

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] newArray = new int[arr1.length + arr2.length];

        int i = 0; // arr1 index
        int j = 0; // arr2 index
        int k = 0; // newArray index

        // Compare both arrays
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                newArray[k] = arr1[i];
                i++;
            } else {
                newArray[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            newArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            newArray[k] = arr2[j];
            j++;
            k++;
        }

        return newArray;
    }
}



// package arrayschallenges;

// import java.util.Arrays;

// public class mergetwosorted {
//     public static void main(String[] args) {
//         int []arr1=ArrayUtility.inputArray();
//         int []arr2=ArrayUtility.inputArray();
//         int length =arr1.length+arr2.length;
//         int []arr3= mergeArray(arr1, arr2);
//         System.out.println("Merged Array is ");
       
//             System.out.println(Arrays.toString(arr3));
        

//         } 

//         public static int []mergeArray(int []arr1,int []arr2){
//             int arraySize = arr1.length+arr2.length;
//             int []newArr= new int[arraySize];
//         int i =0,j=0,k=0;
//         while(i<arr1.length || j<arr2.length){
//             if (j==arr2.length||(i<arr1.length && arr1[i]<arr2[j])) {
//              newArr[k]=arr1[i];
//              i++;
//              k++;
//             } else{
//                 newArr[k]=arr2[j];
//                 j++;
//                 k++;
//             }
//         }
//         return newArr;
//         }
//     }
