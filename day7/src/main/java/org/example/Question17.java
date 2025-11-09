package org.example;

import java.util.ArrayList;
import java.util.List;

abstract class EmployeeManagement{
   private String id;
   private String name;
   private int salary;
   public EmployeeManagement(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary (){
       return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }
    public abstract int calculateSalary ();
}
class FullTimeEmployee extends EmployeeManagement{
    private int experienceYear;

    public FullTimeEmployee(String id ,String name, int salary,int experienceYear){
        super(id,name,salary);
        this.experienceYear = experienceYear;
    }
    @Override
    public int calculateSalary(){
        int salary = getSalary();
        int extraBonus = (salary * experienceYear * 5) / 100;
        return salary + extraBonus;
    }
}
class PartTimeEmployee  extends  EmployeeManagement{
    private int contractMonth;
    public PartTimeEmployee(String id ,String name, int salary,int contractMonth){
        super(id,name,salary);
        this.contractMonth = contractMonth;
    }
    @Override public int calculateSalary(){
        int salary = getSalary();
        return (salary * contractMonth) / 12;
    }
}
public class Question17 {
    public static void main(String[] args) {
            EmployeeManagement fullTime1 = new FullTimeEmployee("emp01","employee1",3434,6);
            EmployeeManagement partTime1 = new PartTimeEmployee("part01","employee2",8777,8);
            EmployeeManagement fullTime2 = new FullTimeEmployee("emp02","employee3",4543,4);
            EmployeeManagement partTime2 = new PartTimeEmployee("part02","employee4",8765,23);
            List<EmployeeManagement> ls = new ArrayList<>();
            ls.add(fullTime1);
            ls.add(partTime1);
            ls.add(fullTime2);
            ls.add(partTime2);
            for(EmployeeManagement emp: ls){
                System.out.println("the employee salary is  " + emp.calculateSalary());
            }
    }
}
