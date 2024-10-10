import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); 
      
        System.out.println("HashSet Elements: " + hashSet);

     
        if (hashSet.contains("Banana")) {
            System.out.println("Banana is present.");
        } else {
            System.out.println("Banana is not present.");
        }
    }
}

