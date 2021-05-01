
public class StudentManager extends UserManager{
    @Override
    public void add(User user){
      System.out.println(user.getFirstName()+" "+user.getLastName()+" kaydedildi.");
      }
    
    @Override
    public void addMultiple (User[] users){
          for(User user: users){
              add(user);
          }
      }
    public void print(Student student){
        System.out.println(student.getStudentNumber()+" numaralı öğrenci"+" ("+student.getFirstName()+" "+student.getLastName()+") sınavdan 80 almıştır.");
      }
      
}
