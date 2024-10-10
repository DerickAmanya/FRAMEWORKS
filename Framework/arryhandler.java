import java.util.ArrayList;

public class arryhandler{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        
        System.out.println("Element at index 1: " + arrayList.get(1)); 
        arrayList.remove(2); 

        System.out.println("ArrayList Elements: " + arrayList);
    }
}
