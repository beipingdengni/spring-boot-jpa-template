package com.tbp.spring.boot.jps.template.service;

import com.tbp.spring.boot.jps.template.entity.UserEntity;
import com.tbp.spring.boot.jps.template.vo.UserReq;

/**
 * describe:
 *
 * @author mac 田北平
 * @date 2019/12/11 12:10
 */
public interface UserService {

    void addUser(UserReq req);

    UserEntity queryUser(Long id);

    UserEntity updateUserById(UserReq req);
}
