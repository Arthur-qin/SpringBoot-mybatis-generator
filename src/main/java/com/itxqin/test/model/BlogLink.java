package com.itxqin.test.model;

import javax.persistence.*;

@Table(name = "blog_link")
public class BlogLink {
    /**
     * 链接id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 链接标题
     */
    private String title;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 链接描述
     */
    private String desc;

    private Integer sort;

    /**
     * 获取链接id
     *
     * @return id - 链接id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置链接id
     *
     * @param id 链接id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取链接标题
     *
     * @return title - 链接标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置链接标题
     *
     * @param title 链接标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取链接地址
     *
     * @return url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取链接描述
     *
     * @return desc - 链接描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置链接描述
     *
     * @param desc 链接描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}