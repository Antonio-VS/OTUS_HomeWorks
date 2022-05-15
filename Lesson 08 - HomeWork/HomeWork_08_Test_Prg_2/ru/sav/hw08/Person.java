package ru.sav.hw08;

class Person {
    String name;
    TestLog testLog;

    Person(String name) {
        this.name = name;
        this.testLog = new TestLog();
    }
}
