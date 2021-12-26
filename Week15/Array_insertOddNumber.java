public class Array_insertOddNumber {
    public static void main(String[] args) {
        int[] D = new int[10];
        // System.out.println(D.length);
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " "); // แสดงผลอาเรย์ก่อนเพิ่มข้อมูล
        }

        // เริ่มเพิ่มข้อมูลเข้าไปในอาเรย์ทั้ง 10 ช่อง
        int number = 1;
        for (int i = 0; i < D.length; i++) {
            D[i] = number;
            number = number+2;

        }
        System.out.println();
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " "); // แสดงผลอาเรย์หลังเพิ่มข้อมูล
        }

    }

}
