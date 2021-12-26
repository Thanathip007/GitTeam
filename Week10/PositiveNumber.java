package Week10;

import javax.naming.spi.DirStateFactory.Result;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าเป็นจำนวนเต็มบวกหรือไม่
        int number = 0;
        String result = "";
        // การเขียนแบบ IF-Else

        if (number > 0) { // กรณีของตรวจสอบจำนวนเต็มลบ
            result = number + "เป็นจำวนวนเต็มบวก";
        } else if (number < 0) { // กรณีของตวจสอบจำนวนเต็ม
            result = number + "เป็นจำวนวนเต็มลบ";
        } else { // กรณีของตวจสอบจำนวนเต็ม
            result = number + "เป็นจำวนวนเต็มศูนย์";
        }
        System.out.println(result);

        // --- การเขียนแบบ ธรรมดา
        // if (number > 0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        //
        // }
        // // กรณีของการตรวจสอบจำนวนเต็มลบ
        // if (number < 0) {
        // System.out.println("เป็นจำนวนเต็มลบ");
        //
        // }
        // กรณีของการตรวจสอบจำนวนเต็มศูนย์
        // if (number == 0) {
        // System.out.println("เป็นจำนวนเต็มศูนย์");
        //
        // }
    }

}
