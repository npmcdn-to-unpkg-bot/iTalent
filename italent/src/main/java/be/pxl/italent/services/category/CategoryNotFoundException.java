package be.pxl.italent.services.category;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( value = HttpStatus.NOT_FOUND)
public class CategoryNotFoundException extends RuntimeException{
	public CategoryNotFoundException() {
		super();
	}
	
	public CategoryNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writeStackTrace) {
		super(message, cause, enableSuppression, writeStackTrace);
	}
	
	public CategoryNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CategoryNotFoundException(String message) {
		super(message);
	}
	
	public CategoryNotFoundException(Throwable cause) {
		super(cause);
	}
}