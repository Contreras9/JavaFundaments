public class Methods {

    static String myName = "Hamzah";

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        int result = addTwoNumbers(3, 6);
        System.out.println("The result was " + result + ".");

        double total = addThreeNumbers(2.0, 1.7, result);
    }

    public static double addThreeNumbers(double value1, double value2, double value3) {
        double result2 = value1 + value2 + value3;
        System.out.println(myName);
        return result2;
    }

    public static int whoIsOlder(int age1, int age2) {
        if (age1 > age2) {
            return age1;
        }
        return age2;
    }

    public static boolean longerThan5(String word) {
//        if (word.length() >= 6) {
//            return true;
//        }
//        return false;

//        return word.length() >= 6 ? true : false;

        return word.length() >=6;
    }

    public static int addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
        printMyName();
        if (num1 == 0) {
            return -1;
        }
        else {
            return num1 + num2;
        }
    }

    public static void printMyName() {
        System.out.println("My name is Hamzah.");
    }
}
