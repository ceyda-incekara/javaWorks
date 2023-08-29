public class Course {
    Teacher teacher; //nesne ürettik
    String name;
    String code; //101
    String prefix; //TRH-branch ile aynı olmasını bekleriz
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
