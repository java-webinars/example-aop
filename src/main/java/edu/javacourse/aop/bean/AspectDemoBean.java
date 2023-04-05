package edu.javacourse.aop.bean;

import org.springframework.stereotype.Component;

@Component
public class AspectDemoBean
{
    public void methodOne() {
        System.out.println("We are calling method ONE");
    }

    public void methodTwo() {
        System.out.println("We are calling method TWO");
    }
}
