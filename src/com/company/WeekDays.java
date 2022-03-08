package com.company;

public enum WeekDays {
    MONDAY("Дуйшомбу "),
    TUESDAY("Шейшемби "),
    WHENSDAY("Шаршемби "),
    THUESDAY("Бейшемби "),
    FRIDAY("Жума ");

    private String DayName;


    WeekDays() {
    }

    WeekDays(String DayName){
    }

    public String getDayName(){
        return DayName;
    }

    void setDayName(){
        this.DayName = DayName;
    }

}
