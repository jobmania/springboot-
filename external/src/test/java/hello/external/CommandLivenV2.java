package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

@Slf4j
public class CommandLivenV2 {

    // --url=devdb --username=dev_user --password=dev_pw mode=on
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);

        }

        // 스프링 파싱
        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs = {}", List.of(appArgs.getSourceArgs()));
        log.info("NonOptionsArgs ={}", appArgs.getNonOptionArgs()); // -- 안들어간 데이터
        log.info("OptionsArgs ={}", appArgs.getOptionNames()); // -- 들어간 데이터


        Set<String> optionNames = appArgs.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option arge {} = {}", optionName, appArgs.getOptionValues(optionName));
        }


        List<String> url = appArgs.getOptionValues("url");
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");

        log.info("url = {}, username = {}, password = {}", url, username, password); // 출력 o
        log.info("mode = {}", mode); // 출력 x

    }
}
