package com.zbx.community.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import static org.junit.jupiter.api.Assertions.*;

/**
 * description: MailClientTest <br>
 * date: 2020/4/22 8:05 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

@SpringBootTest
class MailClientTest {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    void sendMail() {
        mailClient.sendMail("aa821367967@outlook.com", "TEST", "Send mail test");
    }

    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "Anne");

        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("aa821367967@outlook.com", "TEST html", content);
    }
}