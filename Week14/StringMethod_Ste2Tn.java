public class StringMethod_Ste2Tn {
    public static void main(String[] args) {
        String s1 = "500";
        String s2 = "300";
        int num1 = 100;

        System.out.println(s1+num1);
        //  Integer.parseInt() แปรงสตริงเป็นตัวเลขจำนวนเต็ม


        int num2 = Integer.parseInt(s1);
        double num3 = Double.parseDouble(s2);
        System.out.println(num2+num1);
        
    }
    
}
