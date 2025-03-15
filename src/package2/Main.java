package package2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Jamila",300,"Drama",1958);
        Book book2 = new Book(2,"Harry Potter",700,"Fantasy",1997);
        Book book3 = new Book(3,"Syngan Kylych",1000,"Historic",1966);
        Book book4 = new Book(4,"Markumdar unu",800,"Biography",1991);
        Book book5 = new Book(5,"Delbirim",500,"Povest",1961);

        Book[] books = new Book[]{book1,book2,book3,book4,book5};


        Library library1 = new Library(1,"Centrar library","Kiev 88",books);
        Library library2 = new Library(2,"Osmonov library","Erkindik 88",books);
        Library library3 = new Library(3,"Manas library","Tynaliev 88",books);

        library1.sout();

    }

}
