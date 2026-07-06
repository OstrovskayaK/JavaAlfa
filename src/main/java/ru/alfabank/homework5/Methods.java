package ru.alfabank.homework5;

import java.util.Random;

public class Methods {

    // ГЕНЕРАТОР
    public static String generateAccessCode() {
        String codePart1 = String.valueOf(java.time.Year.now().getValue());
        int codePart3 = (int) Math.pow(3, 7);
        String accessCode = codePart1 + "-" + codePart3;
        return accessCode;
    }

    //ВАЛИДАТОР
    private static boolean isValidCode(String code, int minLength) {
        boolean codeIsValid = !code.equals(null)  && code.length() >= minLength && code.contains("-");
        return codeIsValid;
    }

    //ЛОГГЕР
    public static String logEvent(String message) {
        return "[INFO] " + message;
    }
    public static String logEvent(String message, boolean isCritical) {
        if (isCritical) {
        return "[CRITICAL] " + message;
        }
        return logEvent(message);
    }

    //РАНДОМАЙЗЕР
    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int numberId = random.nextInt(1000, 9999);
        String agentId = prefix + "-" + numberId;
        return agentId;
    }

    //ДАШБОРД
    private static void dashbord() {

      String  code = generateAccessCode();
      boolean codeIsValid = isValidCode(code, 8);
        System.out.println("Code is valid - " + codeIsValid);


      String success =  logEvent("Server protection activated");
        System.out.println(success);

      String fail =  logEvent("Intrusion attempt detected", true);
        System.out.println(fail);


      String agentId1 = generateAgentId("AGENT", 42);
      String agentId2 = generateAgentId("AGENT", 77);
      String agentId3 = generateAgentId("AGENT", 13);
        System.out.println(agentId1);
        System.out.println(agentId2);
        System.out.println(agentId3);
    }

    static void main() {
        dashbord();
    }
}
