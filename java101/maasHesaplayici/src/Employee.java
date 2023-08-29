public class Employee {
    String name;
    double salary;
    int workHours; //haftalık çalışma saati
    int hireYear; //işe başlangıç yılı

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){ //maaşa uygulanan vergiyi hesaplar
        if (this.salary >= 1000){
            return (this.salary * 3)/ 100;
        }else {
            return 0;
        }
    }
    double bonus(){
        // Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan
        // çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        if (this.workHours >= 40){
            return (this.workHours - 40)* 30;
        }else {
            return 0;
        }
    }
    double raiseSalary(){ //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
        if (2021 - this.hireYear <= 10){
            return (this.salary * 5) / 100;
        } else if(2021- this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (this.salary * 10)/ 100;
        }else {
            return (this.salary * 15)/ 100;
        }
    }
    void printEmployee(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Toplam Maaş : " + (this. salary + bonus() + raiseSalary() - tax()));
    }
}
