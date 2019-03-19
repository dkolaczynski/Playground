package pl.dkolaczynski.patterns.strategy;

public class MailNotificationStrategy implements NotificationStrategy {

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message via email: " + message);
	}

}
