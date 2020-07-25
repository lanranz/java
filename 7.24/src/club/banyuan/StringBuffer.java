package club.banyuan;

public class StringBuffer {
    private String s = "";
    private String r = "";

    public void append(String str) {
        s += str;
        r = str + r;
    }

    public void append(char str) {
        s += str;
        r = str + r;
    }


    public String toString() {
        return s;
    }

    void clear() {
        s = "";
    }

    public String reverse() {
        return r;
    }

    public String reverse(int form, int to) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < (to - form) / 2; i++) {
            char a = chars[form + i];
            chars[form + i] = chars[to - 1 - i];
            chars[to - 1 - i] = a;
        }
        s = new String(chars);
        return s;
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("123456");
        stringBuffer.append('7');
        System.out.println(stringBuffer.s);
        System.out.println(stringBuffer.r);
        stringBuffer.reverse(1,3);
        System.out.println(stringBuffer.s);
        stringBuffer.clear();
        System.out.println(stringBuffer.s);
    }
}
