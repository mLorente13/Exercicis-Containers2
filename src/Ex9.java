import java.util.*;

public class Ex9 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        add(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        add(l2);
    }

    private static void add(List<Integer> l1) {
        Random randNum = new Random();
        for (int i = 0; i < 5000000; i++) {
            l1.add(randNum.nextInt());
        }
        System.out.println(System.currentTimeMillis());

        for (int i = 0; i < 5000000; i++) {
            l1.remove(randNum.nextInt());
        }
        System.out.println(System.currentTimeMillis());
    }
}