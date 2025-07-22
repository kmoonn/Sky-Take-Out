package fun.kmoon.dto;

import lombok.Data;

@Data
public class EmployeeLoginDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
