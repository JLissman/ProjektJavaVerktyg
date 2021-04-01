import com.google.common.base.CharMatcher;

public class sOuter {
    public static void main(String[] args) {
        whoIsJenkins();
    }
    public static void whoIsJenkins(){
        String hejString = CharMatcher.whitespace().trimFrom("          Leeeeeroy JEEEEENKINS    ");
        System.out.println(hejString);


    }
}
