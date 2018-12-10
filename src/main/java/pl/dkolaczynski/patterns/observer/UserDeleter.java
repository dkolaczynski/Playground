package pl.dkolaczynski.patterns.observer;

import pl.dkolaczynski.domain.User;

public class UserDeleter extends Observable<User> {

	public void deleteUser(User user) {
		System.out.println("Deleted user: " + user.name);
		notify(user);
	}

}
