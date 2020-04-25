package com.zbx.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * description: LoginTicket <br>
 * date: 2020/4/25 9:55 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

@Data
public class LoginTicket {

    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;
}
