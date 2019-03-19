package pl.dkolaczynski.patterns.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.notificationType = NotificationType.EMAIL;

		NotificationStrategy notificationStrategy = determineNotificationStrategy(customer);
		NotificationSender notificationSender = new NotificationSender(notificationStrategy);
		notificationSender.sendOrderNotification("Your order has been shipped");
	}

	private static NotificationStrategy determineNotificationStrategy(Customer customer) {
		if (customer.notificationType == null) {
			throw new RuntimeException("No notification type specified");
		}

		switch (customer.notificationType) {
			case EMAIL:
				return new MailNotificationStrategy();
			case SMS:
				return new SmsNotificationStrategy();
			default:
				throw new RuntimeException("Notification type not supported: " + customer.notificationType);
		}
	}

	enum NotificationType {
		EMAIL, SMS
	}

	static class Customer {
		NotificationType notificationType;
	}

}
