package ManipulationArrayProject;

import java.util.Scanner;

public class User_operation {
	static operationTask task = new operationTask();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Please enter array");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Element " + (i + 1) + "->");
			a[i] = sc.nextInt();
		}
		while (true) {
			System.out.print("\nPLEASE SELECT OPTION--> \n1.Insertion Element \n2.Deletion Element \n3.Updation Element \n4.Sorting Element \n5.Reversing Element \n6.Maximum Element \n7.Minimum Element \n8.Display Array \n9.Searching Element \n10.Verifying Empty Array \n11.Exit\n\n");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("PLEASE! Enter element in array");
				int n = sc.nextInt();
				System.out.println("Enter Position");
				int pos = sc.nextInt();
				a = task.insert(a, pos, n);
				System.out.println(">-INSERTION DONE-<");
				break;
			}
			case 2: {
				System.out.println("PLEASE! Enter element for deletion");
				int n = sc.nextInt();
				a = task.delete(a, n);
				break;
			}
			case 3: {
				System.out.println("PLEASE! Enter  element for updation");
				int old = sc.nextInt();
				System.out.println("PLEASE! Enter new element for updation");
				int n = sc.nextInt();
				task.update(a, n, old);
				break;
			}
			case 4: {
				System.out.println(">-SORTED DONE-<");
				System.out.println("Sorted array ");
				task.sort(a);
				System.out.println();
				break;
			}
			case 5: {
				a = task.reverse(a);
				System.out.println(">-REVERSED DONE-<");
				System.out.println("PRESS:1 to display array");
				int n = sc.nextInt();
				if (n == 1)
					task.display(a);
				break;
			}
			case 6: {
				int max = task.maximum(a);
				System.out.println(">-MAXIMUM ELEMENT FOUND-<");
				System.out.println("PRESS:1 to display element");
				int n = sc.nextInt();
				if (n == 1)
					System.out.println("Maximum Element is " + max);
				break;
			}
			case 7: {
				int min = task.minimum(a);
				System.out.println(">-MINIMUM ELEMENT FOUND-<");
				System.out.println("PRESS:1 to display element");
				int n = sc.nextInt();
				if (n == 1)
					System.out.println("Minimum element is " + min);
				break;
			}
			case 8: {
				System.out.println(">- Array element -< ");
				task.display(a);
				System.out.println();
				break;
			}
			case 9: {
				System.out.println("PLEASE! Enter element for searching");
				int s = sc.nextInt();
				int ind = task.search(a, s);
				if (ind == -1) {
					System.out.println("SORRY! Element Not Found");
				} else {
					System.out.println(s + " is present");
				}
				break;
			}
			case 10: {
				if (task.isEmpty(a)) {
					System.out.println("VERIFIED! Array is empty");
				} else {
					System.out.println("VERIFIED! Aarry is not empty");
					System.out.println("PRESS:1 to display element");
					int n = sc.nextInt();
					if (n == 1)
						task.display(a);
				}
				System.out.println();
				break;
			}
			case 11: {
				System.out.println(">>SUCCESSFULLY TERMINATED<<");
				System.exit(0);;;
			}
			default: {
				System.out.println("SOORY! >- Please Select Valid Option -<");
			}

			}
		}
	}

}
