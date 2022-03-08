package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter one day: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        WeekDays wD = null;
        try {
            wD = WeekDays.valueOf(day.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            System.out.println("Тилекке каршы ката жазып алдыныз!");
        }
        if ( wD != null){
        switch (wD){
            case MONDAY -> System.out.println("Technical programming болот");
            case TUESDAY -> System.out.println("English болот");
            case WHENSDAY -> System.out.println("Technical programming болот");
            case THUESDAY -> System.out.println("English болот");
            case FRIDAY -> System.out.println("Technical programming болот");
        }
        System.out.println(wD);
      }else {
            System.out.println("Бул куну сабак жок.");
        }
    }
        }



