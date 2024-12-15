package com.example.extra1;

// Класс Women
public class Women extends Human {
    public Women(int age) {
        super(age);
    }

    public void displayAge() {
        System.out.println("Возраст женщины: " + age);
    }
}
