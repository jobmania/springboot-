package hello;

import hello.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
//@Import(MyDataSourceValueConfig.class)
//@Import(MyDatasourceConfigV1.class)
@Import(MyDatasourceConfigV3.class)
@SpringBootApplication(scanBasePackages = "hello.datasource") // 컴포넌트 스캔 위치 한정..
//@ConfigurationPropertiesScan({"hello"}) // 범위 지정 가능 !
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
