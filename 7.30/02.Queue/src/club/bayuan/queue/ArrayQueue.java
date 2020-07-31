package club.bayuan.queue;

import java.util.Arrays;

public class ArrayQueue implements Queue {
    public Object[] value = new Object[10];
    public int count;

    @Override
    public void add(Object o) {
        if (count == value.length) {
            Object[] newArr = new Object[value.length * 2];
            System.arraycopy(value, 0, newArr, 0, count);
            value = newArr;
        }

        value[count++] = o;
    }


    @Override
    public Object delete() {
        if (isEmpty()) {
            return null;
        }
        Object rlt = value[0];
        System.arraycopy(value, 1, value, 0, count - 1);
        value[count - 1] = null;
        return rlt;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(value[i]);
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.print();
        queue.delete();
        queue.print();
        queue.isEmpty();
    }
}
