package quickclass;

import inter.Quick;

public class QuickClass<T> implements Quick<T> {

	@Override
	public int compare(T o1, T o2) {
		return (int)o1 - (int)o2;
	}

}
