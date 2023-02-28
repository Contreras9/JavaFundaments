import java.time.LocalDate;

public class Exceptions {

    public static void dividing(int denominator) {
        System.out.println(17 / denominator);
    }
    public static void main(String[] args) {

//        Integer[] integerArray = new Integer[] {1,2,3,4,5};
//        System.out.println(integerArray[5]);

//        dividing(4);
//        dividing(0);

        LocalDate today = null;
        if (today != null) {
            System.out.println(today.getMonth());
        }

        String hello = "hello";
        Double value = Double.valueOf(hello);
    }
}