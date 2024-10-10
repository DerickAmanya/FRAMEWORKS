import java.util.ArrayList;

public class arrydisplay {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Elements in ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

