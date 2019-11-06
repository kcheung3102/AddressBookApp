import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<AddressBook> addressBookList = new ArrayList<>();

        AddressBook kevin = new AddressBook("Kevin","123 address street","MD",21312,"kckev32@gmail.com","301-213-1241");
        AddressBook kevin2 = new AddressBook("Kevin","123 address street","MD",21312,"kckev32@gmail.com","301-213-1241");
        AddressBook kevin3= new AddressBook("Kevin","123 address street","MD",21312,"kckev32@gmail.com","301-213-1241");

        Collections.addAll(addressBookList,kevin,kevin2,kevin3);
        for (AddressBook a: addressBookList) {
            System.out.println(a.displayText());
        }
    }
}
