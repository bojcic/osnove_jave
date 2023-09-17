package p14_09_2023;

public class Zadatak5 {
    public static void main(String[] args) {
        TestCase login = new TestCase(1,"Validate LOGIN form");
        login.addStep(new TestStep("Open app","oppened","oppened","ERROR"));
        login.addStep(new TestStep("Check if LOGIN is visible.","visible","visible","ERROR"));
        login.addStep(new TestStep("Enter username","username","username","ERROR"));
        login.addStep(new TestStep("Enter password","password","password","ERROR"));
        login.addStep(new TestStep("Click on LOGIN ","logged in","Not logged in","ERROR"));

       login.printCase();

    }
}
