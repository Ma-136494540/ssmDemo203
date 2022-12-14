package com.example.ssmdemo203.module.sys.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * <p>
 *     权限表实体
 * <p>
 *
 * @author mashunping
 * @since 2022-10-22
 */
@TableName("sys_role")
@Data
public class Role {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String roleName;

    private String roleDesc;

    private Integer status;

    private Integer createUser;

    private Data createTime;

    private Integer updateUser;

    private Data updateTime;

}
