public class HibernateCourseDao  implements CourseDao {

    @Override
    public void add(CourseDao course) {
        System.out.println("Hibernate ile veri tabanına eklendi  ");        
        
    }

    @Override
    public void update(CourseDao course) {
        System.out.println("Hibernate ile veri tabanına güncellendi  ");        
        
    }

    @Override
    public void delete(CourseDao course) {
        System.out.println("Hibernate ile veri tabanına silindi  ");        
        
    }
    
}
