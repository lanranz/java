public class Time {

    static void convert(long minute){
        int year = 365*24*60;
        int day = 24*60;
        if(minute<year){
            System.out.println(minute+"分钟是"+minute/day+"天");
        }else{
            System.out.println(minute+"分钟是"+minute/year
            +"年"+(minute%year)/day+"天");
        }
    }

    public static void main(String[] args) {
        convert(3456789);
    }
}

