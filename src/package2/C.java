package package2;
import package1.*;

public class C {

    public String publicString = "This is public string"; // you have access to this string in other packages
    protected String protectedString = "This is protected string"; // you have access to this string ONLY in subclasses of this class
    String defaultString = "This is default string"; // you have no access to this string in other packages
    private String privateString = "This is private string"; // you have access ONLY in class where the variable is created

}
