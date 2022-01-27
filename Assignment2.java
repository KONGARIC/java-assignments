package Java;
import java.io.*;
import java.util.*;
public class Assignment2 {
    public static boolean check(String string)
    {
        int total=26;
        HashMap<Character,Integer> map=new HashMap<>();
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        char[] characterArray=alphabet.toCharArray();
        for(char character:characterArray)
        {
            map.put(character,1);
        }


        for(int i=0;i<string.length();i++)
        {

            if(string.charAt(i)>=97 && string.charAt(i)<=123)
            {
                map.put(string.charAt(i),0);
            }

        }
        for(char character:characterArray)
        {
            if(map.get(character)!=0)
            {
                return false;
            }
        }


        return true;
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        System.out.println(check(string));



    }
}
