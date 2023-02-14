package com.Blog.controller;

import com.Blog.pojo.Tag;
import com.Blog.pojo.TagExample;
import com.Blog.service.TagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author KuaiMengWei
 * @Version V1.0.0
 * @Date 2023/2/7
 */

@Api(tags = "标签接口")
@RestController
@RequestMapping("/tag")
public class TagContraller {

    private final TagService tagService;

    public TagContraller(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/countByExample")
    @ApiOperation("举例计数")
    public long countByExample(TagExample example){
        tagService.countByExample(example);
        return 0;
    }

    @DeleteMapping("/deleteByExample")
    @ApiOperation("删除例子")
    public int deleteByExample(TagExample example) {
        return 0;
    }

    @DeleteMapping("/deleteByPrimaryKey")
    @ApiOperation("根据ID删除")
    public int deleteByPrimaryKey(Long tagId) {
        return 0;
    }

    @PostMapping("/insert")
    @ApiOperation("增加")
    public int insert(Tag record) {
        return 0;
    }

    public int insertSelective(Tag record) {
        return 0;
    }
    public List<Tag> selectByExample(TagExample example) {
        return null;
    }
    public Tag selectByPrimaryKey(Long tagId) {
        return null;
    }


    public int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example) {
        return 0;
    }

    @PutMapping("/updateByExample")
    @ApiOperation("按示例更新")
    public int updateByExample(@Param("record") Tag record, @Param("example") TagExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Tag record) {
        return 0;
    }


    public int updateByPrimaryKey(Tag record){
        return 0;
    }
}
