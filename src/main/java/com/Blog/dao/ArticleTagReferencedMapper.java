package com.Blog.dao;

import com.Blog.pojo.ArticleTagReferenced;
import com.Blog.pojo.ArticleTagReferencedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleTagReferencedMapper {
    long countByExample(ArticleTagReferencedExample example);

    int deleteByExample(ArticleTagReferencedExample example);

    int deleteByPrimaryKey(Long atrId);

    int insert(ArticleTagReferenced record);

    int insertSelective(ArticleTagReferenced record);

    List<ArticleTagReferenced> selectByExample(ArticleTagReferencedExample example);

    ArticleTagReferenced selectByPrimaryKey(Long atrId);

    int updateByExampleSelective(@Param("record") ArticleTagReferenced record, @Param("example") ArticleTagReferencedExample example);

    int updateByExample(@Param("record") ArticleTagReferenced record, @Param("example") ArticleTagReferencedExample example);

    int updateByPrimaryKeySelective(ArticleTagReferenced record);

    int updateByPrimaryKey(ArticleTagReferenced record);
}