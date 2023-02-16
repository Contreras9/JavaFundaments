public class ArraysOfObjects {

    public static void main(String[] args) {

        int[] numbers = {1,2,3};

        Book[] books = new Book[10];

        books[4] = new Book("A good read", "Matt Greencroft", 17.99);

        Book myBook;
        myBook = new Book("A good read part 2", "Matt Greencroft", 37.99);
//        myBook = null;

        if (myBook != null) {
            System.out.println(myBook.getTitle());
        }

        books[5] = myBook;
    }
}
