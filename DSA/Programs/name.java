public class name {
    public static void main(String[] args) {
        String msg = "Aryan";
       String ans = cname(msg);
    //    cname(msg);
        System.out.println(msg);

    }
    // static void cname(String msg){
    static String cname(String naam){
         naam = "hi";    //not changing but creating object n we cant modify strings
        return naam;


    }
}
