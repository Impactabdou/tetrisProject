package model.plateauPuzzle;
/*
 * Exception to handle piece collisions
 */

public class OutOfMapException extends Exception {
	public OutOfMapException(String message) {
        super(message);
    }
}
