import java.util.Scanner;
import java.util.Arrays;

public class Anagram{
    public static boolean areAnagram(char[] str1 , char[] str2){
        int n1 = str1.length;
        int n2 = str2.length;
        
        if(n1 != n2){
            return false;
        }
    Arrays.sort(str1);
    Arrays.sort(str2);
    
    for(int i = 0 ; i < n1 ; i++){
        if(str1[i] != str2[i]){
            return false;
        }
    }
      return true;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter your first string: ");
        String a = scn.nextLine();
        
        System.out.println("Enter your second string: ");
        String b = scn.nextLine();
        
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        
        if(areAnagram(str1 , str2)){
            System.out.println("The Strings are Anagrams");
            
        }
        else{
            System.out.println("The Strings are not Anagrams");
        }
        
        
    }
    
}