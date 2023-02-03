package colecoes.java.model;

public class Helper {

    public static boolean isStringOnlyAlphabet(String str)
    {
        // If string is empty or null
        if (str == null || str.equals("")) {
            // Return false
            return false;
        }
        // If we reach here we have character/s in string
        for (int i = 0; i < str.length(); i++) {

            // Getting character at indices
            // using charAt() method
            char ch = str.charAt(i);
            if ((!(ch >= 'A' && ch <= 'Z'))
                    && (!(ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }

        // String is only alphabetic
        return true;
    }
}
