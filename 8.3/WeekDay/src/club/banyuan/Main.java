package club.banyuan;

public class Main {
    public static void main(String[] args) {
        WeekDay[] values = WeekDay.values();
        for (WeekDay value : values) {
            value.isHoliday();
        }

        WeekDay sat = WeekDay.SATURDAY;
        for (WeekDay day : values) {
            System.out.println(day.compareTo(sat));
        }
    }
}
