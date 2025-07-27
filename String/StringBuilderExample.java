import java.util.*;;
public class StringBuilderExample {
    public static void main(String[] args) {
        ToUppercaseString sb = new ToUppercaseString();  // ✅ initialize StringBuilder

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
            
        }
        System.out.println(sb); 
        System.out.println(sb.length()); 

    }
}
