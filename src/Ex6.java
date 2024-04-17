import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List il = new IntList(new Integer[]{1,2,3});
        // Comprova que el mètode «size()» funciona
        System.out.println(il.size());
        // Comprova que es poden treure elements amb «get()»
        System.out.println(il.get(1));
        // Què passa si intento afegir elements (il.add(10))?
//        il.add(10);
        // Recórre la llista amb un Iterador
        for (Object i : il) {
            System.out.println(i);
        }
        // Comprova si funciona el mètode «contains()»
        System.out.println(il.contains(3));
        // Comprova si funciona el mètode «sublist()»
        System.out.println(il.subList(0, 2));
        // Comprova si funciona el mètode «remove()»
//        il.remove(3);
        // Converteix la llista a un Array d'Objects i imprimeix-la
        System.out.println(Arrays.toString(il.toArray()));
    }
}

class IntList extends AbstractList<Integer> {
    Integer[] data;
    IntList(Integer[] data) {
        this.data = data;
    }
    @Override
    public Integer get(int index) {
        if (index > data.length || index < 0) {
            throw new IndexOutOfBoundsException("El índice proporcionado es demasiado grande");
        }
        return data[index];
    }
    @Override
    public int size() {
        return data.length;
    }

    @Override
    public boolean remove(Object o) {
        int index = this.indexOf(o);
        if (index == -1) return false;
        else {
            remove(index);
            return true;
        }
    }
}
