package cn.scu.edu.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
public class PageList<T> {
    private List<T> list = new ArrayList<>();
    private Integer totals = 0;
}
