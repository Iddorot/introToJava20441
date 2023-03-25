
public class Point
{
    int _x;
    int _y;
    final int MIN_VALUE = 0;

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

    private boolean checkIfNegative(int number){
        int numberToCheck = number;
        if (numberToCheck < MIN_VALUE)
        {
            return true;
        }
        return false;
    }

    public Point(Point other){
        _x = other._x;
        _y = other._y;
    }

    public int getX(){
        return _x;
    }

    public int getY(){
        return _y;
    }

    public void setX(int xToSet){
        if (xToSet > MIN_VALUE){
            _x = xToSet;
        }
    }

    public void setY(int yToSet){
        if (yToSet > MIN_VALUE){
            _y = yToSet;
        }
    }

    public String toString(){
        return "("+ _x + "," + _y + ")";
    }

    public boolean equals (Point other){
        if (_x == other._x && _y == other._y){
            return true;
        }
        return false;
    }

    public boolean isAbove(Point other){
        if(_y <= other._y){
            return false;
        }
        return true;
    }

    public boolean isUnder(Point other){
        if(isAbove(other)){
            return false;
        }
        return true;
    }

    public boolean isLeft(Point other){
        if(_x >= other._x){
            return false;
        }
        return true;
    }

    public boolean isRight(Point other){
        if(isLeft(other)){
            return false;
        }
        return true;
    }

    //todo public void move (int deltaX, int deltaY)
    //todo public Point middle(Point P)
    //todo public double distance (Point P)

}

