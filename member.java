class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}
 class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

 class Manager extends Member{
    private String department;

    public Manager(String name, int age, String phoneNumber,
                    String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}
