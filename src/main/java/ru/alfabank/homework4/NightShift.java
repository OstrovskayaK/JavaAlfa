package ru.alfabank.homework4;

public class NightShift {


    public static void main(String[] args) {

        int flaky = 0;
        int bug = 0;
        int critical = 0;
        int pass = 0;


        for (int passNumber = 1; passNumber <= 100; passNumber++) {
            String testStatus;

           if (passNumber % 5 == 0 && passNumber % 3 == 0) {
                testStatus = "Critical!!!";
                critical++;
            }
           else if (passNumber % 3 == 0) {
                testStatus = "Flaky!";
                flaky++;
            }
            else if (passNumber % 5 == 0){
                testStatus = "Bug!";
                bug++;
            }
            else {
                testStatus = "Pass";
                pass++;
            }
            System.out.printf("Test #%d: %s%n", passNumber, testStatus );
        }
        System.out.println();
        System.out.println("==== NIGHT SHIFT RESULTS ====" );
        System.out.println("All tests: 100");
        System.out.println("Pass: " + pass);
        System.out.println("Flaky: " + flaky);
        System.out.println("Bug: " + bug);
        System.out.println("Critucal: " + critical);
    }
}