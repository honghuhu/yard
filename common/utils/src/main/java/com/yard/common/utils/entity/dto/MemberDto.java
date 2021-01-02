package com.yard.common.utils.entity.dto;

import com.yard.common.utils.entity.BaseDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author 007
 * @since 2020-04-11
 */
@Data
public class MemberDto extends BaseDto {

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "性别 1 女，2 男")
    private Integer sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "用户头像")
    private String avatar;
}
