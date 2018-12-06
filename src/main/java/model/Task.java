package model;

import java.util.Date;

public class Task {
    private int idl;
    private String name;
    private Department department;
    private Date creationDate, startDate, finishDate;

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public int getIdl() {
        return idl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
