import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");

        // Access value by key
        System.out.println("Value for key 2: " + hashMap.get(2)); // Banana

        // Display all key-value pairs
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}

