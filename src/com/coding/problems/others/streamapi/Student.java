package com.coding.problems.others.streamapi;

class Student {
    private final String name;
    private final int rollNumber;
    private final Integer marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }
}
