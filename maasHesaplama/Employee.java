package maasHesaplama;

import java.sql.SQLOutput;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    int year =2021;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary >= 1000) {
            return this.salary*0.03;
        }
        return 0.0;
    }

    public int bonus(){
        if ( this.workHours > 40){
            return (this.workHours-40)*30;
        }
        return 0;
    }

    public double raiseSalary(){
        if (this.year - this.hireYear <10 ) {
            return this.salary*0.05;
        } else if ((this.year - this.hireYear >=10) && (this.year - this.hireYear<20)) {
            return this.salary*0.10;
        } else return this.salary*0.15;
    }

    public void toString(Employee e){
        System.out.println(e.name +" " + e.salary +" "+ e.workHours +" "+ e.hireYear);
        System.out.println ("Vergi: " + e.tax());
        System.out.println ("Bonus: " + e.bonus());
        System.out.println ("Raise Salary: " + e.raiseSalary());

    }

}
