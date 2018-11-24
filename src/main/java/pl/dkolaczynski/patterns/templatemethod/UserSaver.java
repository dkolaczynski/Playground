package pl.dkolaczynski.patterns.templatemethod;

import pl.dkolaczynski.domain.User;

public class UserSaver extends BaseSaver<User> {

	@Override
	public void validate(User user) {
		if (user.name == null || user.name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		}
	}

	@Override
	public User sanitize(User user) {
		user.name = user.name.strip();
		return user;
	}

}
