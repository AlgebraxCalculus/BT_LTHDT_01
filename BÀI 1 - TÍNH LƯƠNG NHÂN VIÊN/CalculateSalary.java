public class CalculateSalary {

    public static void main(String[] args) {
        IEmployee p1 = new PartTimeEmployee(13, "Nguyen Van A", 15000);
        IEmployee p2 = new FullTimeEmployee("Tran Van B", 78000);
        System.out.println("Salary: " + p1.calculateSalary());
        System.out.println("Name: " + p1.getName());
        System.out.println("Salary: " + p2.calculateSalary());
        System.out.println("Name: " + p2.getName());
    }
}
    /* Output:
    Salary: 195000
    Name: Nguyen Van A
    Salary: 14976000
    Name: Tran Van B
    */
