public class Variables {

    public static void main(String[] args) {

        int h = 9;
        System.out.println(h);
        int s;
        s = 7;
        System.out.println(s);
        long myVariable = 18L;
        long anotherVariableWhichIsLong = 3000000000L;
        double myDouble = 18.3;
        float myFloat = 18.3F;

        int first = 50;
        int second = 100;
        int third = first;
        first = 65;

        System.out.println("First " + first);
        System.out.println("Second " + second);
        System.out.println("Third " + third);

        int weExpect2 = second / third;
        System.out.println("100 divided by 50 is " + weExpect2);

        double weExpectOnePointFive = (double) second / first;
        System.out.println("100 divided by 65 is " + weExpectOnePointFive);

        System.out.println(first + 1);
        System.out.println(first - 1);
        System.out.println(first * 7);

        int myAge = 31;
        myAge++; // myAge = myAge + 1;
        System.out.println(myAge);
        System.out.println(--myAge);
        System.out.println(myAge);

        myAge += 5; // myAge = myAge + 5;
        myAge -= 1;
        System.out.println(myAge);

        int result = 26 / 7;
        System.out.println("The whole part is " + result);

        // 26 / 7 = 3 remainder 5

        int modulus = 26 % 7;
        System.out.println("The remainder is " + modulus);

        boolean iAmYoungerThan30 = false;

        char myFirstNameStartsWith = 'H';

        int[] myArray = {1,2,3,4,5};
        System.out.println(myArray[0]);
        myArray[2] = 18;
        System.out.println(myArray[2]);

        char[] myName = {'H','a','m','z','a','h'};
        System.out.println(myName);
    }
}
