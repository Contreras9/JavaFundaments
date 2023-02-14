public class NameManager {

    String myName = "Hamzah Contreras";

    public String getFirstName() {
        String[] names = myName.split(" ");
        return names[0];
    }

    public String getSurname() {
        String[] names = myName.split(" ");
        return names[names.length - 1];
    }
}
