/**
 * This class represents a Date object
. 
 * @author Ido Rot
 * @version 1.0
 */
public class Date
{
    private int _day;
    private int _month;
    private int _year;

    private final int MIN_DAY = 1;
    private final int SHORT_MONTH_DAYS = 30;
    private final int FEB_DAYS = 28;
    private final int MAX_DAY = 31;
    private final int MIN_YEAR = 1000;
    private final int MAX_YEAR = 9999;
    private final int DEF_YEAR = 2000;
    private final int JAN = 1;
    private final int FEB = 2;
    private final int MAR = 3;
    private final int APR = 4;
    private final int MAY = 5;
    private final int JUN = 6;
    private final int JUL = 7;
    private final int AUG = 8;
    private final int SEP = 9;
    private final int OCT = 10;
    private final int NOV = 11;
    private final int DEC = 12;

    /**
     * If the given date is valid - creates a new Date object, otherwise creates the date 1/1/2000 .
     * @param day  the day in the month (1-31)
     * @param month the month in the year (1-12)
     * @param year the year (4 digits)
     */
    public Date(int day, int month, int year){
        if (checkIfDateCorrect(day, month, year)){
            _day = day;
            _month = month;
            _year = year;
        } else {
            _day = MIN_DAY;
            _month = JAN;
            _year = DEF_YEAR;
        }
    }

    /**
     * Copy constructs of a Date.
     * @param other  the date to be copied
     */
    public Date(Date other){
        _day = other._day;
        _month = other._month;
        _year = other._year;
    }

    //check if date is correct
    private boolean checkIfDateCorrect (int day, int month, int year){
        if ((MIN_DAY > day || MAX_DAY < day ) || 
        (JAN > month || DEC < month) || 
        (MIN_YEAR > year || MAX_YEAR < year) ){
            return false;
        }
        switch (month){
            case FEB:
                if (day > FEB_DAYS){
                    return false;
                }
                return true;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                if (day > SHORT_MONTH_DAYS){
                    return false;
                }
                return true;
        }
        return true;
    }

    // computes the day number since the beginning of the Christian counting of years  
    private int calculateDate ( int day, int month, int year) 
    { 
        if (month < 3) { 
            year--; 
            month = month + 12; 
        }  
        return 365 * year + year/4 - year/100 + year/400 + ((month+1) * 306)/10 + (day - 62);  
    }      

    /**
     *Returns a String that represents this date.
     *@return String that represents this date in the following format: day (2 digits) / month(2 digits) / year (4 digits) for example: 02/03/1998
     */
    public String toString(){
        if (10 > _day && 10 > _month){
            return "0" + _day + "/" + "0" + _month + "/" + _year;

        }
        if(10 > _day){
            return "0" +_day + "/" + _month + "/" + _year;
        }
        if(10 > _month){
            return _day + "/" + "0" + _month + "/" + _year;
        }
        return _day + "/" + _month + "/" + _year;
    }

    /**
     * Gets the day.
     * @return The day 
     */
    public int getDay(){
        return _day;
    }

    /**
     * Gets the month.
     * @return The month
     */
    public int getMonth(){
        return _month;
    }

    /**
     * Gets the day.
     * @return The year
     */
    public int getYear(){
        return _year;
    }

    /**
     * Set the day (only if date remains valid)
     * @param dayToSet   the day value to be set
     */
    public void setDay(int dayToSet){
        if (checkIfDateCorrect(dayToSet, _month, _year)){
            _day = dayToSet;
        }
    }

    /**
     * Set the month (only if date remains valid)
     * @param monthToSet   the month value to be set
     */
    public void setMonth(int monthToSet){
        if (checkIfDateCorrect(_day, monthToSet, _year)){
            _month = monthToSet;
        }
    }

    /**
     * Set the year (only if date remains valid)
     * @param yearToSet   the year value to be set
     */
    public void setYear(int yearToSet){
        if (checkIfDateCorrect(_day, _month, yearToSet)){
            _year = yearToSet;
        }
    }

    /**
     * Check if two dates are the same.
     * @param other   the date to compare this date to
     * @return true if the dates are the same
     */
    public boolean equals (Date other){
        if (_day == other._day && _month == other._month && _year == other._year){
            return true;
        }
        return false;
    }

    /**
     * Check if this date is before other date
     * @param other   the date to compare this date to
     * @return true if this date is before other date
     */
    public boolean before (Date other){
        return 
        (_year < other._year) ||
        (_year == other._year && _month < other._month) ||
        (_year == other._year && _month == other._month && _day < other._day);
    }

    /**
     * Check if this date is after other date
     * @param other   the date to compare this date to
     * @return true if this date is after other date
     */
    public boolean after (Date other){
        if(before(other)){
            return false;
        }
        return true;
    }

    /**
     * Calculates the difference in days between this date and other date
     * @param other    the date to calculate the difference between
     * @return the number of days between the dates (non negative value)
     */    
    public int difference(Date other){
        int thisDaysCount = calculateDate (_day, _month, _year);
        int otherDaysCount = calculateDate (other._day, other._month, other._year);

        int theDifference = Math.abs(thisDaysCount-otherDaysCount);
        return theDifference;
    }

    /**
     * Calculate the date of tomorrow
     * @return the date of tomorrow
     */    
    public Date tomorrow(){
        int nextDay = _day+1;
        if (!checkIfDateCorrect(nextDay, _month, _year)){
            
            int nextMonth = _month + 1;
            if(!checkIfDateCorrect(MIN_DAY, nextMonth, _year)){
                
                int nextYear = _year +1;
                Date tomorrowDate = new Date(MIN_DAY, JAN, nextYear);
                return tomorrowDate;
            }
            
            Date tomorrowDate = new Date(MIN_DAY, nextMonth, _year);
            return tomorrowDate;
        }
        
        Date tomorrowDate = new Date(nextDay, _month, _year);
        return tomorrowDate;
    }
}

