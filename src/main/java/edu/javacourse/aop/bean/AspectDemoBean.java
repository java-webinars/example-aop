package edu.javacourse.aop.bean;

import org.springframework.stereotype.Component;

@Component
public class AspectDemoBean
{
    public String methodOne(String comment) {
        System.out.println("We are calling method ONE");
        if("EXCEPTION".equalsIgnoreCase(comment)) {
            throw new RuntimeException("Error for message " + comment);
        }
        return "Hello " + comment;
    }

    public void methodTwo() {
        System.out.println("We are calling method TWO");
    }
}
