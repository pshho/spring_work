package inter;

import java.util.List;

public interface Quick<T> {
	default void quickDistinct(int left, int right, List<T> arrays) {
		if(left > right) {
			return;
		}
		int pivot = left;
		int lefts = pivot+1;
		int rights = right;
		
		while(lefts <= rights) {
			while(lefts<=rights && compare(arrays.get(pivot), arrays.get(lefts)) >= 0) {
				lefts++;
			}
			
			while(lefts<=rights && compare(arrays.get(pivot), arrays.get(rights)) <= 0) {
				rights--;
			}
			
			if(lefts < rights) {
				T temp = arrays.get(lefts);
				arrays.set(lefts, arrays.get(rights));
				arrays.set(rights, temp);
			}
		}
		
		T temp = arrays.get(pivot);
		arrays.set(pivot, arrays.get(rights));
		arrays.set(rights, temp);
		
		quickDistinct(left, rights-1, arrays);
		quickDistinct(rights+1, right, arrays);
	}
	
	int compare(T o1, T o2);
}
