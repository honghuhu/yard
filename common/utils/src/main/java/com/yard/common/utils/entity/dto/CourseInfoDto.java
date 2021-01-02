package com.yard.common.utils.entity.dto;

import com.yard.common.utils.entity.vo.CourseInfoVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseInfoDto extends CourseInfoVo {

    @ApiModelProperty(value = "课程id")
    private String id;
}
