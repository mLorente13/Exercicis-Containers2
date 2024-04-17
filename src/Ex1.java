import java.util.Iterator;

public class Ex1 {
    public static void main(String[] args) {
        Sequence s = new Sequence();
        for (Integer i : s) {
            System.out.println(i);
        }

    }
}

class Sequence implements Iterable<Integer> {
    private int[] data = {1,5,6,7,-1,2};

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public Integer next() {
                return data[index++];
            }
        };
    }
}
