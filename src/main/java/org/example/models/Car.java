package org.example.models;

public class Car {

    private static int idCounter = 0;

    private int id;
    private String brand;
    private String modelName;

    public Car(String brand, String modelName) {
        id = ++idCounter;
        this.brand = brand;
        this.modelName = modelName;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getId() != car.getId()) return false;
        if (getBrand() != null ? !getBrand().equals(car.getBrand()) : car.getBrand() != null) return false;
        return getModelName() != null ? getModelName().equals(car.getModelName()) : car.getModelName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        result = 31 * result + (getModelName() != null ? getModelName().hashCode() : 0);
        return result;
    }
}
