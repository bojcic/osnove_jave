package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String testName;
    private ArrayList<TestStep> steps;

    public TestCase(int id, String testName) {
        this.id = id;
        this.testName = testName;
        this.steps=new ArrayList<TestStep>();
    }

    public void addStep(TestStep step){
        this.steps.add(step);

    }
    private int failedSteps(){
        int counter=0;
        for (int i = 0; i < this.steps.size(); i++) {
            if (!this.steps.get(i).validate()){
                counter+=1;
            }
        }
        return counter;
    }
    public void validateTest(){
        if (this.failedSteps() == 0){
            System.out.println("Test Case PASSED");
        } else {
            System.out.println("Test Case FAILED");
        }
    }
    public void printCase(){
        System.out.println("ID: " + this.getId());
        for (int i = 0; i < this.steps.size(); i++) {
            this.steps.get(i).printStep();
        }
        System.out.println();
        this.validateTest();
    }

    public ArrayList<TestStep> getSteps() {
        return steps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
