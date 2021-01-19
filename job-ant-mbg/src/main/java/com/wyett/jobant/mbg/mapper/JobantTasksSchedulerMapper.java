package com.wyett.jobant.mbg.mapper;

import com.wyett.jobant.mbg.domain.JobantTasksScheduler;
import com.wyett.jobant.mbg.domain.JobantTasksSchedulerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobantTasksSchedulerMapper {
    long countByExample(JobantTasksSchedulerExample example);

    int deleteByExample(JobantTasksSchedulerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobantTasksScheduler record);

    int insertSelective(JobantTasksScheduler record);

    List<JobantTasksScheduler> selectByExample(JobantTasksSchedulerExample example);

    JobantTasksScheduler selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobantTasksScheduler record, @Param("example") JobantTasksSchedulerExample example);

    int updateByExample(@Param("record") JobantTasksScheduler record, @Param("example") JobantTasksSchedulerExample example);

    int updateByPrimaryKeySelective(JobantTasksScheduler record);

    int updateByPrimaryKey(JobantTasksScheduler record);
}