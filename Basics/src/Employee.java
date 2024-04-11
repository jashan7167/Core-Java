public class Employee {

    int salary;
    Employee()
    {}

    Employee(int s)
    {
        this.salary  = s;
    }
    void work()
    {
        System.out.println("Employee is working");
    }
    int getsalary()
    {
        return salary;
    }

}
