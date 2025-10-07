package day25;

public class Registration {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private boolean isMarried;
    private String emailId;
    private String password;

    public Registration(String fName,String lName,int age, char gender, boolean isMarried, String emailId,String password)
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.emailId = emailId;
        this.password =password;
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
