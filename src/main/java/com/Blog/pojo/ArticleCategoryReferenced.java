package com.Blog.pojo;

import java.io.Serializable;

public class ArticleCategoryReferenced implements Serializable {
    private Long acrId;

    private Long articleId;

    private Long categoryId;

    private static final long serialVersionUID = 1L;

    public Long getAcrId() {
        return acrId;
    }

    public void setAcrId(Long acrId) {
        this.acrId = acrId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acrId=").append(acrId);
        sb.append(", articleId=").append(articleId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}