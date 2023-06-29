import java.util.Locale;

public class stringallmethod {
    public static void main(String[] args) {
        String name="Vikash ";
        int length=name.length();
        System.out.println(length);
        String lowercase=name.toLowerCase();
        System.out.println(lowercase);
        System.out.println(name);
//        replace any
        String replaces="Vikash kumar coder";
        replaces=replaces.replace(" " ,"_");
        System.out.println(replaces);

    }
}
