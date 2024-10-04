package com.snehit.crud.example.GlobalException;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.snehit.crud.example.entity.exceptionModel;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<exceptionModel> handleSecurityException(Exception exception) {

        // TODO: Send this stack trace to an observability tool
        exception.printStackTrace();

        exceptionModel errorResponse = new exceptionModel("unauth");
        
        if (exception instanceof BadCredentialsException) {
            errorResponse.setExceptionString("Access denied due to bad credentials");
            return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
        }

        if (exception instanceof SignatureException) {
            errorResponse.setExceptionString("The JWT signature is invalid");
            return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
        }

        if (exception instanceof ExpiredJwtException) {
            errorResponse.setExceptionString("Token is expired");
            return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
        }


        // Handle other exceptions or unknown errors
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
