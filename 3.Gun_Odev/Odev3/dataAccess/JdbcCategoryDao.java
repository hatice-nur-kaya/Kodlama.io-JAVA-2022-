public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void add(CategoryDao categoryDao) {
        System.out.println("Jdbc ile veritabanına eklendi");        
    }

    @Override
    public void update(CategoryDao categoryDao) {
        System.out.println("Jdbc ile veritabanına güncellendi");        
        
    }

    @Override
    public void delete(CategoryDao categoryDao) {
        System.out.println("Jdbc ile veritabanına silindi");        
    }
    
}
