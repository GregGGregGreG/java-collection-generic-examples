package generic.interfaces;

public interface IMaxMin<T extends Comparable<?>> {
	public T max();

	public T min();
}
