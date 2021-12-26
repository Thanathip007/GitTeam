public class Method_ex01 {
    public static void main(String[] args) {
        // method แบบที่1 ไม่มีการส่งค่าจาก method main และไม่มีการคืนค่ากลับจาก method ลูก
        openFile();
        playFile();
        pauseFile();
        playFile();
        closeFile();

    }

    public static void openFile() {
        System.out.println("open file.....");

    }
    static void playFile() {
        System.out.println("Play Music.....");

    }
    static void pauseFile() {
        System.out.println("Stop Music.....");

    }
    static void closeFile() {
        System.out.println("Exit.....");

    }

}
