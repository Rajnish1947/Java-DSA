import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your input as String:");
        String str=input.nextLine();
        System.out.print("enter your input as String:");
        String str3=input.nextLine();
        System.out.println("enter your input as String:");
        
        
        
        
        // | Method       | Description                                                                  | Input Style | Example Input     |
        // | ------------ | ---------------------------------------------------------------------------- | ----------- | ----------------- |
        // | `next()`     | Reads **only one word** (stops at space, tab, or newline)                    | Single word | `Hello` (stops)   |
        // | `nextLine()` | Reads the **whole line** of text including spaces until the Enter key (`\n`) | Full line   | `Hello World 123` |
        
        String str1=input.next();
        System.out.println(str);
        // string length
        System.out.println("this is length of string "+str.length());


        System.out.println(str1);
        // string concatination
        String ConcaString=str+str3;
        System.out.println("it is concatination "+ConcaString);



        //charAt() is a method in Java used to get a specific character from a string at a given index (position).

        //char ch = stringName.charAt(index);
        System.out.println("that is charter of string base of index number "+ConcaString.charAt(1));
       
       
       
        // for the full  character of string printing
        String fullChar="pooj is good girl" ;
        for (int i = 0; i < fullChar.length(); i++) {
            System.out.println(fullChar.charAt(i));
        }




    }
}
