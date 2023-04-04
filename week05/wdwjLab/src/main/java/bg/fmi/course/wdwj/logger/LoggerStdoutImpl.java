package bg.fmi.course.wdwj.logger;

import bg.fmi.course.wdwj.config.AppConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("local")
@Component
public class LoggerStdoutImpl implements Logger {

    @Value("${config.logger.name}")
    List<String> names;


    private final AppConfig appConfig;

    private LoggerLevel loggerLevel;

    @Autowired
    public LoggerStdoutImpl(AppConfig appConfig) {
        this.appConfig = appConfig;
    }


    @PostConstruct
    private void initLogLevel() {
        System.out.println(">>>>>>> appConfig.getLogger().getLevel() -> " + appConfig.getLogger().getLevel());
        loggerLevel = LoggerLevel.valueOf(appConfig.getLogger().getLevel());

        names.stream().forEach(System.out::println);
    }


    @Override
    public void info(Object toLog) {
        System.out.println(toLog);
    }

    @Override
    public void debug(Object toLog) {
        if (loggerLevel.getCode().compareTo(LoggerLevel.DEBUG.getCode()) >= 0) {
            System.out.println(toLog);
        }
    }

    @Override
    public void trace(Object toLog) {
        if (loggerLevel.getCode().compareTo(LoggerLevel.TRACE.getCode()) >= 0) {
            System.out.println(toLog);
        }
    }

    @Override
    public void error(Object toLog) {
        System.out.println(toLog);
    }
}
