import java.util.Scanner;

class Test31 {
    public static void main(String[] args) {
        int[] data = {45, 12, 34, 56, 78, 42, 67};
        int[] result = reverseArray(data);

        
        System.out.print("Reversed array: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverseArray(int[] data) {
        int[] reversedArray = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            reversedArray[i] = data[data.length - 1 - i];
        }
        return reversedArray;
    }
}
