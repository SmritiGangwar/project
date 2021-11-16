interface LibraryUser{
    public void name();
    public void registerAccount(int age);
    public void requestBook(String bookType);
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void name() {
        System.out.println("Riya");
    }

    @Override
    public void registerAccount(int age) {
        if(age<12){
            System.out.println("You have successfully registered under kids account.");
        }
        else{
            System.out.println("Sorry age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if(bookType.equals("Kids")){
            System.out.println("Book issued successfully,please return the book within 10 days.");
        }
        else{
            System.out.println("Oops you are allowed to take only kids book");
        }
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void name() {
        System.out.println("Riya");
    }

    @Override
    public void registerAccount(int age) {
        if(age>12){
            System.out.println("You have successfully registered under Adult account.");
        }
        else{
            System.out.println("Sorry age must be greater than 12 to register as an Adult.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if(bookType.equals("Fiction")){
            System.out.println("Book issued successfully,please return the book within 7 days.");
        }
        else{
            System.out.println("Oops you are allowed to take only adult Fiction book.");
        }
    }
}
public class Library {
    public static void main(String[] args) {
        LibraryUser obj = new KidUsers();
        LibraryUser obj1 = new AdultUser();

        //Test case 1
        obj.registerAccount(10);
        obj.requestBook("Kids");
        obj.registerAccount(18);
        obj.requestBook("Fiction");


    }
}