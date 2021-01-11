import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_REGEX = "^[ACP]\\d{4}[G-M]$";

    public ExampleClass() {
    }
    public boolean validates(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
