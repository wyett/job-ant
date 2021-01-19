package com.wyett.jobant.mbg.mapper;

import com.wyett.jobant.mbg.domain.MailTemplate;
import com.wyett.jobant.mbg.domain.MailTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailTemplateMapper {
    long countByExample(MailTemplateExample example);

    int deleteByExample(MailTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MailTemplate record);

    int insertSelective(MailTemplate record);

    List<MailTemplate> selectByExample(MailTemplateExample example);

    MailTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MailTemplate record, @Param("example") MailTemplateExample example);

    int updateByExample(@Param("record") MailTemplate record, @Param("example") MailTemplateExample example);

    int updateByPrimaryKeySelective(MailTemplate record);

    int updateByPrimaryKey(MailTemplate record);
}