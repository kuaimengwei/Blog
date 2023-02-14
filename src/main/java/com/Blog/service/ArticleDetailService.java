package com.Blog.service;

import com.Blog.pojo.ArticleDetail;
import com.Blog.pojo.ArticleDetailExample;
import com.Blog.pojo.ArticleDetailWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleDetailService {

    long countByExample(ArticleDetailExample example);

    int deleteByExample(ArticleDetailExample example);

    int deleteByPrimaryKey(Long articleDetailId);

    int insert(ArticleDetailWithBLOBs record);

    int insertSelective(ArticleDetailWithBLOBs record);

    List<ArticleDetailWithBLOBs> selectByExampleWithBLOBs(ArticleDetailExample example);

    List<ArticleDetail> selectByExample(ArticleDetailExample example);

    ArticleDetailWithBLOBs selectByPrimaryKey(Long articleDetailId);

    int updateByExampleSelective(@Param("record") ArticleDetailWithBLOBs record, @Param("example") ArticleDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleDetailWithBLOBs record, @Param("example") ArticleDetailExample example);

    int updateByExample(@Param("record") ArticleDetail record, @Param("example") ArticleDetailExample example);

    int updateByPrimaryKeySelective(ArticleDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleDetailWithBLOBs record);

    int updateByPrimaryKey(ArticleDetail record);
}
