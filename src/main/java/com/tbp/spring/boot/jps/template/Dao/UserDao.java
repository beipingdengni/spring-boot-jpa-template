package com.tbp.spring.boot.jps.template.Dao;

import com.tbp.spring.boot.jps.template.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * describe:
 *
 * @author mac 田北平
 * @date 2019/12/11 12:01
 */
@Repository
public interface UserDao extends JpaRepository<UserEntity, Long> {


    /**
     * @param id
     * @return
     */
    @Query(value = "select * from  t_user where  id=:id", nativeQuery = true)
    UserEntity queryById(@Param("id") Long id);

    /**
     * @param id
     * @return
     */
    @Modifying
    @Query(value = "delete from t_user where id=?1", nativeQuery = true)
    Integer deleteByid(Long id);
}
