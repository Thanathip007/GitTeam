package Week10;
import java.util.Scanner;
public class IfElse_Age {
    public static void main(String[] args) {
        java.util.Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนอายุของท่าน : ");
        int age = kb.nextInt();

        if (age <= 15) {
            System.out.println("วัยรุ่น");
        }
         else if (age <= 20) {
            System.out.println("วัยหนุ่มสาว");
         }
         else if (age <= 30) {
            System.out.println("วัยทำงาน");
         }
         else if (age <= 40) {
            System.out.println("วัยกลางคน");
         }
         else if (age >= 60) {
            System.out.println("วัยชรา");
         }else{

         }

        System.out.println("End of Program");
    }
    }