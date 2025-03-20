package org.example;

import java.util.Objects;

public class Person {
    String name = "";
    int age = 0;

    public static void main(String[] args) {
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String newName) {
        if (Objects.equals(newName, "") || newName == null) {
            throw new Error("New name is invalid.");
        }
        this.name = newName;
    }
}
