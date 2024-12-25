package busca_binaria;

public class RevertString {

    public static void main(String[] args) {

        String result = revert("Hello world");
        System.out.println(result);
    }

    public static String revert(String string) {

        if (string.length() <= 1)
            return string;

        String[] array = string.split(" ");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= array.length - 1; i++)
            builder.append(revertString(array[i]) + " ");
        return builder.toString().trim();
    }

    public static String revertString(String string) {

        StringBuilder revertedString = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--)
            revertedString.append(string.charAt(i));

        return revertedString.toString();
    }
}
