package com.lwl.cj.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListContainer {

	private List<String> list;
	
	public ArrayListContainer() {
		this.list = new ArrayList<String>();
	}

	public void addElement(String ele) {
		list.add(ele);
		System.out.println("Element is added successfully");
	}

	public void deleteElement(String ele) {
		if(list.indexOf(ele)!=-1) {
			list.remove(ele);
			System.out.println("Element removed successfully");
		}else {
			System.out.println("Element is not found, it couldn't be deleted");
		}
	}

	public int searchElement(String ele) {
		return list.indexOf(ele);
	}

	public void showElements() {
		System.out.println(list.toString());
	}

}

public class CollectionImpl {
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
