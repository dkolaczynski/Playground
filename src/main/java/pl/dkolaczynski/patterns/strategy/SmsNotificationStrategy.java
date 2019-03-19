package pl.dkolaczynski.patterns.strategy;

public class SmsNotificationStrategy implements NotificationStrategy {

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message via SMS: " + message);
	}

}
