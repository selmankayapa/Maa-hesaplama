
package maaş;

public class Main {
    public static void main(String[] args) {
        Employee personel=new Employee("Kemal", 2000, 45, 1985);
        personel.tax();
        personel.bonus();
        personel.raiseSalary();
        personel.printPersonel();
    
        System.out.println("--------------------------");
        
        Employee personelbir=new Employee("Halil", 8000, 80, 2009);
        personelbir.tax();
        personelbir.raiseSalary();
        
    }
    
    }
    

