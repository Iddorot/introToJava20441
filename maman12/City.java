/**
 * Represents a city. City is represented by its name, the date it was established, center, central station,
 * number of residents(non negative) and number of neighborhoods(positive).
 * @author Ido Rot
 * @version 1.0
 */
public class City
{   
    //instance variables
    private String _cityName;
    private Date _dateEstablished;
    private Point _cityCenter;
    private Point _centralStation;
    private long _numOfResidents;
    private int _noOfNeighborhoods;

    private final long MIN_NUM_OF_RESIDETNS = 0;
    private final int MIN_NUM_OF_NEIGHBORHOOS = 1;

    /**
     * Constructor of a city. Constructs a new city with name, specified establishment date, 
     * x y coordinates of city center, x y coordinates of central station, number of residents (non negative, if negative will be set to 0), number of neighborhoods (positive, if less than 1 will be set to 1.).
     * @param cityName The city's name
     * @param dayEstablished The day the city was established
     * @param monthEstablished The month the city was established
     * @param yearEstablished The year the city was established
     * @param centerX The x coordinate of the city's center
     * @param centerY The y coordinate of the city's center
     * @param stationX The x coordinate of the city's central station
     * @param stationY The y coordinate of the city's central station
     * @param numOfResidents number of residents
     * @param noOfNeighborhoods number of neighborhoods
     */    
    public City(String cityName, int dayEstablished, int monthEstablished, int yearEstablished
    , int centerX, int centerY, int stationX, int stationY, long numOfResidents, int noOfNeighborhoods){
        _cityName = new String(cityName);
        _dateEstablished = new Date(dayEstablished, monthEstablished, yearEstablished);
        _cityCenter = new Point(centerX, centerY);
        _centralStation = new Point(stationX, stationY);
        _noOfNeighborhoods = noOfNeighborhoods;
        _numOfResidents = numOfResidents;

        if(numOfResidents < MIN_NUM_OF_RESIDETNS){
            _numOfResidents = MIN_NUM_OF_RESIDETNS; 
        }
        _noOfNeighborhoods = noOfNeighborhoods;
        if (noOfNeighborhoods < MIN_NUM_OF_NEIGHBORHOOS){
            _noOfNeighborhoods = MIN_NUM_OF_NEIGHBORHOOS;
        }
    }

    /**
     * Copy constructor for cities. Construct a city with the same attributes as another city.
     * @param other The City object from which to construct the new city.
     */
    public City(City other){
        _cityName = other._cityName;
        _dateEstablished = other._dateEstablished;
        _cityCenter = other._cityCenter;
        _centralStation = other._centralStation;
        _numOfResidents = other._numOfResidents;
        _noOfNeighborhoods = other._noOfNeighborhoods;
    }

    /**
     * Return a string representation of this city.
     * @return String representation of this city
     */
    public String toString(){
        return "City name: " + _cityName +
        "\nDate established:" + _dateEstablished + 
        "\nCity center: " + _cityCenter +       
        "\nCentral station: " + _centralStation + 
        "\nNumber of residents: " + _numOfResidents+
        "\nNumber of neighborhoods: "+ _noOfNeighborhoods; 
    }

    /**
     * Return the city's name.
     * @return The city's name
     */
    public String getCityName(){
        return _cityName;
    }

    /**
     * Return a Date object that represents the city's established Date.
     * @return The city's established Date
     */
    public Date getDateEstablished (){
        return _dateEstablished;
    }

    /**
     * Return a Point object representing the city's center.
     * @return The city's center
     */
    public Point getCityCenter(){
        return _cityCenter;
    }

    /**
     * Return Returns a Point object representing the city's central station.
     * @return The city's central station
     */
    public Point getCentralStation(){
        return _centralStation;
    }

    /**
     * Returns the number of residents in this city.
     * @return the number of residents
     */
    public long getNumOfResidents(){
        return _numOfResidents;
    }

    /**
     * Returns the number of neighborhoods in this city.
     * @return The number of neighborhoods
     */
    public int getNumOfNeighborhoods(){
        return _noOfNeighborhoods;
    }

    /**
     * Changes the city's name.
     * @param cityName The city's new name
     */
    public void setCityName(String cityName){
        _cityName = cityName;
    }

    /**
     * Changes the city's established date.
     * @param dateEst The city's new establishedDate
     */
    public void setDateEstablished (Date dateEst){
        _dateEstablished = new Date(dateEst);
    }

    /**
     * Changes the city's center location.
     * @param cityCenter The city's new central point
     */
    public void setCityCenter(Point cityCenter){
        _cityCenter = new Point(cityCenter);
    }

    /**
     * Changes Changes the city's central station location.
     * @param centralStation The city's new central station location
     */
    public void setCentralStation(Point centralStation){
        _centralStation = new Point(centralStation);
    }

    /**
     * Changes the city's number of residents. If a negative number is received, number of residents should not be changed.
     * @param numOfResidents The city's new number of residents
     */
    public void setNumOfResidents(long numOfResidents){
        _numOfResidents = numOfResidents;
        if(numOfResidents < MIN_NUM_OF_RESIDETNS){
            _numOfResidents = MIN_NUM_OF_RESIDETNS; 
        }
    }

    /**
     * Changes the city's number of neighborhoods. If a non positive number is received, number of neighborhoods should not be changed.
     * @param noOfNeighborhoods The city's new number of neighborhoods
     */
    public void setNumOfNeighborhoods(int numOfNeighborhoods){
        _noOfNeighborhoods = numOfNeighborhoods;

        if (numOfNeighborhoods < MIN_NUM_OF_NEIGHBORHOOS){
            _noOfNeighborhoods = MIN_NUM_OF_NEIGHBORHOOS;
        }
    }

    /**
     * Check if two cities are the same (checking all six instace variables)
     * @param other the city to compare to this city
     * @return true if the cities are the same
     */
    public boolean equals(City other){
        if(_cityName.equals(other._cityName) && _dateEstablished.equals(other._dateEstablished)&&
        _cityCenter.equals(other._cityCenter) && _centralStation.equals(other._centralStation) &&
        _numOfResidents == other._numOfResidents && _noOfNeighborhoods == other._noOfNeighborhoods){
            return true;
        }
        return false; 
    }

    /**
     * Add or subtract residents to this city. If number of residents becomes negative, set to zero and return false, otherwise set to new number and return true.
     * @param residentsUpdate The change in the number of residents
     * @return true if new number of residents is calculated as non negative
     */
    public boolean addResidents(long residentsUpdate){
        long newNumOfResidetns = _numOfResidents + residentsUpdate;

        if (MIN_NUM_OF_RESIDETNS <= newNumOfResidetns){
            _numOfResidents = newNumOfResidetns;
            return true;
        }

        _numOfResidents = MIN_NUM_OF_RESIDETNS;
        return false;

    }

    /**
     * Move the central station location. If the new coordinates are not in the first quadrant, the location will not be changed.
     * @param deltaX The change in the station's x location
     * @param deltaY The change in the station's y location
     */
    public void moveCentralStation(int deltaX, int deltaY){
        _centralStation.move(deltaX, deltaY);
    }

    /**
     * Calculate the distance between the city center and the central station.
     * @return double representing the distance between the city center and the central station
     */
    public double distanceBetweenCenterAndStation(){
        double distanceBetween = _centralStation.distance(_cityCenter);
        return distanceBetween;
    }

    /**
     * Returns a new city with a new name, established date which is a day after this city and a City center location dX and dY away from this city, with 0 residents and 1 neighborhood. If the new location of the city center or of the central station is not in the first quadrant, the locations will be the same as this city's locations.
     * @param newCityName the new city's name
     * @param dX the x difference from this city's location
     * @param dY the y difference from this city's location
     * @return a new city
     */
    public City newCity(String newCityName, int dX, int dY){
        City newCity = new City(this);

        newCity.setCityName(newCityName);
        newCity.setDateEstablished(_dateEstablished.tomorrow());
        newCity._numOfResidents = MIN_NUM_OF_RESIDETNS; 
        newCity._noOfNeighborhoods = MIN_NUM_OF_NEIGHBORHOOS;

        Point newCityCenter = new Point(_cityCenter);
        newCityCenter.move(dX, dY);
        newCity.setCityCenter(newCityCenter);

        Point newCentralStation = new Point(_centralStation);
        newCentralStation.move(dX, dY);
        newCity.setCentralStation(newCentralStation);

        return newCity;
    }

    /**
     * Check if the city establish date is between two given dates (including these dates). the given dates are not necessarily in order.
     * @param date1  the first given date
     * @param date2  the second given date
     * @return true if the city establish date is between the two given dates
     */
    public boolean cityEstablishedBetweenDates(Date date1, Date date2){
        if (_dateEstablished.equals(date1) || _dateEstablished.equals(date2)){
            return true;
        }
        else if((_dateEstablished.after(date1) && _dateEstablished.before(date2)) || (_dateEstablished.after(date2) && _dateEstablished.before(date1))) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method calculates the difference in days between the establishment date of this city and the city given as a parameter
     * @param other the city given as a parameter to find the difference
     * @return the number of days differ between this city establishment date to the other city establishment date
     */
    public int establishmentDateDiff(City other){
        return _dateEstablished.difference(other._dateEstablished);
    }
}

