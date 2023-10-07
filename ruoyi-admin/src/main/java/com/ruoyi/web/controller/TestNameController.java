package com.ruoyi.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TestName;
import com.ruoyi.system.service.ITestNameService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试用Controller
 * 
 * @author ruoyi
 * @date 2023-10-07
 */
@RestController
@RequestMapping("/system/name")
public class TestNameController extends BaseController
{
    @Autowired
    private ITestNameService testNameService;

    /**
     * 查询测试用列表
     */
    @PreAuthorize("@ss.hasPermi('system:name:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestName testName)
    {
        startPage();
        List<TestName> list = testNameService.selectTestNameList(testName);
        return getDataTable(list);
    }

    /**
     * 导出测试用列表
     */
    @PreAuthorize("@ss.hasPermi('system:name:export')")
    @Log(title = "测试用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestName testName)
    {
        List<TestName> list = testNameService.selectTestNameList(testName);
        ExcelUtil<TestName> util = new ExcelUtil<TestName>(TestName.class);
        util.exportExcel(response, list, "测试用数据");
    }

    /**
     * 获取测试用详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:name:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(testNameService.selectTestNameById(id));
    }

    /**
     * 新增测试用
     */
    @PreAuthorize("@ss.hasPermi('system:name:add')")
    @Log(title = "测试用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestName testName)
    {
        return toAjax(testNameService.insertTestName(testName));
    }

    /**
     * 修改测试用
     */
    @PreAuthorize("@ss.hasPermi('system:name:edit')")
    @Log(title = "测试用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestName testName)
    {
        return toAjax(testNameService.updateTestName(testName));
    }

    /**
     * 删除测试用
     */
    @PreAuthorize("@ss.hasPermi('system:name:remove')")
    @Log(title = "测试用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(testNameService.deleteTestNameByIds(ids));
    }
}
