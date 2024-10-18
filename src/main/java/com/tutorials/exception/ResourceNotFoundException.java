package com.tutorials.exception;

public class ResourceNotFoundException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
        super("This user is not available in your database..");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }

}
