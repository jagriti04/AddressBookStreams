package com.bl.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdressBookManage {
	
	private Map<String, AddressBook> nameToAddressBookMap;
	
	public AdressBookManage( ) {
		nameToAddressBookMap = new HashMap<>();
	}
	
	public void addAddressBook(String addBookName, AddressBook addBook) {
		nameToAddressBookMap.put(addBookName, addBook);
	}
	public void createAddBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of address books to create");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i< num ; i++) {
			int serialNo = i+1;
			System.out.println("Enter the name of add. book num. " + serialNo);
			String aBookName = sc.nextLine();
			AddressBook addBookObj = new AddressBook();
			addBookObj = addBookObj.addressBookOption();
			addAddressBook(aBookName, addBookObj);
		}
	}
	public void viewAddBooks() {
		for(int i=0; i< nameToAddressBookMap.size(); i++) {
			System.out.println(i + "Name of add. book are : "+ nameToAddressBookMap);
		}
	}
	public static void main(String[] args) {
		System.out.println("welcome and create address books ");
		AdressBookManage addBookManage = new AdressBookManage();
		addBookManage.createAddBooks();
		System.out.println("Successfully created address books");
		addBookManage.viewAddBooks();
//		addBookManage.addAddressBook(addBookObj, "firstAddBook");
		
	}
}