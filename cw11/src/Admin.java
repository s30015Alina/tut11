class Admin extends Employee {

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee addEmployee(String firstName, String lastName) {
        return new Employee(firstName, lastName);
    }

    public void removeEmployee(Employee employee) {
        // In a real system, this would remove the employee from some sort of storage or database.
        System.out.println("Employee " + employee.getEmployeeId() + " removed.");
    }
}