package com.org.tigerapps.blastinet;

import java.util.Date;

public class Comments {
    private int id;
    private long post_ID;
    private String author;
    private String author_email;
    private String url;
    private String author_ip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPost_ID() {
        return post_ID;
    }

    public void setPost_ID(long post_ID) {
        this.post_ID = post_ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor_ip() {
        return author_ip;
    }

    public void setAuthor_ip(String author_ip) {
        this.author_ip = author_ip;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate_gmt() {
        return date_gmt;
    }

    public void setDate_gmt(Date date_gmt) {
        this.date_gmt = date_gmt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getKarma() {
        return karma;
    }

    public void setKarma(long karma) {
        this.karma = karma;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    private Date date;
    private Date date_gmt;
    private String content;
    private long karma;
    private String approved;
    private String type;
    private long parent;
    private long user_id;
}
