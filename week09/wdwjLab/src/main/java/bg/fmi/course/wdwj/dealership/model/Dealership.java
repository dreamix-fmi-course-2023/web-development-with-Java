package bg.fmi.course.wdwj.dealership.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dealership {
    private Integer dealershipId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
}

