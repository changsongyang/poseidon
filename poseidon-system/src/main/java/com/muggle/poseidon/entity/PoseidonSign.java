package com.muggle.poseidon.entity;
import com.muggle.poseidon.core.generater.PoseidonIdGener;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
*
*  @author muggle
*/

@Accessors(chain = true)
@Entity
@DynamicUpdate
@Data
@NoArgsConstructor
@Table(name = "poseidon_sign")
public class PoseidonSign implements Serializable {

    private static final long serialVersionUID = 1545995920333L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator  = "myIdStrategy")
    @GenericGenerator(name = "myIdStrategy", strategy = PoseidonIdGener.TYPE)
    private String id;

    /**
    * 登录类型
    * isNullAble:1
    */
    @NotNull
    private String authType;

    /**
    * 
    * isNullAble:1
    */
    @NotNull
    private String principal;

    /**
    * 
    * isNullAble:1
    */
    private String credentials;

    /**
    * 
    * isNullAble:1
    */
    private Integer enable;

    /**
    * 
    * isNullAble:1,defaultVal:CURRENT_TIMESTAMP
    */
    private Date createTime;

    /**
    * 
    * isNullAble:1
    */
    private Date deleteTime;

    /**
    * 
    * isNullAble:1
    */
    private Date updateTime;

    @NotNull
    private String userId;

    /**
    * 
    * isNullAble:1
    */

}
