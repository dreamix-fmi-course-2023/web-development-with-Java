package bg.fmi.course.wdwj.dealership.controller.validation;

public class ApiBadRequest extends RuntimeException {

    public ApiBadRequest(String message) {
        super(message);
    }
}
