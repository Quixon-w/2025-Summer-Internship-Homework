package cn.scu.edu.query;

import lombok.Data;

@Data
public class AdminQuery {
    // 分页参数
    private Integer currentPage = 1;
    private Integer pageSize = 5;

    // 计算当前页的起始下标
    public Integer getStart() {
        return (this.currentPage - 1) * this.pageSize;
    }

    // 高级查询参数
    private String username;
    private String nickname;

}
