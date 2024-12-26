package ReferenceDataType;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {
      String name = "Bob";
      int[] arr = {1,2,3,4};

      System.out.println("My name is " + name);
      System.out.println(Arrays.toString(arr));  //if you not use toString method it will return address of array

    }
}
