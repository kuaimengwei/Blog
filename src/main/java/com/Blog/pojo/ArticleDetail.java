package com.Blog.pojo;

import java.io.Serializable;

public class ArticleDetail implements Serializable {
    private Long articleDetailId;

    private Long articleId;

    private static final long serialVersionUID = 1L;

    public Long getArticleDetailId() {
        return articleDetailId;
    }

    public void setArticleDetailId(Long articleDetailId) {
        this.articleDetailId = articleDetailId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleDetailId=").append(articleDetailId);
        sb.append(", articleId=").append(articleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}