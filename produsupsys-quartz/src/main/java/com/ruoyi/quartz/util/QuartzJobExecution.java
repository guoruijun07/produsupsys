package com.ruoyi.quartz.util;

import org.quartz.JobExecutionContext;

/**
 * 定时任务处理（允许并发执行）
 *
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, com.ruoyi.quartz.domain.SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
