package edu.ti.caih313.collections.dataobj;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private Name name;
    private Gender gender;

    private EmailAddress emailAddress;

    private LocalDate birthDate;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getAge() {
        Period ageNow = Period.between(birthDate, LocalDate.now());
        return ageNow.getYears();
    }

    // TODO -- implement toString with String.format 10 points
    @Override
    public String toString() {
       String person= "Person{" +"\n"+
                "name=" + name + "\n"+
                "gender=" + gender + "\n"+
                "age=" + getAge() +"\n"+
                ", birthDate=" + birthDate+ "\n"+
                "email=" + emailAddress.toString() + "\n"+
                '}';
        String str2 = String.format("%s", person);
        return str2;
    }
}
