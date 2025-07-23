package fun.kmoon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Category extends BaseEntity{

    private Long categoryId;

    private Integer type;

    private String name;

    private Integer sort;

    private Integer status;
}
