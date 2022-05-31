package webassignment.Service.User;

import org.springframework.stereotype.Service;

import webassignment.Model.User;

@Service
public interface IAccountsService {
	public int AddAccount(User user);
	public User CheckAccount(User user);
}
