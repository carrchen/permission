package com.itclub4u.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class TestVo {

    @NotBlank
    private String msg;

    @NotNull(message = "不可以为空")
    @Max(value = 10, message = "id 不能大于10")
    @Min(0)
    private Integer id;

    @NotEmpty
    private List<String> str;
}
