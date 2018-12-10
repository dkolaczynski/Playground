package pl.dkolaczynski.patterns.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Observable<T> {

	private final List<Observer<T>> observers;

	public Observable() {
		this.observers = new CopyOnWriteArrayList<>();
	}

	public void addObserver(Observer<T> observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer<T> observer) {
		observers.remove(observer);
	}

	public void notify(T data) {
		observers.forEach(o -> o.update(data));
	}

}
