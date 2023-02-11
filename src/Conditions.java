public class Conditions {

    public static void main(String[] args) {

        int testScore = 100;

        if (testScore > 50) {
            System.out.println("Well done - You passed!");
        }
        else if (testScore == 50) {
            System.out.println("I'm not sure if you passed or not!");
        }
        else {
            System.out.println("Sorry - You failed");
        }

        switch (testScore) {
            case 0:
                System.out.println("Did you even take the test?");
                System.out.println("You scored a zero!");
                break;
            case 100:
                System.out.println("You got top marks!");
                break;
            default:
                System.out.println("You didn't do anything special!");
                break;
        }
    }
}
