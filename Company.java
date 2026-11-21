public class Company {
    public static void main(String[] args) {
        Employee e1=new Employee(101,"Shiv","Pune");
        Employee e2=new Employee(102,"Shripad","Lonere");
        Employee e3=new Employee(103,"Ajay","Hingoli");

        Employee[] array_employee={e1,e2,e3};

        for(Employee emp:array_employee){
            System.out.println(emp.eid
            );
        }
    }
}
