package com.zbx.community.dao;

import com.zbx.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description: DiscussPostMapper <br>
 * date: 2020/4/21 20:31 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //动态拼接SQL，参数只有一个并且在<if>里使用，必须添加@Param注解，用于给参数取别名
    int selectDiscussPostRows(@Param("userId") int userId);




}
