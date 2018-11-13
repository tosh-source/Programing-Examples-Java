package stringsAndChars;

public class StringTrim_and_StringReplace {

    public static void main(String[] args) {

        //1.Remove "white-spaces" from string with method ".Trim()" //Премахване на празните полета от стринг(в това число влизат и символите за нов ред и за табулации)
        //////////////////////////////////////////////////
        String userName = "  \n\n  \t  Jonie English    ";
        String correctUserData = userName.trim();  //without ".Trim()" we have two new lines, tabulation and some white-spaces.
        //////////////////////////////////////////////////
        System.out.println(correctUserData);

        //Replace strings
        String myString = "aaabbbccc";
        System.out.println(myString.replace('b', '*'));

    }
}
