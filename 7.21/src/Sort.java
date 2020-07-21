public class Sort {

    static void Sort(int[] arr, boolean isAsc) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (isAsc) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void Sort(int[] arr) {
        Sort(arr, true);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "]" + "=" + arr[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{13, 26, -3, 4, 54, 26, 37, 18, 69, -10};
        Sort(arr);
        print(arr);
    }
}
