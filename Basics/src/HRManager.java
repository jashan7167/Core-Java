public class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    void work()
    {
        System.out.println("HRManager is working");
    }
    Employee addEmployee() {
        Employee a = new Employee();
        return a;
    }
}
