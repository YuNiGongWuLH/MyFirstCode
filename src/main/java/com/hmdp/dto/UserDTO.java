package com.hmdp.dto;

import lombok.Data;
//这是Lombok的用法
@Data
public class UserDTO {
    private long id;
    private String nickName;
    private String icon;
}
