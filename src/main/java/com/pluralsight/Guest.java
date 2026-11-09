package com.pluralsight;

import java.time.LocalDate;

public class Guest {

    //all the things that describe a guest
    private int guestId;
    private String firstName;
    private String lastName;
    private  String email;
    private String phoneNumber;
    private String address;
    private int rewardsNumber;
    private LocalDate dateOfBirth;
    private boolean isDifficult;


    //a constructor with things that are useful when we need to create a guest for the first time
    public Guest(String firstName, String lastName, String email, String phoneNumber, String address, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    /*
    Getters and setters for the data members
     */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRewardsNumber() {
        return rewardsNumber;
    }

    public void setRewardsNumber(int rewardsNumber) {
        this.rewardsNumber = rewardsNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isDifficult() {
        return isDifficult;
    }

    public void setDifficult(boolean difficult) {
        isDifficult = difficult;
    }

    public int getGuestId() {
        return guestId;
    }

    /*
    Derived Getters (calculated methods)
     */
    public String getGuestFullName() {
        //return firstName + " " + lastName;

        //use the getters if we want to
        return getFirstName() + " " + this.getLastName();
    }

}
