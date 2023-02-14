package com.Blog.pojo;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Long articleId;

    private Date pushData;

    private String articleUser;

    private String title;

    private Integer likeCount;

    private Integer commentCount;

    private Integer readCount;

    private String topFlag;

    private Date createTime;

    private String articleSummary;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Date getPushData() {
        return pushData;
    }

    public void setPushData(Date pushData) {
        this.pushData = pushData;
    }

    public String getArticleUser() {
        return articleUser;
    }

    public void setArticleUser(String articleUser) {
        this.articleUser = articleUser == null ? null : articleUser.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getTopFlag() {
        return topFlag;
    }

    public void setTopFlag(String topFlag) {
        this.topFlag = topFlag == null ? null : topFlag.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary == null ? null : articleSummary.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", pushData=").append(pushData);
        sb.append(", articleUser=").append(articleUser);
        sb.append(", title=").append(title);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", topFlag=").append(topFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", articleSummary=").append(articleSummary);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}