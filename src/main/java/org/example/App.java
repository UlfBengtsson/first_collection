package org.example;

import org.example.models.Car;
import org.example.models.MyList;
import org.example.models.Saab;
import org.example.models.Volvo;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        ex4();
    }

    private static void ex1() {

        Car bmw = new Car("BMW","525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740",123);

        List<Car> carList = new ArrayList<Car>();

        carList.add(bmw);
        carList.add(saab);
        carList.add(0, volvo);

        for (Car aCar : carList) {
            System.out.println(aCar);
        }

    }

    private static void ex2() {

        Car bmw = new Car("BMW","525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740",123);

        Set<Car> carSet = new HashSet();

        carSet.add(bmw);
        carSet.add(saab);
        carSet.add(volvo);
        carSet.add(volvo);// set dose not have duplicates

        for (Car aCar : carSet) {
            System.out.println(aCar);
        }
    }

    private static void ex3() {

        Car bmw = new Car("BMW", "525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740", 123);

        HashMap<String, Car> carHashMap = new HashMap<>();

        carHashMap.put("bmw", bmw);
        carHashMap.put("SAAB", saab);
        carHashMap.put("Volvo", volvo);
        carHashMap.put("Volvo", volvo);

        System.out.println("size of map: " + carHashMap.size());

        for (String keyString : carHashMap.keySet()) {
            System.out.println("key: " + keyString);
            System.out.println(carHashMap.get(keyString));
        }

        System.out.println("--------------------------");

        for (Car aCar : carHashMap.values() ) {
            System.out.println(aCar);
        }
    }

    private static void ex4() {
        Car bmw = new Car("BMW", "525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740", 123);

        MyList<Car> carMyList = new MyList<>();

        carMyList.add(bmw);
        carMyList.add(saab);
        carMyList.add(volvo);

        System.out.println(
                carMyList.getByIndex(
                        carMyList.indexOf(saab)));
    }
}
