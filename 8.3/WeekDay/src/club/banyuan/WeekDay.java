package club.banyuan;

public enum WeekDay {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日"),;

    private String Chinese;

    WeekDay(String chinese) {
        this.Chinese = chinese;
    }

    boolean isWeekDay(){
        if (this == SATURDAY ||this == SUNDAY){
            System.out.println(this+"是假日");
            return false;
        }
        System.out.println(this+"不是假日");
        return true;
    }

    boolean isHoliday(){
        return !isWeekDay();
    }

    @Override
    public String toString() {
        return Chinese;
    }
}
