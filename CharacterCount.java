
// Java program to count occurrences 
// of a character using Stream 
  
import java.util.stream.*;
import java.util.Scanner; 
  
class CharacterCount{ 
  
    // Method that returns the count of the given 
    // character in the string 
    public static long count(String s, char ch) 
    { 
  
        return s.chars() 
            .filter(c -> c == ch) 
            .count(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str= scan.nextLine(); 
        System.out.print("Enter the character:");
        char c =scan.next().charAt(0); 
        System.out.println(count(str, c)); 


    } 
} 