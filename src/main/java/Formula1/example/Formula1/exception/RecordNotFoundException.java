package Formula1.example.Formula1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException(String message) {
        super(message);
    }
}
