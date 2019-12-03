 public static void insertSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1;i < arr.length;i++) {
            int temp = arr[i];
            int j = i -1;
            for (;j >= 0;j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }
