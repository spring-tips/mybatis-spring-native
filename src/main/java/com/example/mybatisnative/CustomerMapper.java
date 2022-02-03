package com.example.mybatisnative;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerMapper {

    @Insert("INSERT INTO customer (name, email ) VALUES(#{name}, #{email} )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Customer customer);

    @Select("SELECT id, name, email from customer WHERE id = #{id}")
    Customer findById(long id);


}
