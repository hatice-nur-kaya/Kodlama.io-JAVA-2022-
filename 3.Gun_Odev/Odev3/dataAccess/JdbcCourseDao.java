public class JdbcCourseDao implements CourseDao {

    @Override
    public void add(CourseDao course) {
        System.out.println("Jdbc ile veritabanına eklendi : " );
        
    }

    @Override
    public void update(CourseDao course) {
        System.out.println("Jdbc ile veritabanına güncellendi : " );
        
    }

    @Override
    public void delete(CourseDao course) {
        System.out.println("Jdbc ile veritabanına silindi : " );
        
    }
    
}
