package day25;

public class TestRegistration {
    public static void main(String[] args) {
        Registration registration = new Registration("Jason", "Roger", 32, 'M', true, "jason.roger@janbask.com", "test@1234");
        System.out.println(registration.getfName() + " " + registration.getlName());
        System.out.println(registration.getAge());
        System.out.println(registration.getGender());
        System.out.println(registration.isMarried());
        System.out.println(registration.getEmailId());
        System.out.println(registration.getPassword());

        System.out.println("======Using Builder Pattern============");
        Registration2 registration2 = new Registration2();
        registration2.setfName("Kerrie").setAge(32).setlName("Wright").setEmailId("kerrie.wright@janbask.com").setGender('F').setPassword("Test@1234").setMarried(false);
        System.out.println(registration2.getfName() + " " + registration2.getlName());
        System.out.println(registration2.getAge());
        System.out.println(registration2.getGender());
        System.out.println(registration2.isMarried());
        System.out.println(registration2.getEmailId());
        System.out.println(registration2.getPassword());
    }
}
