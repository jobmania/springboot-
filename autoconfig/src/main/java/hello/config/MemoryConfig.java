package hello.config;

import memory.MemoryController;
import memory.MemoryFinder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Conditional(MemoryCondition.class) // MemoryCondition 체크 true 등록 or false 등록하지 않음.
@ConditionalOnProperty(name = "memory", havingValue = "on") // 위 기능과 동일!
public class MemoryConfig {

    @Bean
    public MemoryController memoryController() {

        return new MemoryController(memoryFinder());
    }

    @Bean
    public MemoryFinder memoryFinder(){
        return new MemoryFinder();
    }
}
