package sorts;

public class Quick {
	
	public Quick(){}
	
	// 퀵정렬 - 정렬할 값을 통해 오름차순, 내림차순 가능 현재 오름차순
	public void quickDistinct(int left, int right, int[] arrays) {
		if(left >= right) {
			return;
		}
		int pivot = left;
		int lefts = pivot+1;
		int rights = right;
		
		while(lefts <= rights) { // 비교하는 값을 작은 쪽으로 퀵정렬하면 오름차순, 큰 쪽으로 퀵정렬하면 내림차순
			while(lefts<=rights && arrays[pivot] >= arrays[lefts]) {
				lefts++;
			}
			
			while(lefts<=rights && arrays[pivot] <= arrays[rights]) {
				rights--;
			}
			
			if(lefts < rights) {
				int temp = arrays[lefts];
				arrays[lefts] = arrays[rights];
				arrays[rights] = temp;
			}
		}
		
		int temp = arrays[pivot];
		arrays[pivot] = arrays[rights];
		arrays[rights] = temp;
		
		quickDistinct(left, rights-1, arrays);
		quickDistinct(rights+1, right, arrays);
	}
}