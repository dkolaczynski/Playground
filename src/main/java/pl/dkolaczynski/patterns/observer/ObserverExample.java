package pl.dkolaczynski.patterns.observer;

import pl.dkolaczynski.domain.User;

public class ObserverExample {

	public static void main(String[] args) {
		UserDeleter userDeleter = new UserDeleter();

		MailSender mailSender = new MailSender();
		userDeleter.addObserver(mailSender);

		NewsletterService newsletterService = new NewsletterService();
		userDeleter.addObserver(newsletterService);

		User user = new User();
		user.name = "John Doe";

		userDeleter.notify(user); // deleting user
	}

}
