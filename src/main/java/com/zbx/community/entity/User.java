package com.zbx.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * description: User <br>
 * date: 2020/4/21 19:54 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
