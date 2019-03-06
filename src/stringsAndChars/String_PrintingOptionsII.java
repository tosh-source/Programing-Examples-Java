package stringsAndChars;

public class String_PrintingOptionsII {

    public static void main(String[] args) {

        //1.Check "Null or Empty" strings
        String str = null;

        if(str == null || str.isEmpty()) {
            System.out.println("Null or Empty");
        }
        //NOTE: .isEmpty() can NOT check null object, this throw an exception. ("str.isEmpty()" <==> "str.length() == 0")

    }
}
