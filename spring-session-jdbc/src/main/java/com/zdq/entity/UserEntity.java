package com.zdq.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class UserEntity implements Serializable {
    private Integer id;
    private String username;
    private String password;


}
