package headfirst.w8;

public class SignletonMain{
  public static void mian(String[] agrs) {
    Signleton s1=Signleton.getInstance();
    Signleton s2=Signleton.getInstance();
    Signleton s3=Signleton.getInstance();
  }
}