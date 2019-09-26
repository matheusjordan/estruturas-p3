package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.RemoveFromEmptyListException;
import impl.SequencialList;

class SequencialListTest {
	private SequencialList list;;

	@BeforeEach
	void setUp() throws Exception {
		list = new SequencialList();
	}

	// Adicionar no final
	@Test
	void testAdd() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		assertEquals(4, list.length());
	}
	
	@Test
	void testAddValues() {
		Object[] tempArray = {1, 2, 3, 4};
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		assertArrayEquals(tempArray, list.values());
	}
	
	@Test
	void testAddArrayLength() {
		Object[] tempArray = {1, 2, 3, 4};
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		assertEquals(list.length(), 4);
	}
	
	// Adicionar no inicio
	@Test
	void testAddFirst() {
		list.addFirst(8);
		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(12);
		
		assertEquals(4, list.length());
	}

	@Test
	void testAddFirstValues() {
		Object[] tempArray = {12, 5, 1, 8};
		
		list.addFirst(8);
		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(12);
		
		assertArrayEquals(tempArray, list.values());
	}
	
	@Test
	void testAddFirstLength() {
		Object[] tempArray = {12, 5, 1, 8};
		
		list.addFirst(8);
		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(12);
		
		assertEquals(list.length(), 4);
	}

	// Remoçoes
	@Test
	void testRemoveWithAdd() throws RemoveFromEmptyListException{
		Object[] tempArray = {7, 5};
		
		list.add(7);
		list.add(5);
		list.add(10);
		list.add(22);
		
		list.remove();
		list.remove();
		
		assertArrayEquals(tempArray, list.values());

	}
	
	@Test
	void testRemoveWithAddFirst() throws RemoveFromEmptyListException{
		Object[] tempArray = {22, 10};
		
		list.addFirst(7);
		list.addFirst(5);
		list.addFirst(10);
		list.addFirst(22);
		
		list.remove();
		list.remove();
		
		assertArrayEquals(tempArray, list.values());
	}
	
	@Test
	void testRemoveWithEmptyArray() throws RemoveFromEmptyListException{
		assertThrows(RemoveFromEmptyListException.class, () -> list.remove());
	}

	@Test
	void testRemoveWithAddFirstAndAdd() throws RemoveFromEmptyListException{
		Object[] tempArray = {90, 50, 0, 12, 6};
		
		list.addFirst(0);
		list.add(12);
		list.add(6);
		list.addFirst(50);
		list.addFirst(90);
		
		assertEquals(5, list.length());
		assertArrayEquals(tempArray, list.values());
	}
}
