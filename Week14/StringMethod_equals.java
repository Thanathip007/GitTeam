public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Team";
        String lastname2 = "team";

        // เปรียบเทียบ เท่ากัน .equals()

        boolean result = lastname1.equals(lastname2);
        //System.out.println(result);

        // เปรียบเทียบ เท่ากันไม่สนใจตัวอักษรตัวเล็กตัวใหญ่ .equals()
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);

        if (result2) {
            System.out.println(lastname1 + " เท่ากับ " +lastname2);
            
        } else {
            System.out.println(lastname1 + " ไม่เท่ากับ " +lastname2);
            
        }
        
    }
    
}
