package sys.category;

import java.util.List;


public class CategoryService {

	private CategoryDao categoryDao;
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}
	public List<Category> findAll() {
		
		return categoryDao.findAll();
	}
	
	public void save(Category category) {
		categoryDao.save(category);
	}
	public Category findByid(Integer ctgId) {
		
		return categoryDao.findByid(ctgId);
	}
	public void update(Category category) {
		categoryDao.update(category);
	}
	public void delete(Category category) {
		categoryDao.delete(category);
	}
	
}
