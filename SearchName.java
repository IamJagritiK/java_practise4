import java.util.Scanner;

public class SearchName {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str= scan.nextLine(); 

         boolean newString= isHarryHere(str);
        System.out.print(newString);

    }



    public static boolean isHarryHere(String input){
        return input.matches("(?i).*Harry.*");
    }
}