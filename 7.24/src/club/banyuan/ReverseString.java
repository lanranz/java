package club.banyuan;

public class ReverseString {

    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        char[] reversedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversedChars[chars.length - 1 - i] = chars[i];
        }
        return new String(reversedChars);
    }

    public static void main(String[] args) {

        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        String target = "To be or not to be";
        String[] words = target.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.printf("[%d]=%s\n", i, words[i]);
        }
        for (int i = 0; i < words.length; i++) {
            stringBuffer.append(reverseString(words[i]));
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer.toString());
    }

}