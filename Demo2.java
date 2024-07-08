class Demo2{
    public static int binarySearch(int items[], int key){
        int left = 0;
        int right = items.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(key == items[mid]){
                return mid;
            }
            
            if(key < items[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int key = 62;
        int items[] = {1, 2, 6, 7, 9, 10, 11, 17, 20, 33, 34, 36, 48, 52, 55, 58, 59, 60, 62, 66, 69, 70, 78, 89, 91, 96, 100};
        int finalValue = binarySearch(items, key);

        if (finalValue != -1) {
            System.out.println("Key is found at index: " + finalValue);
        } else {
            System.out.println("Key is not found in the array.");
        }
    }
}
