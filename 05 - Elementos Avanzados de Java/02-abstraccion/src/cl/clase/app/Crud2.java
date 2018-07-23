package cl.clase.app;

public interface Crud2<T> {

	public void create(T objeto);
	public T read(T objeto);
	public void update(T objeto);
	public void delete(T objeto);
	//public int conteo(int valor);
	//public int calculo(int valor);
}
