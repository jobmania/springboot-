package hello.boot;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 클래스레벨
@Retention(RetentionPolicy.RUNTIME) // 런타임
@Documented // 문서화
@ComponentScan
public @interface MySpringBootApplication {
}
