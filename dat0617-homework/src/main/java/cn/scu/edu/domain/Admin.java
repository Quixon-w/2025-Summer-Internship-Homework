package cn.scu.edu.domain;

import lombok.Data;

@Data
public class Admin {
    private Long id;
    private String username;
    private String nickname;
    private String password;
}
