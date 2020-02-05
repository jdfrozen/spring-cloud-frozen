package com.frozen.springbootcomponent.dao;

import com.frozen.springbootcomponent.po.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {
    int insert(Menu record);

    int delete(@Param("id") Long id);

    int update(@Param("pojo") Menu menu);

    Menu getById(@Param("id") long id);

    List<Menu> list(@Param("pojo") Menu menu);

    List<Menu> getAllMenu();

    List<Menu> listByIds(@Param("ids") List<Long> ids);
}
