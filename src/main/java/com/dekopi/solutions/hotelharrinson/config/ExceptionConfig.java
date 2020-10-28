package com.dekopi.solutions.hotelharrinson.config;

import com.dekopi.solutions.hotelharrinson.config.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> notFoundException(Exception ex){



        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorInfo> badRequestException(HttpServletRequest request, MethodArgumentNotValidException e) {

        //      Obtener los errores
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();

        //        Convertir error a Standar String

        StringBuilder errorMessage = new StringBuilder();
        fieldErrors.forEach(f-> errorMessage.append(f.getField() + "" + f.getDefaultMessage() + "/"));


        //        Retornar el Error con la informacion  con el Standar Json
        ErrorInfo errorInfo = new ErrorInfo(HttpStatus.BAD_REQUEST.value(),errorMessage.toString().split("/"),request.getRequestURI());
        return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
    }
}
