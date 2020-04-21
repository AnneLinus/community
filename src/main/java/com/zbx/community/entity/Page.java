package com.zbx.community.entity;

/**
 * description: Page <br>
 * date: 2020/4/21 21:18 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

import lombok.Data;

/**
 * 封装分页相关信息
 */

public class Page {

    //当前页码
    private int current = 1;

    //显示上限
    private int limit = 10;

    //数据总数（用于计算总页数）
    private int rows;

    //查询路径（用于复用分页连接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     * @return
     */
    public int getOffset() {
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal() {
        // rows / limit
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     * 获取起始页数
     * @return
     */
    public int getForm() {
        int form = current - 2;
        return form < 1 ? 1 : form;
    }


    /**
     * 获取结束页
     * @return
     */
    public int getTo() {
        int to = current + 2;
        int total = this.getTotal();
        return to > total ? total : to;
    }
}
