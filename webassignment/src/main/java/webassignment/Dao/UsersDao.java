package webassignment.Dao;

import org.springframework.stereotype.Repository;

import webassignment.DTO.ProductsDto;
import webassignment.DTO.ProductsDtoMapper;
import webassignment.Model.User;
import webassignment.Model.UserMapper;

@Repository
public class UsersDao extends BaseDao {
	public int AddAccount(User user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO ");
		sql.append("users ");
		sql.append("( ");
		sql.append(" username, ");
		sql.append(" password, ");
		sql.append(" display_name, ");
		sql.append(" address ");
		sql.append(") ");
		sql.append(" VALUES ");
		sql.append(" ( ");
		sql.append("  '"+user.getId()+"', ");
		sql.append("  '"+user.getUsername()+"', ");
		sql.append("  '"+user.getPassword()+"', ");
		sql.append("  '"+user.getFullname()+"', ");
		sql.append(")");
		int insert = jdbc.update(sql.toString());
		return insert;
	};
	
	public User getUserByAccount(User user) {
		String sql = "select * from users where username = '"+user.getUsername()+"'";
		User result = jdbc.queryForObject(sql, new UserMapper());
		return result;
	};
}
