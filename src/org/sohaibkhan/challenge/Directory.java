package org.sohaibkhan.challenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Directory implements List<Person> {
	private ArrayList<Person> all_contacts = new ArrayList<Person>();
	private static Directory instance;
	
	public static Directory getInstance() {
		if(instance == null)
			instance = new Directory();
		return instance;
	}
	
//	private Directory(Person e) {
//		Directory.all_contacts.add(e);
//	}
	
	@Override
	public boolean add(Person e) {
		all_contacts.add(e);
		return true;
	}

	@Override
	public String toString() {
		for (Person person : all_contacts) {
			System.out.println(person);
			System.out.println('\n');
		}
		return "";
	}

	public boolean remove(String name) {
		boolean has_found = false;
		for (Person person : all_contacts) {
			if (person.getName().toLowerCase().contentEquals(name.toLowerCase())) {
				all_contacts.remove(person);
				has_found = true;
				break;
			}
		}
		return has_found;
	}
	
	public boolean search(String name) {
		boolean has_found = false;
		for (Person person : all_contacts) {
			if (person.getName().toLowerCase().contentEquals(name.toLowerCase())) {
				System.out.println(person);
				has_found = true;
				break;
			}
		}
		return has_found;
	}

	@Override
	public boolean isEmpty() {
		return all_contacts.isEmpty();
	}
	
	@Override
	public boolean contains(Object o) {

		return false;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public Iterator<Person> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Person> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Person> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Person get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person set(int index, Person element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Person element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Person> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Person> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
