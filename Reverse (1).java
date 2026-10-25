import java.util.* ;

public class Reverse {
    
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String reversewords(String str){
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        
        for(int i = words.length - 1 ; i >= 0 ; i-- ){
            result.append(reverse(words[i])).append(" ");
            
        }
        return result.toString().trim();
        
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter your String : ");
        String a = scn.nextLine();
        
        String result = a.trim().contains(" ") ? reversewords(a.trim()) : reverse(a);
        
        System.out.println("Reversed result : " + result);
        
    }
}