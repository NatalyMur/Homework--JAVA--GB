
/**
* Homework 5.
*
* @author Alex Murachev
*
* @version 17.11.2021
*/

class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
                
        employees[0] = new Employee("Ivan Vasilievich Ivanov", "director", "ivan@mail.ru", "+7-999-111-111-11", 100000, 45);
        System.out.println(employees[0]); 
        
        employees[1] = new Employee("Alexey Borisovich Volgin", "accountant", "chudik@mail.ru", "+7-999-111-111-22", 65000, 37);
        System.out.println(employees[1]);         
        
        employees[2] = new Employee("Olga Vladimirovna Sukhova", "manager", "olga33@inbox.ru", "+7-999-111-333-22", 54000, 29);
        System.out.println(employees[2]);       
        
        employees[3] = new Employee("Marina Vyacheslavovna Ilyina", "cleaning woman", "marin_i@list.ru", "+7-999-155-313-22", 15000, 23);
        System.out.println(employees[3]);         
        
        employees[4] = new Employee("Vladimir Ivanovich Suvorov", "security guard", "vladimir.suvorov@yandex.ru", "+7-950-888-313-22", 30000, 51);
        System.out.println(employees[4]);   
        
        System.out.println("Task 5");
        
        for (int i = 0; i < employees.length; i++)
        if (employees[i].age > 40) //employees[i].print();
            System.out.println(employees[i]);
        }
}

class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;
    
    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
     
    @Override
    public  String toString() {
        return "FullName: " + fullName + ", position:" + position + ", email:" + email + ", phone:" + phone + ", salary: " + salary + ", age:" + age;         
    }        
}