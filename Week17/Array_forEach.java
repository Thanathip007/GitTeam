public class Array_forEach {
    public static void main(String[] args) {
        String[] name = { "นายสมมี", "นางสาวสม", "นางสาวสมมา", "นายดี" };
        System.out.println(name.length);
        int i=1;

        for (String showName : name) {
            System.out.println(i+ ". " +showName);
            i++;

        }
        int [] number = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int j : number) {
            sum = sum+j;
            
        }
        System.out.println(sum);

        // for (int i = 0; i < name.length; i++) {
        // boolean check = name[i].startsWith("นาย");
        // if (check) {
        // System.out.println(name[i]);
        // System.out.println("เพศชาย");
        //
        // } else {
        // System.out.println(name[i]);
        // System.out.println("เพศหญิง");
        // }
        // }

    }

}
