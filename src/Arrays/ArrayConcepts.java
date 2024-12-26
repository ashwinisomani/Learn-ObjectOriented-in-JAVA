package Arrays;

import java.util.Arrays;

public class ArrayConcepts {
    public static void main(String[] args) {
        //Single Array
        int[] singleArray = {1, 2, 3, 4};

        //Multi Dimension Array
        int[][] multiDimensionArray = {{1,2,3},{1,2,3},{1,2,3}};


        System.out.println(Arrays.toString(singleArray));
        System.out.println(Arrays.deepToString(multiDimensionArray));
        System.out.println(multiDimensionArray[0][1]); // access single value

        // Jagged Array

        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[1];

        jaggedArray[0][0] = 10;
        jaggedArray[0][1] = 20;
        jaggedArray[1][0] = 30;
        jaggedArray[1][1] = 40;
        jaggedArray[1][2] = 50;
        jaggedArray[2][0] = 60;

        System.out.println(Arrays.deepToString(jaggedArray));

        String[] strArr = {"Bob" , "Alice" , "Zack"};
        System.out.println(Arrays.toString(strArr));




    }
}
