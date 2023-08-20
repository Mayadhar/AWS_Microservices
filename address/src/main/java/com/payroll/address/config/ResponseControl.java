package com.payroll.address.config;

import java.util.List;

public class ResponseControl<T> {
    private String id;
    private T response;
    private List<Error> errors;

    public ResponseControl(String id, T response, List<Error> errors) {
        this.id = id;
        this.response = response;
        this.errors = errors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}

