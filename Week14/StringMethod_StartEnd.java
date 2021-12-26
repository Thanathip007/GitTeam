public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "Mr.somchai krub";

        // หาตำแหน่งของคำ .statwith()
        boolean result = fullname.startsWith("Mr.");

        if (result) {
            System.out.println(fullname + " Mr.");
            
        } else {
            System.out.println(fullname + " mis.");
            
        }

        // หาค่าตำแหน่งของค่าจากด้านหลัง  .endWith()
        String code = "356278TH";

        code.endsWith("TH");

        boolean result1 = code.endsWith("TH");
        if (result) {
            System.out.println("fulllname" + " Mr.");
            
        } else {
            System.out.println(fullname + " mis.");
            
        }


        
    }
    
}
