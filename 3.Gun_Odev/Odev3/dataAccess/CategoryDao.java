package Odev3.dataAccess;

import Odev3.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
}
