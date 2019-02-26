package com.example.ant.test.entity;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-02-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Ttt implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    private String name;

}
