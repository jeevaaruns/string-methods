import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your String to check if its a palindrome : ");
        String str = scn.nextLine();
        
        if(ispalindrome(str)){
            System.out.println("your String is a palindrome");
            
        }
        else{
            System.out.println("your String is not a palindrome");
            
        }
            
        }
        public static boolean ispalindrome(String str){
            int left = 0 ; int right = str.length() - 1 ;
            while(left < right){
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
            
        }
        
    }
