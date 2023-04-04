package bg.fmi.course.wdwj.logger;

import bg.fmi.course.wdwj.config.AppConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@Profile("dev")
@Component
public class LoggerFileImpl implements Logger {

    private final AppConfig appConfig;

    private LoggerLevel loggerLevel;

    @Autowired
    public LoggerFileImpl(AppConfig appConfig) {
        this.appConfig = appConfig;
    }


    @PostConstruct
    private void initLogLevel() {
        System.out.println(">>>>>>> appConfig.getLogger().getLevel() -> " + appConfig.getLogger().getLevel());
        loggerLevel = LoggerLevel.valueOf(appConfig.getLogger().getLevel());
    }

    @Override
    public void info(Object toLog) {
        logInformation(toLog, LoggerLevel.INFO);
    }

    @Override
    public void debug(Object toLog) {
        if (loggerLevel.getCode().compareTo(LoggerLevel.DEBUG.getCode()) >= 0) {
            logInformation(toLog, LoggerLevel.DEBUG);
        }
    }

    @Override
    public void trace(Object toLog) {
        if (loggerLevel.getCode().compareTo(LoggerLevel.TRACE.getCode()) >= 0) {
            logInformation(toLog, LoggerLevel.TRACE);
        }
    }

    @Override
    public void error(Object toLog) {
        logInformation(toLog, LoggerLevel.ERROR);
    }

    private void logInformation(Object toLog, LoggerLevel currentLoggerLevel) {
        File log = new File("log.txt");
        try (PrintWriter out = new PrintWriter(new FileWriter(log, true))) {
            out.println(new Date() + " [" + currentLoggerLevel.getLabel() + "] - " + toLog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
