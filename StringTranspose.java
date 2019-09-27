import java.util.Scanner;

public class StringTranspose {  

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str= scan.nextLine(); 

        String newString=reverseWord(str);
        System.out.print(newString);

    }
    public static String reverseWord(String str){  
        String words[]=str.split("\\s");  
        String reverseWord="";  
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        return reverseWord.trim();  
    }  
}
  