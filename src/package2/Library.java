package package2;

import java.util.Arrays;

public class Library {
    private long id;
    private String name;
    private String address;
    private Book[] books;

    public Library() {
    }

    public Library(long id, String name, String address, Book[] books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }
    public void sout(){
        if(id == 1){
            System.out.println("Library: " + '"' + name + '"' + "(" + address + ")");
            System.out.println("==============");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

}
