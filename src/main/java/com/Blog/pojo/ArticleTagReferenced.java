package com.Blog.pojo;

import java.io.Serializable;

public class ArticleTagReferenced implements Serializable {
    private Long atrId;

    private Long articleId;

    private Long tagId;

    private static final long serialVersionUID = 1L;

    public Long getAtrId() {
        return atrId;
    }

    public void setAtrId(Long atrId) {
        this.atrId = atrId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", atrId=").append(atrId);
        sb.append(", articleId=").append(articleId);
        sb.append(", tagId=").append(tagId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}