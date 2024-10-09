public class Practice {
    public static void main(String[] args) {
        // String names = "ary";

        String message = myGreet("Aryan");
        System.out.println(message);
        int a = 10;
        int b = 80;
        System.out.println(a + " "+ b);

    }

    static String myGreet(String name) {
        String message = "How are you " + name;
        return message;
    }

}
