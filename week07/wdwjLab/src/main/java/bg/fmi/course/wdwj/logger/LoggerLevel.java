package bg.fmi.course.wdwj.logger;

public enum LoggerLevel {

    INFO(1, "INFO"),
    DEBUG(2, "DEBUG"),
    TRACE(3, "TRACE"),
    ERROR(0, "ERROR");

    private final Integer code;
    public final String label;

    @Override
    public String toString() {
        return "LoggerLevel{" +
                "code=" + code +
                ", label='" + label + '\'' +
                '}';
    }

    LoggerLevel(Integer code, String label) {
        this.code = code;
        this.label = label;
    }

    public Integer getCode() {
        return code;
    }

    public final String getLabel() {
        return label;
    }

}
