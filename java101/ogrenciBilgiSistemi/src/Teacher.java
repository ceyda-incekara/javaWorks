public class Teacher {
    String name;
    String mpno; //telefonno
    String branch; //bölüm

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı : " +this.name);
        System.out.println("Numarası : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
    }
}
