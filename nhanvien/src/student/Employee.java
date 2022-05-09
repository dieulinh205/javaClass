package student;

public class Employee extends person {

    public int employeeID;
    public double factor;
    public double basicSaraly;


    public Employee(String name) {
        super(name);

    }

    public Employee(String name, int employeeID, double factor, double basicSaraly) {
        super(name);
        this.employeeID = employeeID;
        this.factor = factor;
        this.basicSaraly = basicSaraly;
    }
}
