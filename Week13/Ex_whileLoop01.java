public class Ex_whileLoop01 {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10 . . . .
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 5;

        }
        System.out.println();

        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println();

    }

}
