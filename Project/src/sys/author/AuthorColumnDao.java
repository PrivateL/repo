package sys.author;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import sys.category.Category;

public class AuthorColumnDao extends HibernateDaoSupport{

	public List<AuthorColumn> findAll() {
		return this.getHibernateTemplate().find("from AuthorColumn");
	}

	public void save(AuthorColumn authorColumn) {
		 this.getHibernateTemplate().save(authorColumn);
	}

	public AuthorColumn adminFindById(Integer acId) {
		return this.getHibernateTemplate().get(AuthorColumn.class, acId);
	}

	public void update(AuthorColumn authorColumn) {
		this.getHibernateTemplate().update(authorColumn);
	}

	public void delete(AuthorColumn authorColumn) {
		this.getHibernateTemplate().delete(authorColumn);
	}

}
