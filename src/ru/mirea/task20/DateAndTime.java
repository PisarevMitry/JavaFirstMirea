package ru.mirea.task20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    Calendar calendar;

    public DateAndTime(int year, int month, int day, int hour, int minute) {
        calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
    }

    public DateAndTime(Calendar calendar) {
        this.calendar = calendar;
    }

    public DateAndTime(String data) {
        setCalendarString(data);
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getCalendarString() {
        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy HH:mm");
        return dateFormat.format(calendar.getTime());
    }

    public void setCalendarString(String date) {
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat("d MMMM yyyy HH:mm");
            calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(date));
            return;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G HH:mm");
            calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(date));
            return;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //можно расширить до всех возможных вариаций ввода даты
    }
}
