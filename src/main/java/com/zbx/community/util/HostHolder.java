package com.zbx.community.util;

import com.zbx.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * description: HostHolder <br>
 * date: 2020/4/26 5:02 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

/**
 * 持有用户信息，用于代替session对象
 * 为防止线程冲突，使用ThreadLocal保存信息
 */
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }

}
