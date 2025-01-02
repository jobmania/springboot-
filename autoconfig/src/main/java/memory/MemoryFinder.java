package memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemoryFinder {
    public Memory get() {
        // JMV 실시간 메모리 조회
        long max = Runtime.getRuntime().maxMemory();// 확보할 수 있는 맥스 메모리
        long total = Runtime.getRuntime().totalMemory();// 확보한 총 메모리
        long free = Runtime.getRuntime().freeMemory();// 프리 메모리
        long used = total - free;
        return new Memory(used, max);
    }


    @PostConstruct
    public void init() {
        log.info("init memoryFinder");
    }
}
