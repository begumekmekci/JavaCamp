
public class Main {
    public static void main(String[] args) {
         
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Begüm");
        student1.setLastName("Ekmekçi");
        student1.setStudentNumber("715");
        
        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstName("Aleyna");
        student2.setLastName("Ekmekçi");
        student2.setStudentNumber("716");
        
        Instructor instructor = new Instructor();
        instructor.setId(0);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setInstructorNumber("700");
        
        User[] users = {student1, student2};
        
        StudentManager studentManager = new StudentManager();
        studentManager.addMultiple(users);
        studentManager.print(student2);
        
        System.out.println();
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        String number = instructorManager.print(instructor);
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"'un kurucu numarası: "+number);
    }
}
