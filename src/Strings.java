public class Strings {

    public static void main(String[] args) {

        String myName = "Hamzah";
        int length = myName.length();
        System.out.println("My name is " + myName);
        System.out.println("This has " + length + " characters.");
        String myNameUpper = myName.toUpperCase();
        System.out.println("My name is " + myNameUpper);

        String phrase = "Many hands make light work.";
        System.out.println(phrase.startsWith("Many"));
        System.out.println(phrase.startsWith("many"));
        System.out.println(phrase.indexOf("light"));
        System.out.println(phrase.indexOf("Light"));
        System.out.println(phrase.indexOf("dark"));
        System.out.println(phrase.substring(16));
        System.out.println(phrase.substring(16, 21));
        System.out.println(phrase.replace("light", "heavy"));

        myName = "Hamzah Contreras";
        String yourName = "Hamzah Santos";

        String myFirstName = myName.substring(0, 7);
        String yourFirstName= yourName.substring(0, 7);

        System.out.println(myFirstName);
        System.out.println(yourFirstName);

        // boolean weHaveTheSameFirstName = myFirstName == yourFirstName;
        boolean weHaveTheSameFirstName = myFirstName.equals(yourFirstName);

        System.out.println(weHaveTheSameFirstName);

        String firstDay = "Sunday";

        String lastDay;

        if (firstDay.equals("Sunday")) {
            lastDay = "Saturday";
        }
        else {
            lastDay = "Sunday";
        }

        String nextDay = firstDay.equals("Sunday") ? "Monday" : "Tuesday";

        String person = "Sandra Burnside";
        int spacePosition = person.indexOf(" ");
        String surname = person.substring(spacePosition + 1, person.length());
        // boolean evenLength = surname.length() % 2 == 0 ? true : false;
        boolean evenLength = surname.length() % 2 == 0;
        System.out.println(surname);
        System.out.println(evenLength);
    }
}
