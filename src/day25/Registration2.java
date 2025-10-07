package day25;

public class Registration2 {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private boolean isMarried;
    private String emailId;
    private String password;


    public Registration2 setfName(String fName) {
        this.fName = fName;
        return this;
    }

    public Registration2 setlName(String lName) {
        this.lName = lName;
        return this;
    }

    public Registration2 setAge(int age) {
        this.age = age;
        return this;
    }

    public Registration2 setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public Registration2 setMarried(boolean married) {
        isMarried = married;
        return this;
    }

    public Registration2 setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public Registration2 setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getlName() {
        return lName;
    }

    public String getfName() {
        return fName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }
}
