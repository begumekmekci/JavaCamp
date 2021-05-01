
public class InstructorManager extends UserManager{
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
    
    public String print (Instructor instructor){
        return instructor.getInstructorNumber();
      }
}
