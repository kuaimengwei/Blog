package com.Blog.service;

import com.Blog.pojo.ArticleTagReferenced;
import com.Blog.pojo.ArticleTagReferencedExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleTagReferencedService {

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
