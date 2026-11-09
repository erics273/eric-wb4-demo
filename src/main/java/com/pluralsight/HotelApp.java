package com.pluralsight;

import java.time.LocalDate;
import java.util.Date;

public class HotelApp {

    public static void main(String[] args) {

        //instantial an object, we make a real thing from the blueprint
        Guest guest1 = new Guest("Mohamed", "Bilal", "mbilal@gmail.com", "800-555-1234", "1234 Rainy street", LocalDate.parse("2002-10-15"));
        Guest guest2 = new Guest("Eric", "Schwartz", "erics273@gmail.com", "800-666-", "1654 Rainy street", LocalDate.parse("1999-10-15"));
        

    }

}
