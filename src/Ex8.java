import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(new Random().nextInt(100));
        fill(l1);
        List<Integer> l2 = new LinkedList<Integer>();
        fill(l2);
        test(l1);
        test(l2);
    }

    private static void fill(List<Integer> l1) {
        Random randNum = new Random();
        for (int i = 0; i < 5000000; i++) {
            l1.add(randNum.nextInt(100));
        }
        System.out.println(System.currentTimeMillis());
    }

    private static void test(List<Integer> l1) {
        Random randNum = new Random();
        for (int i = 0; i < 1000; i++) {
            l1.get(randNum.nextInt(5000000));
        }
        System.out.println(System.currentTimeMillis());
    }
}
