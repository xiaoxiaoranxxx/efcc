public class Temp {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 3, 5, 2 };
        System.out.print("冒泡排序前  ：");
        printArray(arr); // 打印数组元素
        bubbleSort(arr); // 调用排序方法
        System.out.print("冒泡排序后  ：");
        printArray(arr); // 打印数组元素
    }

    // 定义打印数组元素的方法 
    public static void printArray(int[] arr) {
        // 循环遍历数组的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 打印元素和空格
        }
        System.out.print("\n");
    }

    // 定义对数组排序的方法
    public static void bubbleSort(int[] arr) {
        // 定义外层循环
        for (int i = 0; i < arr.length - 1; i++) {
            // 定义内层循环
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // 比较相邻元素
                    // 下面的三行代码用于交换两个元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "轮排序后：");
            printArray(arr); // 每轮比较结束打印数组元素
        }
    }
}
