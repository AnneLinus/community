package com.zbx.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * description: AlphaConfig <br>
 * date: 2020/4/21 18:13 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
