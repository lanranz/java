import java.io.*;

public class Decode {

  static String encodeFilePath = "/Users/edz/Desktop/java/8.18/02.CaesarCipher/alice.code";
  static String decodeFilePath = "/Users/edz/Desktop/java/8.18/02.CaesarCipher/alice.code.decode";

  public static void main(String[] args) throws IOException {

    // 为了保证finally里面可以使用到这两个变量，必须把变量定义在try-finally代码块外部
    // 并且为了保证使用的时候变量被赋值，需要赋值null
    BufferedReader inStream = null;
    BufferedWriter outStream = null;

    String inputFilePath = args[0];
    String outputFilePath = args[1];

    System.out.println("输入文件：" + inputFilePath);
    System.out.println("输出文件：" + outputFilePath);

    //完成此部分代码，调用 caesarDecode 对传入的inputFilePath文件进行解密
    //将解密后的文本输出到 outputFilePath 文件中
    //尝试将alice.code进行解密
    try {
      inStream = new BufferedReader(new FileReader(inputFilePath));
      outStream = new BufferedWriter(new FileWriter(outputFilePath));

      String line = inStream.readLine();
      while (line != null) {
        char[] chars = line.toCharArray();
        for (char aChar : chars) {
          outStream.write(caesarDecode(aChar));
        }
        outStream.newLine();
        line = inStream.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      if (inStream != null) {
        inStream.close();
      }

      if (outStream != null) {
        outStream.close();
      }
    }

    System.out.println("解密成功！");
  }

  public static char caesarDecode(char ch) {
    //判断是否是大小写
    if (Character.isUpperCase(ch)) {
      return (char) ((ch - Encode.FIRST_UPPER + Encode.NUM_CHARS - Encode.OFFSET) % Encode.NUM_CHARS
          + Encode.FIRST_UPPER);
    } else if (Character.isLowerCase(ch)) {
      return (char) ((ch - Encode.FIRST_LOWER + Encode.NUM_CHARS - Encode.OFFSET) % Encode.NUM_CHARS
          + Encode.FIRST_LOWER);
    } else {
      return ch;
    }
  }

  public static String caesarDecode(String src) {
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : src.toCharArray()) {
      stringBuilder.append(caesarDecode(c));
    }
    return stringBuilder.toString();
  }

}

