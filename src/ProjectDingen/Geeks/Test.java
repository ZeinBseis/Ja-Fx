package ProjectDingen.Geeks;

public class Test {
    public static void main (String []args) {
        StringBuilder sb = new StringBuilder();
        String a = "";
        String b = "123";
        String c = "456";

        sb.append(a);
        a = a.concat(b + "\n" + c);
        System.out.println(a);
    }
}
