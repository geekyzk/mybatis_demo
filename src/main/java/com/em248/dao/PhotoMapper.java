package com.em248.dao;

import com.em248.pojo.Photo;

public interface PhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated
     */
    int insert(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated
     */
    int insertSelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated
     */
    Photo selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Photo record);
}