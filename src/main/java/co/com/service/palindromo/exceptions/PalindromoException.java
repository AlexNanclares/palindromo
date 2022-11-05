package co.com.service.palindromo.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class PalindromoException extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public PalindromoException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
