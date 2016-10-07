package ru.startandroid.scopeproject.datatype;

public class Letter {

    private String subject;

    public Letter(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return subject;
    }
}
