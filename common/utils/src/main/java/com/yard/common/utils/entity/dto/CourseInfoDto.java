package com.yard.common.utils.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.yard.common.utils.entity.vo.CourseInfoVo;

@Data
public class CourseInfoDto extends CourseInfoVo {

    @ApiModelProperty(value = "课程id")
    private String id;
}
