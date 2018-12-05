package model;

public class User {
    private int id;
    private String name;
    private Department department;

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

    public User(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

}
