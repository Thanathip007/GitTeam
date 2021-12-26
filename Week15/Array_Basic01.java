import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ array
        // แบบที่ 1 : ประกาศแบบกำหนดสมาชิก
        int[] number = { 1, 2, 3, 44, 34, 69, 56, 50 };
        int size = number.length;
        System.out.println(size);
        System.out.println(number.length); // หาความยาวของอาเรย์
        System.out.println(number[6]); // การเข้าถึงตำแหน่งของตัวแปร
        // การเปลี่ยนค่าข้อมูลในตัวแปร
        number[3] = 99;
        System.out.println(number[3]);

        // แบบที่ 2 : ประกาศแบบกำหนดขนาด
        // ประกาศอาเรย์
        //char[] alphabet; // ประกาศอาเรย์
        //alphabet = new char[26]; // สร้างอาเรย์

        char[] alphabet = new char[26]; //ประกาษและสร้างอาเรย์
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);

        int []num = new int [10];
        System.out.println(num[9]);

    }

}
