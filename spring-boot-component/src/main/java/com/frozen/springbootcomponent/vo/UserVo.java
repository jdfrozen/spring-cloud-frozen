package com.frozen.springbootcomponent.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author: Frozen
 * @create: 2020-02-04 21:01
 * @description:
 **/

@ToString
@Data
public class UserVo {
	private Long id;

	private String name;

	private String phone;

	private String telephone;

	private String address;

	private Boolean enabled;

	private String username;

	private String password;

	private String salt;

	private String userface;

	private String remark;

	private Date createTime;

	private Date updateTime;

}
