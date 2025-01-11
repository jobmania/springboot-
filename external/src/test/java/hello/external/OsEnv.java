package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {
    public static void main(String[] args) {
        Map<String, String> envMap = System.getenv();

        for (String key : envMap.keySet()) {
            log.info("env {} = {}", key, System.getenv(key));
        }

        // DB_URL
        // 개발 서버 OS : dev.db.com
        // 운영서버  OS : prod.db.com
        String dburl = System.getenv("DBURL");
    }
}
