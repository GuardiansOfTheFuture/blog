package com.ch.pojo;


import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chen  hao
 * @since 2022-10-25
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;

    private String author;

    private String status;

    private String blogTypes;

    private Integer viewCount;

    private Date updateTime;

    private Date createTime;

    private String blogContext;


}
