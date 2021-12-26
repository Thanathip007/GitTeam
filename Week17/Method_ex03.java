public class Method_ex03 {
     // method แบบที่ 3  ไม่มีการรับค่าที่ส่งมาจาก main program  แต่ลูกส่งค่าออกคืนแม่
    public static void main(String[] args) {
       int phone = getPhoonNumber();
       System.out.println(getPhoonNumber());
       int lucky = 999;
       int newphone = phone+lucky;
       System.out.println(newphone);

     
    }
    static int getPhoonNumber(){
        return 985864564;

    }
    
}
