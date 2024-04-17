import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();

        countryList.add(new Country("Spain"));
//      Ex 5:  countryList.add("Hola mundo"); No funciona
        countryList.add(new Country("France"));
        countryList.add(new Country("Germany"));
        countryList.add(new Country("Italy"));
        countryList.add(new Country("Andorra"));

        Collections.shuffle(countryList);
        System.out.println(countryList);
        Collections.shuffle(countryList);
        System.out.println(countryList);
        Collections.shuffle(countryList);
        System.out.println(countryList);
        Collections.shuffle(countryList);
        System.out.println(countryList);
    }
}

class Country {
    String name;

     public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
