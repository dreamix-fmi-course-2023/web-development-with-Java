package bg.fmi.course.wdwj.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@ConfigurationProperties(prefix = "config")
@Configuration
@Data
public class AppConfig {
    private LoggerConfig logger = new LoggerConfig();

    @Data
    public class LoggerConfig {
        private String levelTest;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private LocalDate myDate;
    }
}