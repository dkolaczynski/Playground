package pl.dkolaczynski.patterns.strategy;

public class NotificationSender {

	private final NotificationStrategy notificationStrategy;

	public NotificationSender(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}

	public void sendOrderNotification(String message) {
		notificationStrategy.sendMessage(message);
	}

}
