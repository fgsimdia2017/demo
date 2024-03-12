package com.demo.dao;

import com.demo.model.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/11/16 15:14
 * @description
 * @Version 1.0
 */


@Mapper
public interface UserRepository  {
    List<UserVO> getAll();
    UserVO getOne(Long id);
    UserVO getByGoogle(String google);

    void insert(UserVO post);
    void update(UserVO post);
    void delete(Long id);
}
