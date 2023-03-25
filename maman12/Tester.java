
public class Tester
{

    //just for my test to delete
    public static void main(String args[]) {
        int x = 3;
        int y = 2;
        Point testPoint = new Point(x, y);
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
        Point testPoint2 = new Point(x2, y2);
        System.out.println("testPoint2 "+testPoint2.toString());
        
        System.out.println("The OLD testPoint is "+ testPoint);
        testPoint = new Point(testPoint2);
        System.out.println("The NEW testPoint is "+ testPoint);
        

        //TEST 3 boolean mathods
        System.out.println("TEST 3 to boolean mathods");
        System.out.println("equals test: "+ testPoint.equals(testPoint2));
        System.out.println("isAbove test: "+ testPoint.isAbove(testPoint2)); 
        System.out.println("isUnder test: "+ testPoint.isUnder(testPoint2)); 
        System.out.println("isLeft test: "+ testPoint.isLeft(testPoint2)); 
        System.out.println("isRight test: "+ testPoint.isRight(testPoint2)); 

        
    }
}

