package com.example.demo.dao;

import com.example.demo.domain.Role;
import com.example.demo.domain.RoleExample;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.RolePermission;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer roleid);

    void deleteByRoleType(String type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    Role selectByPrimaryKey(Integer roleid);
    Role selectByRoleType(String type);

    ArrayList<Role> selectAllRole();

    ArrayList<RolePermission> selectByAboutType(String type);

    ArrayList<RolePermission> selectByRolePermission();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Role record);

    void updateByRoleId( Integer roleid,@Param("RoleType")String type);
}