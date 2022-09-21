package com.egiftcard.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoReceivedDetailsFoundException.class)
	public ResponseEntity<ExceptionResponse> handleNoReceivedDetailsFoundException(NoReceivedDetailsFoundException e)
	{
		
		
		ExceptionResponse response=new ExceptionResponse();
		response.setErrorMessage(e.getMessage());
		response.setErrorCode("CONFLICT");
		response.setTimeStamp(LocalDateTime.now());
		ResponseEntity<ExceptionResponse>responseEntity=new ResponseEntity<ExceptionResponse>(response,HttpStatus.CONFLICT);
		return responseEntity;
		
		
		
	}
    @ExceptionHandler(NoRedeemDetailsFoundException.class)
	public ResponseEntity<ExceptionResponse> handleNoRedeemDetailsException(NoRedeemDetailsFoundException e)
	{
		
		
		ExceptionResponse response=new ExceptionResponse();
		response.setErrorMessage(e.getMessage());
		response.setErrorCode("CONFLICT");
		response.setTimeStamp(LocalDateTime.now());
		ResponseEntity<ExceptionResponse>responseEntity=new ResponseEntity<ExceptionResponse>(response,HttpStatus.CONFLICT);
		return responseEntity;
		
		
		
	}
    @ExceptionHandler(InvalidReceiveIdException.class)
   	public ResponseEntity<ExceptionResponse> handleInvalidReceiveIdException(InvalidReceiveIdException e)
   	{
   		
   		
   		ExceptionResponse response=new ExceptionResponse();
   		response.setErrorMessage(e.getMessage());
   		response.setErrorCode("CONFLICT");
   		response.setTimeStamp(LocalDateTime.now());
   		ResponseEntity<ExceptionResponse>responseEntity=new ResponseEntity<ExceptionResponse>(response,HttpStatus.CONFLICT);
   		return responseEntity;
   		
   		
   		
   	}
	
	
	
}
