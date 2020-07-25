package club.banyuan;

class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void setTime(int aHour, int aMinute, int aSecond) {
        this.hour = aHour;
        this.minute = aMinute;
        this.second = aSecond;
    }

    String timeToString() {
        boolean hourIsSingle = false;
        boolean minuteIsSingle = false;
        boolean secondIsSingle = false;

        String time = "0";
        if (hour < 10) {
            hourIsSingle = true;
        }
        if (minute < 10) {
            minuteIsSingle = true;
        }
        if (second < 10) {
            secondIsSingle = true;
        }

        if (hourIsSingle) {
            time = "0" + hour;
        }

        if (minuteIsSingle) {
            time = time + ":" + "0" + minute;
        }

        if (secondIsSingle) {
            time = time + ":" + "0" + second;
        }

        return time;
    }

    void nextSecond () {
        second++;
        if (second == 60) {
            minute++;
            second = 0;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                    System.out.println("第二天");
                }
            }
        }
    }


    public static void main(String[] args) {
        Time time = new Time(23,59,59);
        time.nextSecond();
        System.out.println(time.timeToString());
        time.setTime(12,0,0);
        System.out.println(time.timeToString());
    }
}

