
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class StringMatcher {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str= scan.nextLine(); 

        System.out.print("Enter the matching string:");
        String strMatch= scan.nextLine(); 

       String answerMatch= matching(str, strMatch);

       System.out.println(answerMatch);

    }

    public static String matching(String inputString,String givenString){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
}