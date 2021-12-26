public class Method_ex02 {
    //method แบบที่2 มีการรับค่าที่ส่งมาจาก main program   แต่ไม่มีการส่งค่าออก
    public static void main(String[] args) {
       display("ดีใจจัง เรียนใกล้จบแล้ว");
       plus(54,24);
       display("ไปตลาดให้หน่อยลูก");
  
        
    }
    static void plus (int num1, int num2) {
        int result = num1+num2;
        System.out.println("ผลลัพธ์การบวก เท่ากับ " + result);

    }
    static void display (String x) {
        System.out.println(x);

    }
    static void fullname (String Fname, int Lname) {
        System.out.println(Fname +" "+ Lname);

    }
    
    
}
