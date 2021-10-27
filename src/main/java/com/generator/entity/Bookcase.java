package com.generator.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuanran
 * @since 2021-10-27
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Bookcase implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer id;

    private String name;


}
