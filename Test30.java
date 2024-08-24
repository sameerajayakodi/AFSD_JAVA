import java.util.Scanner;

class Test30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Number " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter Number what you want to search: ");
        int key = sc.nextInt();

        searchElement(array, key);
    }

    public static void searchElement(int[] array, int key) {
        boolean isAvailable = false;
        for (int i :array) {
            if (i == key) {
                isAvailable = true;
                break;
            }
        }
        System.out.println(isAvailable);
    }
}
