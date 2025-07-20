package fun.kmoon.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    private String name;

    private String username;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;

    private String status;
}
