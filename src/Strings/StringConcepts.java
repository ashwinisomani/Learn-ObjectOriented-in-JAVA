package Strings;

public class StringConcepts {
    public static void main(String[] args) {

        // 1. Creating String
        String str1 = "Bob";    // Using string literal
        String str2 = new String("Alice"); // Using 'new' keyword

        // 2. String Concatenation

        String result = str1 + str2;
        System.out.println("Concatenation" +result);

        // 3. String Length
        int len1 = str1.length();

        System.out.println("Length of String 1: " + len1);
        System.out.println("Length of String 2: " + str2.length());

        // 4. Accessing Characters
        char firstChar = str1.charAt(0);
        System.out.println("First Character of String 1: " + firstChar);

        //5.  Substring
        String sub = str1.substring(0,2);
        System.out.println("Substring = " + sub);

        //6. String Comparison
        String str3 = "BOB";
        String str4 = "Bob";
        boolean comp1 = str1.equals(str3);
        boolean comp2 = str1.equals(str4);
        boolean comp3 = str1 == str4;
        boolean comp4 = str1 == str2;
        System.out.println("Compare of String 1 and String 3 " + comp1);  // case sensitive
        System.out.println("Compare of String 1 and String 4 " + comp2);  // case sensitive
        System.out.println("Compare of String 1 and String 4 " + comp3);  // true because both refer to same literal
        System.out.println("Compare of String 1 and String 2 " + comp4);

        //7. String to Uppercase & Lowercase

        String upperCase = str1.toUpperCase();
        String lowerCase = str1.toLowerCase();
        System.out.println("UpperCase of String1 " + upperCase);
        System.out.println("LowerCase of String1 " + lowerCase);

        //8. String Replace
        String replace = str2.replace("Alice" , "Zack");
        System.out.println("String 2 value replace by " + replace);

        //9. String Trim
        String str5 = "   learning java string    ";
        System.out.println("String without trim " +str5 );
        String trim = str5.trim();
        System.out.println("String after trim = " + trim);










    }
}
