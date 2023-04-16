public class DateTester {

    public static void main(String[] args) {

        // Test 1: Create a date with valid and invalid input
        System.out.println("Test 1: Create Date with valid and invalid coordinates");
        Date date1 = new Date(31, 1, 9999);
        System.out.println("date1 all valid= " + date1);
        Date date2 = new Date(32, 1, 2100);
        System.out.println("date2 31 month not valid = " + date2);
        Date date3 = new Date(31, 4 , 2100);
        System.out.println("date3 30 month not valid = " + date3);
        Date date4 = new Date(29, 2 , 10000);
        System.out.println("date4 28 month not valid = " + date4);

        // Test 2: Get and set day, month and year
        System.out.println("\nTest 2: Get and set day, month and year");
        System.out.println("date1's year before: " + date1.getYear());
        System.out.println("Set date1' year to 2341: " + date1.getYear());date1.setYear(2341);
        System.out.println("date1's year after: " + date1.getYear());
        
        // Test 3: Check if two dates are equal, before or after
        System.out.println("\nTest 3: Check if two dates are equal");
        System.out.println("date3: " + date3);
        System.out.println("date2: " + date2);
        System.out.println("date3.equals(date2): " + date3.equals(date2));
        
        // Test 4: Check the diffrence between two dates
        System.out.println("\nTest 4: Check the diffrence between two dates");
        System.out.println("date3 - date2: "+ date3.difference(date2));
        System.out.println("date2 - date1: "+ date2.difference(date1));
        
        // Test 5: Check tomorrow method
        System.out.println("\nTest 5: Check tomorrow method");
        System.out.println(date1);
        System.out.println("tomorrow of date1: " + date1.tomorrow());
        
        
    }
}
