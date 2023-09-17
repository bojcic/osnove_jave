package p14_09_2023;

public class TestStep {
    private String description;
    private String actualValue;
    private String expectedValue;
    private String errorMessage;

    public TestStep(String description, String expectedValue, String actualValue, String errorMessage) {
        this.description = description;
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
        this.errorMessage = errorMessage;
    }

    public String getDescription() {
        return description;
    }

    public String getActualValue() {
        return actualValue;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public boolean validate (){
        if (this.expectedValue.equals(this.actualValue)){
            return true;
        } else {
            return false;
        }
    }
    public void printStep(){
        System.out.println("| " + this.description + " |");
        if (this.validate()){
            System.out.println("| PASSED | " );
        } else {
            System.out.println("| FAILED | " + this.errorMessage);
        }

    }
}
