package com.example.demo.exception;

import lombok.Getter;

@Getter
public class  ApplicationException extends RuntimeException {
  private final Errors error;

  public ApplicationException (Errors invalidRequest) {
    super(invalidRequest.getMessage());
    this.error = invalidRequest;
  }

  public Errors getError(){
    return error;
  }

}
