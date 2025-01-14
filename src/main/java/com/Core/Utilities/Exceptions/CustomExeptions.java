package com.Core.Utilities.Exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class CustomExeptions extends RuntimeException {
    public CustomExeptions(String message) {
        super(message);
    }
}
