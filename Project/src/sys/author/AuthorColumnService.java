package sys.author;

import java.util.List;

import sys.category.Category;

public class AuthorColumnService {

	private AuthorColumnDao authorColumnDao;

	public void setAuthorColumnDao(AuthorColumnDao authorColumnDao) {
		this.authorColumnDao = authorColumnDao;
	}

	public List<AuthorColumn> findAll() {
		
		return authorColumnDao.findAll();
	}

	public void save(AuthorColumn authorColumn) {
		authorColumnDao.save(authorColumn);
		
	}

	public AuthorColumn findById(Integer acId) {
		return authorColumnDao.adminFindById(acId);
	}

	public void update(AuthorColumn authorColumn) {
		authorColumnDao.update(authorColumn);
	}

	public void delete(AuthorColumn authorColumn) {
		authorColumnDao.delete(authorColumn);
	}

	
}
