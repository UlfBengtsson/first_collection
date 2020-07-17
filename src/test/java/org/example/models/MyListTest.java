package org.example.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void add() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void getByIndex() {
        //Arrange
        Car bmw = new Car("BMW", "525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740", 123);

        MyList<Car> carMyList = new MyList<>();

        carMyList.add(bmw);//0
        carMyList.add(saab);//1
        carMyList.add(volvo);//2

        //Act
        Car result = carMyList.getByIndex(carMyList.indexOf(saab));

        //Assert
        assertEquals(saab, result);
    }

    @Test
    public void getByIndexBadTooHigh() {
        //Arrange
        Car bmw = new Car("BMW", "525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740", 123);

        MyList<Car> carMyList = new MyList<>();

        carMyList.add(bmw);//0
        carMyList.add(saab);//1
        carMyList.add(volvo);//2

        //Act
        Car resultTooHighNull = carMyList.getByIndex(Integer.MAX_VALUE);

        //Assert
        assertNull(resultTooHighNull);
    }

    @Test
    public void getByIndexNegative() {
        //Arrange
        Car bmw = new Car("BMW", "525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740", 123);

        MyList<Car> carMyList = new MyList<>();

        carMyList.add(bmw);//0
        carMyList.add(saab);//1
        carMyList.add(volvo);//2

        //Act
        Car resultNegativeNull = carMyList.getByIndex(-1);

        //Assert
        assertNull(resultNegativeNull);
    }

    @Test
    public void indexOf() {
        //Arrange
        Car bmw = new Car("BMW", "525i");
        Saab saab = new Saab("900S", 260);
        Volvo volvo = new Volvo("740", 123);

        MyList<Car> carMyList = new MyList<>();

        carMyList.add(bmw);//0
        carMyList.add(saab);//1
        carMyList.add(volvo);//2

        //Act
        int resultVolvo = carMyList.indexOf(volvo);
        int resultSaab = carMyList.indexOf(saab);
        int resultBmw = carMyList.indexOf(bmw);

        //Assert
        assertEquals(2, resultVolvo);
        assertEquals(1, resultSaab);
        assertEquals(0, resultBmw);
    }

    @Test
    public void toArray() {
    }

    @Test
    public void size() {
    }
}