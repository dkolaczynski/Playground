package pl.dkolaczynski.patterns.observer;

import pl.dkolaczynski.domain.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserDeleter implements Observable<User> {

	private final List<Observer<User>> observers;

	public UserDeleter() {
		this.observers = new CopyOnWriteArrayList<>();
	}

	@Override
	public void addObserver(Observer<User> observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer<User> observer) {
		observers.remove(observer);
	}

	@Override
	public void notify(User user) {
		deleteUser(user);
	}

	public void deleteUser(User user) {
		System.out.println("Deleted user: " + user.name);
		observers.forEach(o -> o.update(user));
	}

}
