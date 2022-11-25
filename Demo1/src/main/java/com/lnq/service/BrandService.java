package com.lnq.service;

import com.lnq.entity.Brand;

import java.util.List;

public interface BrandService {
    /**
     * 查询所有
     * @return
     */
    public List<Brand> selectAll();

    /**
     * 添加
     * @param brand
     */
    public void add(Brand brand);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Brand selectById(int id);

    /**
     * 修改
     * @param brand
     */
    public void update(Brand brand);

    /**
     * 根据id删除
     * @param id
     */
    public void deleteById(int id);
}
