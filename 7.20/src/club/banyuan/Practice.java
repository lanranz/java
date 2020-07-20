package club.banyuan;

public class Practice {
    public static void main(String[] args) {

/**如果要保存7天时间的毫秒值（7x24x60x60x1000=604800000），需要使用什么数据类型，请选用合理的变量名称，将定义和初始化过程记录到答案中。**/

        int time = 7 * 24 * 60 * 60 * 1000;
        System.out.println(time);

/**如果要保存30天时间的毫秒值(30x24x60x60x1000=2592000000)，需要使用什么数据类型，请选用合理的变量名称，将定义和初始化过程记录到答案中**/

        long time1 = 30 * 24 * 60 * 60 * 1000L;
        System.out.println(time1);

/**如何验证小数字面量默认值是double数据类型的，请将代码说明记录到答案中**/

        System.out.println(3.14E39);

/**如何证明数组的length是final的，如何证明数组length是int类型**/

        int[] a = new int[5];
        //a.length=6;编译报错

/**尝试定义并初始化一个二维数组，第一行有3个元素{"你","我","他"}，
 * 第二行有5个元素{"金","木","水","火","土"}，第三行有2个元素{"天","地"}，
 * 请选用合适的数据类型定义，注意第二维度数组的长度是不同的**/

        String[][] b = new String[3][];
        b[0] = new String[]{"你", "我", "他"};
        b[1] = new String[]{"金", "木", "水", "火", "土"};
        b[2] = new String[]{"天", "地"};

/**请思考验证当float类型变量中保存了超出了int所能表示的范围的数字，将这个变量强制转换为int数据类型后，int数据类型变量中保存的值是多少**/

        float c = 1.2222E10F;
        int d = (int) c;
        System.out.println(d);

/**编写示例证明`||`会出现短路而`|`是不会短路的**/

        int x = 5;
        int y = 5;
        if (x > 0 || x++ > 0) {
            System.out.println(x);
        }
        if (y > 0 | y++ > 0) {
            System.out.println(y);
        }
    }

}
