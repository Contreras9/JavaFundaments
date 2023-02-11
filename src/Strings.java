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
    }
}
