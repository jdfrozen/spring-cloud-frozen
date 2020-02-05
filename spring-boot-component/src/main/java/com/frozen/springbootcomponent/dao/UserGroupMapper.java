package com.frozen.springbootcomponent.dao;

import com.frozen.springbootcomponent.po.UserGroup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserGroupMapper {
    int deleteById(Long id);

    void insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectById(Long id);

    int updateByIdSelective(UserGroup record);

    int updateById(UserGroup record);
}
