package com.example.springbootproject.Aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* com.example.springbootproject.service.BlocService.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In Methooood " + name + " : ");
    }

    @After("execution(* com.example.springbootproject.service.BlocService.*(..))")
    public void logMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method after  " + name + " : ");
    }

    @AfterReturning("execution(* com.example.springbootproject.service.BlocService.*(..))")
    public void logMethodAfterReturning(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method AfterReturning " + name + " : ");
    }

    @AfterThrowing ("execution(* com.example.springbootproject.service.BlocService.*(..))")
    public void AfterThrowingReturning(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method AfterThrowing " + name + " : ");
    }



}

