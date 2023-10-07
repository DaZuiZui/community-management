package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试用对象 test_name
 * 
 * @author ruoyi
 * @date 2023-10-07
 */
public class TestName extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 学号 */
    @Excel(name = "学号")
    private String studnetId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 逻辑删除 */
    @Excel(name = "逻辑删除")
    private String delFalg;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStudnetId(String studnetId) 
    {
        this.studnetId = studnetId;
    }

    public String getStudnetId() 
    {
        return studnetId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDelFalg(String delFalg) 
    {
        this.delFalg = delFalg;
    }

    public String getDelFalg() 
    {
        return delFalg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("studnetId", getStudnetId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("status", getStatus())
            .append("delFalg", getDelFalg())
            .toString();
    }
}
