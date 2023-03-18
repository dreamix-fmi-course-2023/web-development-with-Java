package com.fmi.week03;

public class Car {
    private String make;

    private String model;

    private int year;

    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Car))
            return false;

        Car car = (Car) o;

        if (getYear() != car.getYear())
            return false;
        if (Double.compare(car.getPrice(), getPrice()) != 0)
            return false;
        if (getMake() != null ? !getMake().equals(car.getMake()) : car.getMake() != null)
            return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getMake() != null ? getMake().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + getYear();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
