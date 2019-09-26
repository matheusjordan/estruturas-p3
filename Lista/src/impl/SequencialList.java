package impl;

import exceptions.RemoveFromEmptyListException;

public class SequencialList {
	private static int FIRST_POSITION = 0;
	
	private Object[] array;
	private int size;
	
	public SequencialList() {
		array = new Object[3];
	}
	
	// Adiciona no fim da lista
	public void add(Object value) {
		if (size == 0) {
			array[FIRST_POSITION] = value;
		} 
		else if (size == array.length) {
			expand();
			array[size] = value;
		} 
		else {
			array[size] = value;
		}
		
		size++;
	}
	
	// Adiciona no começo da lista
	public void addFirst(Object value) {
		if (size > 0) {
			desloc();
		}
		
		array[FIRST_POSITION] = value;
		
		size++;
	}
	
	// Remove no final da lista
	public void remove() throws RemoveFromEmptyListException{
		if (size == 0) {
			throw new RemoveFromEmptyListException();
		}
		
		array[size - 1] = null;
		
		size--;
	}
	
	public Object[] values() {
		Object[] tempList = new Object[size];
		
		for (int i = 0; i < size; i++) {
			tempList[i] = array[i];
		}
		
		return tempList;
	}
	
	public int length() {
		return size;
	}
	
	private void desloc() {
		Object[] tempList = new Object[size + 1];
		
		for (int i = 1; i < tempList.length; i++) {
			tempList[i] = array[i - 1];
		}
		
		array = tempList;
	}
	
	private void expand() {
		Object[] tempList = new Object[array.length * 2];
		
		for (int i = 0; i < size; i ++) {
			tempList[i] = array[i];
		}
		
		array = tempList;
	}
}
