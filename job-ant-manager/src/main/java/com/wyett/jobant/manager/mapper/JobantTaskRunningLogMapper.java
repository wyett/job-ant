package com.wyett.jobant.manager.mapper;

import com.wyett.jobant.manager.domain.JobantTaskRunningLog;
import com.wyett.jobant.manager.domain.JobantTaskRunningLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobantTaskRunningLogMapper {
    long countByExample(JobantTaskRunningLogExample example);

    int deleteByExample(JobantTaskRunningLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobantTaskRunningLog record);

    int insertSelective(JobantTaskRunningLog record);

    List<JobantTaskRunningLog> selectByExample(JobantTaskRunningLogExample example);

    JobantTaskRunningLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobantTaskRunningLog record, @Param("example") JobantTaskRunningLogExample example);

    int updateByExample(@Param("record") JobantTaskRunningLog record, @Param("example") JobantTaskRunningLogExample example);

    int updateByPrimaryKeySelective(JobantTaskRunningLog record);

    int updateByPrimaryKey(JobantTaskRunningLog record);
}