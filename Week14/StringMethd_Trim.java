public class StringMethd_Trim {
    public static void main(String[] args) {
        String fullname = " Thanathip Kuaiprasuat ";

        int count = fullname.length();
        System.out.println(count);
        System.out.println("before =>"+fullname);

        // .trim()  ตัดช่องว่างหน้าหลังออก
        String result = fullname.trim();
        System.out.println("after ==>"+result);
        System.out.println(result.length());


        // .indexof()  แสดงผลตำแหน่งที่ของอักษร
        System.out.println(fullname.indexOf("Th", 1));

        //  .toUpperCase()   .toLowerCase()
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());

        //  .sub
        String uni = "Nakhrn Prathom";
        System.out.println(uni.substring(0,3));
    }
    
}
