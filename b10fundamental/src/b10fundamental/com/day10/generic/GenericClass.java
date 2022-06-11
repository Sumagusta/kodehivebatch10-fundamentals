package b10fundamental.com.day10.generic;

public class GenericClass<T> {
	
	T obj; // obj global
	
	public GenericClass(T obj){ // obj param local
		this.obj = obj;
	}
	
	public T getGeneric() {
		return obj;
	}
	
}
