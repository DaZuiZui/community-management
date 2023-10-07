package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestNameMapper;
import com.ruoyi.system.domain.TestName;
import com.ruoyi.system.service.ITestNameService;

/**
 * 测试用Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-07
 */
@Service
public class TestNameServiceImpl implements ITestNameService 
{
    @Autowired
    private TestNameMapper testNameMapper;

    /**
     * 查询测试用
     * 
     * @param id 测试用主键
     * @return 测试用
     */
    @Override
    public TestName selectTestNameById(Long id)
    {
        return testNameMapper.selectTestNameById(id);
    }

    /**
     * 查询测试用列表
     * 
     * @param testName 测试用
     * @return 测试用
     */
    @Override
    public List<TestName> selectTestNameList(TestName testName)
    {
        return testNameMapper.selectTestNameList(testName);
    }

    /**
     * 新增测试用
     * 
     * @param testName 测试用
     * @return 结果
     */
    @Override
    public int insertTestName(TestName testName)
    {
        testName.setCreateTime(DateUtils.getNowDate());
        return testNameMapper.insertTestName(testName);
    }

    /**
     * 修改测试用
     * 
     * @param testName 测试用
     * @return 结果
     */
    @Override
    public int updateTestName(TestName testName)
    {
        testName.setUpdateTime(DateUtils.getNowDate());
        return testNameMapper.updateTestName(testName);
    }

    /**
     * 批量删除测试用
     * 
     * @param ids 需要删除的测试用主键
     * @return 结果
     */
    @Override
    public int deleteTestNameByIds(Long[] ids)
    {
        return testNameMapper.deleteTestNameByIds(ids);
    }

    /**
     * 删除测试用信息
     * 
     * @param id 测试用主键
     * @return 结果
     */
    @Override
    public int deleteTestNameById(Long id)
    {
        return testNameMapper.deleteTestNameById(id);
    }
}
