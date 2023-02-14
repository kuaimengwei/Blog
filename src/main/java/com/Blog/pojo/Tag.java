package com.Blog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Tag implements Serializable {
    @ApiModelProperty(value="标签id",name="tagId")
    private Long tagId;

    @ApiModelProperty(value = "标签名称",name ="tagName")
    private String tagName;

    @ApiModelProperty(value = "标签别名",name ="aliasName")
    private String aliasName;

    @ApiModelProperty(value = "标签描述",name ="description")
    private String description;

    @ApiModelProperty(value = "创建时间",name = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    private static final long serialVersionUID = 1L;


}