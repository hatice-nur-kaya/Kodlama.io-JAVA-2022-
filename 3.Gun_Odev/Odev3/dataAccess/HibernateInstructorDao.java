public class HibernateInstructorDao implements InstructorDao {

    @Override
    public void add(InstructorDao instructor) {
        System.out.println("Hibernate ile veri tabanına eklendi  ");        
        
    }

    @Override
    public void update(InstructorDao instructor) {
        System.out.println("Hibernate ile veri tabanına güncellendi  ");        
        
    }

    @Override
    public void delete(InstructorDao instructor) {
        System.out.println("Hibernate ile veri tabanına silindi  ");        
        
    }
    
}
