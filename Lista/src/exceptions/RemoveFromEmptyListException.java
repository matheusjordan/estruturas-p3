package exceptions;

public class RemoveFromEmptyListException extends Exception{
	
	public RemoveFromEmptyListException() {
		super("impossivel remover elemento de uma lista vazia!");
	}
}
