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

	
}
