class Employee{
    String name;
    String surname;
    double slary;
    public Employee(String name, String surname, double slary){
        this.name = name;
        this.surname = surname;
        this.slary = slary;
    }
    public void Information(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Slary: " + slary + "TL");
    }

}
public class EmployeeSlary {
    public static void main(String[] args){
        Employee employee = new Employee("Muhammed", "Seyrek", 10000);
        employee.Information();
    }
}
