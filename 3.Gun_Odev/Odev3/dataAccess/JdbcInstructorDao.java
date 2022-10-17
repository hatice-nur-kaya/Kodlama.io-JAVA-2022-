public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(InstructorDao instructor) {
        System.out.println("Jdbc ile veritabanına eklendi : ");
        
    }

    @Override
    public void update(InstructorDao instructor) {
        System.out.println("Jdbc ile veritabanına güncellendi : ");
        
    }

    @Override
    public void delete(InstructorDao instructor) {
        System.out.println("Jdbc ile veritabanına eklendi : ");
        
    }
    
}
