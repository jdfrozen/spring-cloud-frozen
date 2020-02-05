package com.frozen.springbootcomponent.dao;

import com.frozen.springbootcomponent.po.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    int insert(UserRole record);

    int delete(@Param("id") Long id);

    List<UserRole> getByUserId(@Param("userId") long userId);

    List<UserRole> getByRoleId(@Param("roleId") long roleId);

    int deleteByUserId(@Param("userId") long userId);

    int deleteByRoleId(@Param("roleId") long roleId);

}
