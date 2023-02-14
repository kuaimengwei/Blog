package com.Blog.dao;

import com.Blog.pojo.ArticleCategoryReferenced;
import com.Blog.pojo.ArticleCategoryReferencedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategoryReferencedMapper {
    long countByExample(ArticleCategoryReferencedExample example);

    int deleteByExample(ArticleCategoryReferencedExample example);

    int deleteByPrimaryKey(Long acrId);

    int insert(ArticleCategoryReferenced record);

    int insertSelective(ArticleCategoryReferenced record);

    List<ArticleCategoryReferenced> selectByExample(ArticleCategoryReferencedExample example);

    ArticleCategoryReferenced selectByPrimaryKey(Long acrId);

    int updateByExampleSelective(@Param("record") ArticleCategoryReferenced record, @Param("example") ArticleCategoryReferencedExample example);

    int updateByExample(@Param("record") ArticleCategoryReferenced record, @Param("example") ArticleCategoryReferencedExample example);

    int updateByPrimaryKeySelective(ArticleCategoryReferenced record);

    int updateByPrimaryKey(ArticleCategoryReferenced record);
}