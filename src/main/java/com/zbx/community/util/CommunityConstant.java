package com.zbx.community.util;

/**
 * description: CommunityConstant <br>
 * date: 2020/4/22 10:46 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */
public interface CommunityConstant {

    /**
     * 激活成功
     */
    final static int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    final static int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    final static int ACTIVATION_FAILURE = 2;

    /**
     * 默认状态的登录凭证的超时时间
     */
    final static int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /**
     * 记住状态的登录凭证超时时间
     */
    final static int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;
}
