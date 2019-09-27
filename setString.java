import java.util.StringTokenizer;
class setString
{
    public static void main(String args[])
    {
        operations op = new operations();
        op.getToken();
        op.sort();
        op.diffOp();
    }
}
class operations
{
    static String in="My first name is Jagriti and my last name is kumari";
    static String arr[]=new String[30];
    static int c=0;
    
    void getToken()
    {
        StringTokenizer st=new StringTokenizer(in," ");
        
        while(st.hasMoreTokens())
        {
            arr[c]=st.nextToken();
            c++;
        }
        System.out.println("The original string is:::"+in);
        System.out.println("-------The Tokens of the strings--------");
        for(int i=0;i<c;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void sort()
    {
        for(int i=0;i<c;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                if(arr[j].compareToIgnoreCase(arr[i])  <  0)
                {
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        System.out.println("--------The sorted array of strings---------");
        for(int k=0;k<c;k++)
        {
            System.out.println(arr[k]);
        }
    }
    void diffOp()
    {
        int space=0,capital=0,vowel=0;

        //Count no. of white spaces,capital letters,vowels from the stringchar temp;
        for(int i=0;i<in.length();i++)
        {  char temp;
            temp=in.charAt(i);
            if(temp==' ')
                space++;
            if(temp>=65 && temp<=90)
                capital++;
            if(temp=='a' || temp=='A' || temp=='e' || temp=='E' || temp=='i' || temp=='I' || temp=='o' || temp=='O' || temp=='u' || temp=='U')
                vowel++;
        }

        System.out.println("The no. of white space is::"+space);
        System.out.println("The no. of capital letter is::"+capital);
        System.out.println("The no. of vowel is::"+vowel);
        
        //replace space with '/'
        
        String newString=new String(in);
        newString=newString.replace(' ','/');
        System.out.println("The replaced string is:::"+newString);

        //reverse string 

        StringBuffer revers=new StringBuffer(in);
        revers.reverse();
        System.out.println("The reverse string is:::"+revers);    
    }    

}