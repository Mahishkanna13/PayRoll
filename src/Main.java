// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class EmployeeWages
{
    String EmployeeName="";
    double Salary=0.0;
    double HourlyRate;
    double HoursWorked;
    public void calculatePay(double salary,String employeeName)
    {
        Salary=salary;
        EmployeeName=employeeName;
        System.out.println("Employee Name is : "+EmployeeName+"\n"+"Employee Salary is : "+Salary);
    }

    public void calculatePay(double Rate,double hoursWorked,String employeeName)
    {
        EmployeeName=employeeName;
        HourlyRate=Rate;
        HoursWorked=hoursWorked;
        System.out.println("Employee Name is : "+EmployeeName+"\n"+"Employee Salary is : "+HourlyRate*HoursWorked);
    }
}
public class Main
{
    public static void main(String[] args) {
        EmployeeWages employeeWages=new EmployeeWages();
        employeeWages.calculatePay(20000.0,"Mahish");
        employeeWages.calculatePay(1000,8,"Ram");
    }

}