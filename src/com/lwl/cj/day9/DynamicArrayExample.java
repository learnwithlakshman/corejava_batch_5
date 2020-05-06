package com.lwl.cj.day9;

import java.util.Scanner;

class ArrayContainer {

	private String[] arr;
	int count = 0;

	public ArrayContainer() {
		this.arr = new String[3];
	}

	public void addElement(String ele) {
		if (count == arr.length) {
			String temp[] = new String[count + 3];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			this.arr = temp;
		}
		arr[count++] = ele;
		System.out.println("Element is added successfully");
	}

	public void deleteElement(String ele) {

	}

	public int searchElement(String ele) {
		for (int i = 0; i < count; i++) {
			if (arr[i].equals(ele)) {
				return i;
			}
		}
		return -1;
	}

	public void showElements() {

		if (count == 0) {
			System.out.println("[]");
		} else {
			StringBuffer sb = new StringBuffer("[");
			for (int i = 0; i < count; i++) {
				if (i < count - 1) {
					sb.append(arr[i] + ", ");
				} else {
					sb.append(arr[i]);
				}
			}
			sb.append("]");
			System.out.println(sb.toString());
		}
	}

}

public class DynamicArrayExample {
	public static void main(String[] args) {
		ArrayContainer obj = new ArrayContainer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Add 2.Delete 3.Search 4.Show 5.Exit");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter the name to add:");
				String name = sc.nextLine();
				obj.addElement(name);
				break;
			case 2:
				break;
			case 3:
				System.out.println("Enter the name to search:");
				String sname = sc.nextLine();
				int index = obj.searchElement(sname);
				if(index!= -1) {
					System.out.println(sname + " found at location :"+index);
				}else {
					System.out.println("Element is not found");
				}
				break;
			case 4:
				obj.showElements();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Please enter valid input 1- 5 only");
			}
		}
	}
}
