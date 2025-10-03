package day23;

public class Employees
{
    public String[]  getEmployeeDevices(String employeeName)
    {
        String[] devices=new String[0];
         if(employeeName.equals("Justin"))
         {
             devices = new String[]{"macbook", "iph17"};
             return devices;
         }
         else if (employeeName.equals("Jason"))
         {
             devices = new String[]{"macbook", "iph17", "mobile"};
             return devices;
         }
         else if (employeeName.equals("Kerrie"))
         {
             devices = new String[]{"iph17", "mobile"};
             return devices;
         }
         else if (employeeName.equals("Ben"))
         {
             devices = new String[]{"iph17", "mobile", "samsungS17"};
             return devices;
         }
        return new String[0];
    }
}
