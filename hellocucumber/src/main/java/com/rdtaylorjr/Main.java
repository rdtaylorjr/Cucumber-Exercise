package com.rdtaylorjr;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        IsItFriday isItFriday = new IsItFriday();
        System.out.println(isItFriday.isItFriday(String.valueOf(LocalDate.now().getDayOfWeek())));
    }

}
