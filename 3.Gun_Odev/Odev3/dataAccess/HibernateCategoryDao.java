public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(CategoryDao categoryDao) {
        System.out.println("Hibernate ile veri tabanına eklendi  ");        
    }

    @Override
    public void update(CategoryDao categoryDao) {
        System.out.println("Hibernate ile veri tabanına güncellendi  ");        
        
    }

    @Override
    public void delete(CategoryDao categoryDao) {
        System.out.println("Hibernate ile veri tabanına silindi  ");        
        
    }
    
}
