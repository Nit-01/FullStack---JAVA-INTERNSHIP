import java.util.regex.*;

class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" FullStack");
        System.out.println(sb);

        Pattern p = Pattern.compile("[A-Za-z]+");
        Matcher m = p.matcher("Java");

        if(m.matches()) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }

    }
}


// The program starts from the main method. A StringBuilder object is created, and append() modifies the same object without creating a new one. 
// Then a Pattern is created to define the rule. Matcher checks the given string against the pattern. If it matches, it prints valid; 
// otherwise, it prints invalid.