public class genericmtds {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Integer Array:");
        printArray(intArray);

        // String array
        String[] strArray = {"Apple", "Banana", "Orange"};
        System.out.println("\nString Array:");
        printArray(strArray);
    }
}

