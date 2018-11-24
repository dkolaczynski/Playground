package pl.dkolaczynski.patterns.templatemethod;

public abstract class BaseSaver<T> {

	public void save(T entity) {
		validate(entity);
		entity = sanitize(entity);
		// saving logic here
	}

	abstract public T sanitize(T entity);

	abstract public void validate(T entity);

}
