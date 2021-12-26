package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {

        int i = 1; // ค่าเริ่มต้น

        while (true) {
            i++;

            System.out.print("รอบที่"+ i+  " java ");// เงื่อนไข
            // i++;//updateรอบ //หรือi+=2;
            if (i == 1000) {
                break;

            }
        }
    }
}
