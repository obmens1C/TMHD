package model;

import exception.PolicyPasswordException;

public class User {
    private int id;
    private String name, surname;
    private Department department = null;
    private char[] password;

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public User(int id, String name, String surname, char[] password) throws PolicyPasswordException {
        if(!matchesPolicyPassword(password)) {
            throw new PolicyPasswordException();
        }

        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setPassword(password);
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    private void setPassword(char[] password) {
        this.password = password;
    }

    private boolean matchesPolicyPassword(char[] password) {
        if(password.length < 8) return false;
        String validationString = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        for(char symbol : password) {
            if(validationString.indexOf(symbol) == -1) return false;
        }
        return true;
    }
}

