package com.insilicogen.kioskproject.layer.application.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingAspect {

    // 포인트컷 정의: 서비스 레이어의 모든 메서드에 적용
    @Pointcut("execution(* com.insilicogen.kioskproject.layer.application.service.*.*(..))")
    public void serviceLayerPointcut() {}

    @Before("serviceLayerPointcut()")
    public void logBeforeMethodCall(JoinPoint joinPoint) {
        log.info("서비스 레이어 메서드 호출: {}", joinPoint.getSignature());
    }

    @After("serviceLayerPointcut()")
    public void logAfterMethodCall(JoinPoint joinPoint) {
        log.info("서비스 레이어 메서드 호출 끝: {}", joinPoint.getSignature());
    }
}
