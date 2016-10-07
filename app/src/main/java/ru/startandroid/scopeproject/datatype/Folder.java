package ru.startandroid.scopeproject.datatype;

import java.io.Serializable;

public class Folder implements Serializable {

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
