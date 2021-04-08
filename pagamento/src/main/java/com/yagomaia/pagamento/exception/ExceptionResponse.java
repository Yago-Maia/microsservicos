package com.yagomaia.pagamento.exception;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = 2396318469213087328L;

    private Date timestamp;
    private String message;
    private String details;
}
