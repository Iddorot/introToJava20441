/**
 * This class represents 2 dimensional point. Coordinates cannot be negative. 
 * @author Ido Rot
 * @version 1.0
 */
public class Point
{
    private int _x;
    private int _y;
    private final int MIN_VALUE = 0;

    /**
     * Constructs a point. Construct a new point with the specified x y coordinates. If either coordinate is negative the coordinate will be 0.
     * @param x The x coordinate
     * @param y The y coordinate
     */
    public Point(int x, int y){   
        _x = x;
        _y = y;

        if (x < MIN_VALUE){
            _x = MIN_VALUE;
        }
        if (y < MIN_VALUE){
            _y = MIN_VALUE;
        }
    }

    /**
     * Copy constructs of a Point.
     * @param other The point object from which to construct the new point
     */
    public Point(Point other){
        _x = other._x;
        _y = other._y;
    }

    /**
     * Returns the x coordinate of the point.
     * @return The x coordinate of the point
     */
    public int getX(){
        return _x;
    }

    /**
     * Returns the y coordinate of the point.
     * @return The y coordinate of the point
     */
    public int getY(){
        return _y;
    }

    /**
     * Changes the x coordinate of the point. If a negative number is received, the x coordinate will not be changed.
     * @param xToSet The new x coordinate
     */
    public void setX(int xToSet){
        if (xToSet > MIN_VALUE){
            _x = xToSet;
        }
    }

    /**
     * Changes the y coordinate of the point. If a negative number is received, the y coordinate will not be changed.
     * @param yToSet The new y coordinate
     */
    public void setY(int yToSet){
        if (yToSet > MIN_VALUE){
            _y = yToSet;
        }
    }

    /**
     * Return a string representation of this point.
     * @return String representation of this point.
     */
    public String toString(){
        return "("+ _x + "," + _y + ")";
    }

    /**
     * Check if the received point is equal to this point.
     * @param other - The point to be compared with this point
     * @return True if the received point is equal to this point
     */
    public boolean equals (Point other){
        if (_x == other._x && _y == other._y){
            return true;
        }
        return false;
    }
    
    /**
     * Check if this point is above a received point.
     * @param other -  The point to check if this point is above
     * @return True if the received point is above to this point
     */
    public boolean isAbove(Point other){
        if(_y <= other._y){
            return false;
        }
        return true;
    }
    
    /**
     * Check if this point is below a received point.
     * @param other -  The point to check if this point is below
     * @return True if the received point is below to this point
     */
    public boolean isUnder(Point other){
        if(isAbove(other)){
            return false;
        }
        return true;
    }

    /**
     * Check if this point is left of a received point.
     * @param other -  The point to check if this point is left of
     * @return True if the received point is left of other point
     */
    public boolean isLeft(Point other){
        if(_x >= other._x){
            return false;
        }
        return true;
    }
    
    /**
     * Check if this point is left of a received point.
     * @param other -  The point to check if this point is right of
     * @return True if the received point is right of other point
     */
    public boolean isRight(Point other){
        if(isLeft(other)){
            return false;
        }
        return true;
    }
    
    /**
     * Move the x coordinate deltaX and the y coordinate deltaY. If the new coordinates are not in the first quadrant the point should not be moved.
     * @param deltaX -  The amount to move x
     * @param deltaY -  The amount to move y
     */
    public void move (int deltaX, int deltaY){
        int newX = _x + deltaX;
        int newY = _y + deltaY;

        if(newX >= MIN_VALUE && newY >= MIN_VALUE){
            _x = newX;
            _y = newY;
        }

    }
    
    /**
     * Return a new point in between this point and the received point.
     * @param p - the received point
     * @return new Point in between this point and the received point
     */
    public Point middle(Point p){
        int middleX = (_x + p._x) / 2;
        int middley = (_y + p._y) / 2;
        Point middlePoint = new Point(middleX, middley);

        return middlePoint;
    }
    
    /**
     * Check the distance between this point and a received point.
     * @param p - the received point
     * @return double representing the distance
     */
    public double distance (Point p){
        double powerX = Math.pow((_x - p._x), 2);
        double powerY = Math.pow((_y - p._y), 2);

        double d = Math.sqrt(powerX + powerY);
        return d;
    }

}

