package com.example.springlog.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    private String message;

    public DemoBean(){
        this.message = "This is demo bean!";
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return "DemoBean [message=" + message + "]";
    }
}
