package edu.ti.caih313.collections.dataobj;

import java.util.Objects;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Both first and last name must be specified.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return firstName.equals(name.firstName) &&
                lastName.equals(name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    //TODO -- implement toString using StringBuilder 2 points
    StringBuilder name = new StringBuilder("");
    @Override
    public String toString() {
        if(firstName!=null&&lastName!=null){
        name.append("First name: ").append(firstName);
        name.append("Last name: ").append(lastName);
    }else if(firstName==null){
            name.append("Last name: ").append(lastName);
        }
        else if(lastName==null){
            name.append("First name: ").append(firstName);
        }
        return name.toString();
    }
}
