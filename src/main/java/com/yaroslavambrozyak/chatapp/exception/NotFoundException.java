package com.yaroslavambrozyak.chatapp.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NotFoundException extends RuntimeException {

    private String message;

}
