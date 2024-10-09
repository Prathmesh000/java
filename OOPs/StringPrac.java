import java.util.Arrays;

public class StringPrac {
    public static void main(String[] args) {
        
        // String[] a = {"A", "B"};
        // String[] b = a;
        // b[0] = "Arrrr";
        // System.out.println(Arrays.toString(a));

        String p = "Aryan";
        String q = "Aryan";
        String r = p;
        String a = new String("Aryan");
        String b = new String("Aryan");

        System.out.println(q == r);
        System.out.println(a.equals(b));

        float n = 5.989f;
        System.out.printf("Number is: %.2f", n);
        System.out.println();
        System.out.printf("Hello %s, You are %s, u got %d", "Aryan", "Awesome",8);
        System.out.println();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        System.out.println(builder.deleteCharAt(0));

        String name = "Aryan Singh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());  //new object created
        System.out.println(name);  //not changes
        String f = "mf";
        System.out.println(name.compareTo(f));
        System.out.println("    jsbc     ".strip());

        System.out.println(Arrays.toString(name.split(" ")));

    }
}
