package com.ch.pojo;


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
public class Fans implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;

    private String fan;


}
