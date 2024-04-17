import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(new Random().nextInt());
        System.out.println("Fill ArrayList");
        fill(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        System.out.println("Fill LinkedList");
        fill(l2);
        System.out.println("Test ArrayList");
        test(l1);
        System.out.println("Test LinkedList");
        test(l2);
    }

    private static void fill(List<Integer> l1) {
        Random randNum = new Random();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 5000000; i++) {
            l1.add(randNum.nextInt());
        }
        System.out.println(System.currentTimeMillis());
    }

    private static void test(List<Integer> l1) {
        Random randNum = new Random();
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 1000; i++) {
            l1.get(randNum.nextInt(5000000));
        }
        System.out.println(System.currentTimeMillis());
    }
}
