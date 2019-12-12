package com.tbp.spring.boot.jps.template.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * describe:
 *
 * @author mac 田北平
 * @date 2019/12/11 12:02
 */
@Entity
@Table(name = "t_user")
@Data
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String name;

    private Byte sex;

    @Column(length = 20)
    private String phone;

    @Column(length = 200)
    private String address;

    private Integer refShopId;

}
