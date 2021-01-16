package com.wyett.jobant.manager.mapper;

import com.wyett.jobant.manager.domain.JobantTasksTemplate;
import com.wyett.jobant.manager.domain.JobantTasksTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobantTasksTemplateMapper {
    long countByExample(JobantTasksTemplateExample example);

    int deleteByExample(JobantTasksTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JobantTasksTemplate record);

    int insertSelective(JobantTasksTemplate record);

    List<JobantTasksTemplate> selectByExample(JobantTasksTemplateExample example);

    JobantTasksTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JobantTasksTemplate record, @Param("example") JobantTasksTemplateExample example);

    int updateByExample(@Param("record") JobantTasksTemplate record, @Param("example") JobantTasksTemplateExample example);

    int updateByPrimaryKeySelective(JobantTasksTemplate record);

    int updateByPrimaryKey(JobantTasksTemplate record);
}