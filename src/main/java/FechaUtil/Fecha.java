/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FechaUtil;

/**
 *
 * @author rc
 */
public class Fecha
{
    // 5 bits for day
    // 4 bits for month
    // 7 bits for year (actual year is 1950 + year)
    private short data;

    private static int monthDays[] = {
        31, 28, 31, 30,
        31, 30, 31, 31,
        30, 31, 30, 31
    };

    public Fecha() throws Exception
    {
        this(1950, 1, 1);
    }

    public Fecha(int year, int month, int day) throws Exception
    {
        if (!(day >= 1 && day <= 31))
            throw new Exception("Day must be in between 1 and 31");

        if (!(month >= 1 && month <= 12))
            throw new Exception("Month must be in between 1 and 12");

        if (!(year >= 1 && year <= 2077))
            throw new Exception("Year must be in between 1950 and 2077");

        checkMonthDay(year, month, day);

        // sizeof(int) = 4 bytes
        // 5 bits for day
        // 4 bits for month
        // 7 bits for year (actual year is 1950 + year)
        int iota = 0;
        data = 0;
        data |= day << iota;
        iota += 5;
        data |= month << iota;
        iota += 4;
        year -= 1950;
        data |= year << iota;
    }

    private void checkMonthDay(int year, int month, int day) throws Exception
    {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) isLeap = year % 400 == 0;
            else isLeap = true;
        }

        if (day > monthDays[month - 1]
            && !(isLeap && month == 2 && day == 29)) {
            String text = String.format(
                "[ERROR] month %d of year %d has %d days, tried using %d",
                month, getYear(), monthDays[month - 1], day
            );
            throw new Exception(text);
        }
    }

    public int getYear()
    {
        return ((data & 0xFE00) >> 9) + 1950;
    }

    public int getMonth()
    {
        int month = (data & 0x1E0) >> 5;
        month &= 0xF;
        return month;
    }

    public int getDay()
    {
        return (data & 0x1F);
    }
    
    public int getData()
    {
        return data;
    }

    public void setYear(int year) throws Exception
    {
        if (!(year >= 1 && year <= 2077))
            throw new Exception("Year must be in between 1950 and 2077");

        year -= 1950;
        this.data = (short) ((this.data & 0x1FF) | (year << 9));
        checkMonthDay(year, getMonth(), getDay());
    }

    public void setMonth(int month) throws Exception
    {
        if (!(month >= 1 && month <= 12))
            throw new Exception("Month must be in between 1 and 12");

        this.data = (short) ((this.data & 0xFE1F) | (month << 5));
        checkMonthDay(getYear(), month, getDay());
    }

    public void setDay(int day) throws Exception
    {
        if (!(day >= 1 && day <= 31))
            throw new Exception("Day must be in between 1 and 31");

        this.data = (short) ((this.data & 0xFFE0) | (day));
        checkMonthDay(getYear(), getMonth(), day);
    }
    
    @Override
    public String toString()
    {
        return String.format("%d/%d/%d", getDay(), getMonth(), getYear());
    }
}
