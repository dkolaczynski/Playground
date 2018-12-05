package pl.dkolaczynski.patterns.observer;

import pl.dkolaczynski.domain.User;

public class NewsletterService implements Observer<User> {

	@Override
	public void update(User user) {
		unsubscribe(user);
	}

	public void unsubscribe(User user) {
		System.out.println("Unsubscribing user: " + user.name);
	}

}
