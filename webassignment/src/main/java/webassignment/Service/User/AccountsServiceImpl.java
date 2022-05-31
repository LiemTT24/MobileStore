package webassignment.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webassignment.Dao.UsersDao;
import webassignment.Model.User;

@Service
public class AccountsServiceImpl implements IAccountsService {
	@Autowired
	UsersDao userDao = new UsersDao();

	public int AddAccount(User user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return userDao.AddAccount(user);
	}

	public User CheckAccount(User user) {
		String pass = user.getPassword();
		user = userDao.getUserByAccount(user);
		if (user != null) {
			if (BCrypt.checkpw(pass, user.getPassword())) {
				return user;
			} else {
				return null;
			}
		}
		return null;
	}
}
