package oggy;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String position;

    // Constructor mặc định
    public Employee() {
    }

    // Constructor có tham số
    public Employee(int id, String name, double salary, String department, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Phương thức tăng lương
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
            System.out.println("Lương đã được tăng lên: " + salary);
        } else {
            System.out.println("Tỉ lệ tăng lương không hợp lệ!");
        }
    }

    // Phương thức kiểm tra thăng chức
    public void promote(String newPosition) {
        this.position = newPosition;
        System.out.println("Nhân viên " + name + " đã được thăng chức lên vị trí: " + position);
    }

    // Phương thức chuyển phòng ban
    public void transfer(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Nhân viên " + name + " đã được chuyển sang phòng ban: " + department);
    }

    // Kiểm tra xem nhân viên có được nhận thưởng không
    public boolean isEligibleForBonus() {
        return salary > 1000;
    }

    // Kiểm tra nhân viên thuộc phòng ban nào
    public boolean isInDepartment(String dept) {
        return this.department.equalsIgnoreCase(dept);
    }

    // Phương thức hiển thị thông tin chi tiết
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary +
                ", Department: " + department + ", Position: " + position);
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    // Ghi đè equals và hashCode để hỗ trợ so sánh
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, department, position);
    }
}
