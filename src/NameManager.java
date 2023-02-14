public class NameManager {
    private String myName = "Yarid Contreras";

    public String getFirstName() {
        String[] names = myName.split(" ");
        return names[0];
    }

    public String getSurname() {
        String[] names = myName.split(" ");
        doSomething();
        return names[names.length -1];
    }

    public static void doSomething() {
        System.out.println("I'm doing something.");
    }
}