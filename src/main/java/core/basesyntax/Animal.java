package core.basesyntax;

import java.util.Objects;

public class Animal {
    private String type;
    private int age;
    private long id;
    private boolean isFool;

    public Animal(String type, int age, long id) {
        this.type = type;
        this.age = age;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isFool() {
        return isFool;
    }

    public void setFool(boolean fool) {
        isFool = fool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, age, id);
    }
}
