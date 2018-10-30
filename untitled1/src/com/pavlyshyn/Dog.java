package com.pavlyshyn;

public class Dog{
    String Name, Say;

    public Dog(String name, String say) {
        Name = name;
        Say = say;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "Пес'" + Name + '\'' +
                ", Каже='" + Say + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Шарфік", "Гав!");
        System.out.println(dog);
    }
}