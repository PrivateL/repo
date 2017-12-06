package sys.category;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class CategoryDao extends HibernateDaoSupport{

	public List<Category> findAll() {
		return this.getHibernateTemplate().find("from Category");
	}
	
	public void save(Category category) {
		this.getHibernateTemplate().save(category);
	}

	public Category findByid(Integer ctgId) {
		return this.getHibernateTemplate().get(Category.class, ctgId);
	}

	public void update(Category category) {
		this.getHibernateTemplate().update(category);
	}

	public void delete(Category category) {
		this.getHibernateTemplate().delete(category);
	}
}
