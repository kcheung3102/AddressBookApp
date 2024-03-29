import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
    private String name;
    private String address;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    public AddressBook(){};

    public AddressBook(String name, String address, String state, int zip, String email, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(isPhoneNumberValid(phoneNumber))
            this.phoneNumber = phoneNumber;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isEmailValid(email))
            this.email = email;
    }


    public String displayText() {
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "State: " + state + "\n" +
                "Zip: " + zip + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email + "\n";
    }

    private boolean isEmailValid(String email){
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }


}
