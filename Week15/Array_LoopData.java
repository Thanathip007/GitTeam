public class Array_LoopData {
    public static void main(String[] args) {
        String[] car = { "BMW", "FORD", "TESLA", "TOYOTA" };
        // วนลูปแสดงค่าข้อมูลในอาเรย์
        for (int i = 0; i < car.length; i++) {
            System.out.println(" สมาชิกตำแหน่งที่ " + i + " มีค่าเท่ากับ " + car[i]);

        }
        for (int i = 0; i < car.length; i++) {
            System.out.println(" สมาชิกตำแหน่งที่ " + (i+1) + " มีค่าเท่ากับ " + car[i]);

        }


    }

}
