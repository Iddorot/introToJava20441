
public class Point
{
    int _x;
    int _y;
    final int MIN_VALUE = 0;

    public Point(int x, int y){   
        _x = x;
        _y = y;

        if (checkIfNegative(x)){
            _x = MIN_VALUE;
        }
        if (checkIfNegative(y)){
            _y = MIN_VALUE;
        }
    }

    private boolean checkIfNegative(int number){
        int numberToCheck = number;
        if (numberToCheck<MIN_VALUE)
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
        return (_x);
    }

    public int getY(){
        return (_y);
    }

    public void setX(int xToSet){
        if (!checkIfNegative(xToSet)){
            _x = xToSet;
        }
    }

    public void setY(int yToSet){
        if (!checkIfNegative(yToSet)){
            _y = yToSet;
        }
    }

    public String toString(){
        return "("+ _x + "," +_y + ")";
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

    //just for my test to delete
    public static void main(String args[]) {
        int x = 3;
        int y = 2;
        Point testPoint =new Point(x, y);
        //TEST 1 getter and setters
        System.out.println("before test to setY -7 : " + testPoint.getY());
        testPoint.setY(-7);
        System.out.println("after test to setY -7: " + testPoint.getY());
        System.out.println("before test to setX 3: " + testPoint.getX());
        testPoint.setX(3);
        System.out.println("after test to setX 3: " + testPoint.getX());

        //TEST 2 to string Mathod
        System.out.println("TEST 2 to string Mathod");
        System.out.println("testPoint "+testPoint.toString()); //toString test
        int x2 = 5;
        int y2 = 1;
        Point testPoint2 =new Point(x2, y2);
        System.out.println("testPoint2 "+testPoint2.toString());

        //TEST 3 boolean mathods
        System.out.println("TEST 3 to boolean mathods");
        System.out.println("equals test: "+ testPoint.equals(testPoint2));
        System.out.println("isAbove test: "+ testPoint.isAbove(testPoint2)); 
        System.out.println("isUnder test: "+ testPoint.isUnder(testPoint2)); 
        System.out.println("isLeft test: "+ testPoint.isLeft(testPoint2)); 
        System.out.println("isRight test: "+ testPoint.isRight(testPoint2)); 

        
    }
}

