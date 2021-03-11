package com.yagomaia.crud.exception;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable {
    private static final long serialVersionUID = -4449979789937146477L;

    private Date timestamp;
    private String message;
    private String details;
}
