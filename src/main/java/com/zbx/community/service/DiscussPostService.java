package com.zbx.community.service;

import com.zbx.community.dao.DiscussPostMapper;
import com.zbx.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: DiscussPostSevice <br>
 * date: 2020/4/21 20:48 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;



    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
