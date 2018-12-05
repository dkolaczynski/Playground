package pl.dkolaczynski.patterns.observer;

public interface Observable<T> {

	void addObserver(Observer<T> observer);

	void removeObserver(Observer<T> observer);

	void notify(T data);
}
