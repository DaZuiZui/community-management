package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TestName;

/**
 * 测试用Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-07
 */
public interface TestNameMapper 
{
    /**
     * 查询测试用
     * 
     * @param id 测试用主键
     * @return 测试用
     */
    public TestName selectTestNameById(Long id);

    /**
     * 查询测试用列表
     * 
     * @param testName 测试用
     * @return 测试用集合
     */
    public List<TestName> selectTestNameList(TestName testName);

    /**
     * 新增测试用
     * 
     * @param testName 测试用
     * @return 结果
     */
    public int insertTestName(TestName testName);

    /**
     * 修改测试用
     * 
     * @param testName 测试用
     * @return 结果
     */
    public int updateTestName(TestName testName);

    /**
     * 删除测试用
     * 
     * @param id 测试用主键
     * @return 结果
     */
    public int deleteTestNameById(Long id);

    /**
     * 批量删除测试用
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestNameByIds(Long[] ids);
}
