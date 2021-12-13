
package maaş;

public class Employee {
    String name;
    double salary;
    int WorkHours;
    int hireYear;
    double tax;
    double bonus;
    double raise; //zam
    
    Employee(String name ,double salary,int WorkHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.WorkHours = WorkHours;
        this.hireYear=hireYear;
    }
    void tax(){
        if(this.salary>=0  &&  this.salary <= 1000){
            this.tax=this.salary*0;
        }else{
            this.tax=this.salary*0.03;
        }
    }
    void bonus(){
        if(this.WorkHours > 40){
            this.bonus=30*(this.WorkHours-40);
        }
    }
    void raiseSalary(){
        if(2021-this.hireYear < 10){
            this.raise=this.salary*0.05;
        }
        else if(2021-this.hireYear > 9 && 2021*this.hireYear < 20){
            this.raise=this.salary*0.1;
        }else{
            this.raise=this.salary*0.15;
        }
    }
    void printPersonel(){
       System.out.println("adı : " + this.name);
       System.out.println("maaşı : " + this.salary);
       System.out.println("çalışma saati : " + this.WorkHours);
       System.out.println("başlangıç yılı : " + this.hireYear);
       System.out.println("vergi : " + this.tax );
       System.out.println("bonus : " + this.bonus);
       System.out.println("maaş artışı : " + this.raise );
       System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary+this.bonus-this.tax));
       System.out.println("Toplam Maaş : " + ((this.salary+this.bonus-this.tax)+this.raise));
    }
    }

