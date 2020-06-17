package com.it.dao;


import com.it.domain.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeDao {

    // 查询所有账户
    @Select("select * from employee")
    public List<Employee> findAll();

    // 保存帐户信息
    /**
     *     Integer id;
     *     Integer age ;
     *     String name ;
     *     String sex;
     *     String address;
     * @param
     */
    @Insert("insert into employee (age,name , sex , address ) values (#{age},#{name},#{sex},#{address})")
    public void saveEmployee(Employee employee);


    @Delete("delete from employee where id =#{id}")
    public void delEmployee(int id);

    @Select("select * from employee where id = #{id}")
    public boolean findById(int id );

    @Update("update employee set name =#{name},age=#{age} where id = #{id}")
    public void updateEmploy(Employee employee);

}
