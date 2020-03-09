package com.example.demo.dao;

import com.example.demo.domain.Permission;
import com.example.demo.domain.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    long countByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int deleteByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pmid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    List<Permission> selectByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    Permission selectByPrimaryKey(Integer pmid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Permission record);
}