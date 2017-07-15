import java.util.Date;

/**
 * Created by OV-Lab1-1 on 7/14/2017.
 */
public class Person {

    private String fName;
    private String lName;
    private int bDate;
    private String gender;
    private String address;

    public Person() {
        fName = "Ahmed";
        lName = "Ali";
        bDate = 1990;
        gender = "Male";
        address = "Cairo-Egypt";
    }

    public Person(String fName) {

        this.fName = fName;
        lName = "reda";
        bDate = 1990;
        gender = "Male";
        address = "Cairo-Egypt";
    }

    public void talk() {
        System.out.println("i'm " + fName +" " + lName + " i can talk");
    }

    public void walk() {
        System.out.println("i'm " + fName + " " +lName + " i can walk");
    }

    public int calcAge(int yourAge) {
        return yourAge - bDate;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress() {
        return address;
    }
}

