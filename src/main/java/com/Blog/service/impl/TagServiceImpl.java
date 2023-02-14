package com.Blog.service.impl;

import com.Blog.pojo.Tag;
import com.Blog.pojo.TagExample;
import com.Blog.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2023/2/8
 */
@Service
public class TagServiceImpl implements TagService {

    @Override
    public long countByExample(TagExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TagExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long tagId) {
        return 0;
    }

    @Override
    public int insert(Tag record) {
        return 0;
    }

    @Override
    public int insertSelective(Tag record) {
        return 0;
    }

    @Override
    public List<Tag> selectByExample(TagExample example) {
        return null;
    }

    @Override
    public Tag selectByPrimaryKey(Long tagId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Tag record, TagExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Tag record, TagExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Tag record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Tag record) {
        return 0;
    }
}
