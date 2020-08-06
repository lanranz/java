package club.banyuan;

public class TimerImpl implements Timer {
    private long star;
    private long end;
    private boolean isStart;

    @Override
    public void start() throws IllegalStateException {
        if (isStart == true) {
            throw new IllegalStateException();
        }
        star = System.currentTimeMillis();
        isStart = true;
    }

    @Override
    public void stop() throws IllegalStateException {
        if (isStart == false) {
            throw new IllegalStateException();
        }
        end = System.currentTimeMillis();
        isStart = false;
    }

    @Override
    public void reset() {
        star = 0;
        end = 0;
    }

    @Override
    public long getTimeMillisecond() {
        return end - star;
    }
}
