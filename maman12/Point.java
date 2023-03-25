
public class Point
{
    private int _x;
    private int _y;
    private final int MIN_VALUE = 0;

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

    public void move (int deltaX, int deltaY){
        int newX = _x + deltaX;
        int newY = _y + deltaY;
        
        if(newX >= MIN_VALUE && newY >= MIN_VALUE){
            _x = newX;
            _y = newY;
        }
        
    }
    
    public Point middle(Point p){
        int middleX = (_x + p._x) / 2;
        int middley = (_y + p._y) / 2;
        Point middlePoint = new Point(middleX, middley);
        
        return middlePoint;
    }
    
    public double distance (Point p){
        double powerX = Math.pow((_x - p._x), 2);
        double powerY = Math.pow((_y - p._y), 2);
        
        double d = Math.sqrt(powerX + powerY);
        return d;
    }

}

