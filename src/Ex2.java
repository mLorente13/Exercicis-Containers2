import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex2 {
    public static void main(String[] args) {
        Queue<Car> pq = new PriorityQueue<Car>();
        pq.offer(new Car("Renault", 15));
        pq.offer(new Car("Fiat", 5));
        pq.offer(new Car("Mercedes",25));
        pq.offer(new Car("Volkswagen", 20));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

class Car implements Comparable<Car> {
    private String brand;
    int priority;

    public Car(String brand, int price) {
        this.brand = brand;
        this.priority = price;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return brand;
    }
}