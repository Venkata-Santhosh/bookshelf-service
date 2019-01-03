package com.cox.exceptions.handlers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cox.exceptions.BookShelfNotFoundException;

@ControllerAdvice
public class BookShelfResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	public BookShelfResponseEntityExceptionHandler() {
		super();
	}
	
	@ExceptionHandler({ BookShelfNotFoundException.class })
    public ResponseEntity<Object> handleBadRequest(final BookShelfNotFoundException ex, final WebRequest request) {
        final String bodyOfResponse = "This should be application specific";
        BookShelfServiceError bookShelfServiceError = new BookShelfServiceError(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), bodyOfResponse);
        
        return handleExceptionInternal(ex, bookShelfServiceError, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}

class BookShelfServiceError {
	private HttpStatus status;
    private String message;
    private List<String> errors;
    
    public BookShelfServiceError() {
    
    }

	public BookShelfServiceError(HttpStatus status, String message, List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}
	
	public BookShelfServiceError(HttpStatus status, String message, String error) {
		super();
		this.status = status;
		this.message = message;
		this.errors = Arrays.asList(error);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
}
