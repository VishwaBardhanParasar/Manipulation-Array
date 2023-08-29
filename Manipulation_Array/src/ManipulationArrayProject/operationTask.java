package ManipulationArrayProject;

public class operationTask {

	public int[] insert(int[] a, int pos, int new_ele) {
		if (pos <= 0 || pos > a.length + 1) {
			System.out.println("Insertion not possible");
			return a;
		} else {
			int res[] = new int[a.length + 1];
			for (int i = 0, j = 0; i < res.length; i++) {
				if (i == (pos - 1)) {
					res[i] = new_ele;
				} else {
					res[i] = a[j++];
				}
			}
			return res;

		}

	}

	public int[] delete(int a[], int del) {
		int ind = search(a, del);
		if (ind == -1) {
			System.out.println("Deletion not possible");
			return a;
		} else {
			int res[] = new int[a.length - 1];
			for (int i = 0, j = 0; i < a.length; i++) {
				if (i != ind) {
					res[j++] = a[i];
				}
			}
			System.out.println(">-DELETION DONE-<");
			return res;
		}
	}

	public void update(int a[], int new_ele, int old_ele) {
		if (search(a, old_ele) == -1) {
			System.out.println("Updation is not possible");
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == old_ele) {
					a[i] = new_ele;
				}
			}
			System.out.println(">-UPDATION DONE-<");
		}
	}

	public void sort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public int search(int a[], int ele) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				return i;
			}
		}
		return -1;
	}

	public void display(int a[]) {
		for (int i : a)
			System.out.print(i + " ");

	}

	public int maximum(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int minimum(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public boolean isEmpty(int a[]) {
		if (a.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int[] reverse(int a[]) {
		int rev[] = new int[a.length];
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			rev[j] = a[i];
		}
		return rev;
	}

}
