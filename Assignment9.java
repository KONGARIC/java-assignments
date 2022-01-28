package Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
class Assignment9 {
    public static void main(String args[]) {
        Pattern pattern = Pattern.compile("^[A-Z]+[A-Za-z0-9]*[.]");
        //  ^ -->Finds a match as the beginning of a string
        //  ^[A-Z] -->Finds a match start with Capital letter of a string
        //  +  --> character repeats once or more
        //  ^[A-Z]+  --> String must start with one or more capitals
        //  *  -->means zero or more occurrences
        //   [A-Za-z0-9]  -->  any character A to Z or a to z or 0 to 9
        //   {a-Za-z0-9]*  --> any character A to Z or a to z or 0 to 9 repeats zero or more 
        //   [.]  -->  peroid 
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Matcher matcher = pattern.matcher(string);
        System.out.println("User string start with Capital letter and end with period "+matcher.matches());
    }
}
