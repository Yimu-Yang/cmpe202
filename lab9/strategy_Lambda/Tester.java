package strategy;

public class Tester {

	public static void main(String[] args) {
		DataSet dataset = new DataSet();
		dataset.display();
		dataset.doSort();
		dataset.display();
		dataset.resetData();
		dataset.display();

		SortingStrategy mergeSort = (int a[]) -> {
			mergesort(a, 0, a.length - 1);
		};

		dataset.changeStrategy(mergeSort);
		dataset.doSort();
		dataset.display();
		dataset.resetData();
		dataset.display();

		SortingStrategy quickSort = (int a[]) -> {
			quicksort(a, 0, a.length - 1);
		};

		dataset.changeStrategy(quickSort);
		dataset.doSort();
		dataset.display();
	}

	private static void mergesort(int a[], int lo0, int hi0) throws Exception {
		int lo = lo0;
		int hi = hi0;

		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;

		mergesort(a, lo, mid);
		mergesort(a, mid + 1, hi);

		int end_lo = mid;
		int start_hi = mid + 1;
		while ((lo <= end_lo) && (start_hi <= hi)) {
			if (a[lo] < a[start_hi]) {
				lo++;
			} else {
				int T = a[start_hi];
				for (int k = start_hi - 1; k >= lo; k--) {
					a[k + 1] = a[k];
				}
				a[lo] = T;
				lo++;
				end_lo++;
				start_hi++;
			}
		}
	}

	private static void quicksort(int a[], int lo0, int hi0) throws Exception {
		int lo = lo0;
		int hi = hi0;
		if (lo >= hi) {
			return;
		} else if (lo == hi - 1) {
			if (a[lo] > a[hi]) {
				int T = a[lo];
				a[lo] = a[hi];
				a[hi] = T;
			}
			return;
		}

		int pivot = a[(lo + hi) / 2];
		a[(lo + hi) / 2] = a[hi];
		a[hi] = pivot;

		while (lo < hi) {

			while (a[lo] <= pivot && lo < hi) {
				lo++;
			}

			while (pivot <= a[hi] && lo < hi) {
				hi--;
			}

			if (lo < hi) {
				int T = a[lo];
				a[lo] = a[hi];
				a[hi] = T;
			}

		}

		a[hi0] = a[hi];
		a[hi] = pivot;

		quicksort(a, lo0, lo - 1);
		quicksort(a, hi + 1, hi0);
	}

}
