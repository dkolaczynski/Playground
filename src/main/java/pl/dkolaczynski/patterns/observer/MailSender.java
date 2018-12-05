package pl.dkolaczynski.patterns.observer;

import pl.dkolaczynski.domain.User;

public class MailSender implements Observer<User> {

	@Override
	public void update(User user) {
		sendGoodbyeMail(user);
	}

	public void sendGoodbyeMail(User user) {
		System.out.println("Sending goodbye letter to user: " + user.name);
	}

}
