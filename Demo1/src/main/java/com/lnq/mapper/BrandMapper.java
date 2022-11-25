package com.lnq.mapper;


import com.lnq.entity.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {

    /*
    * 查询所有
    * */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /*
    * 添加
    * */
    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /*
    * 根据id查询
    * */
    @Select("select * from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    /*
    * 更新修改数据
    * */
    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered},description = #{description},status = #{status} where id = #{id}")
    @ResultMap("brandResultMap")
    void update(Brand brand);

    /*
    * 删除数据
    * */
    @Delete("delete from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    void deleteById(int id);
}

