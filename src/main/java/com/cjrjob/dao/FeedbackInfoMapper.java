package com.cjrjob.dao;

import com.cjrjob.pojo.FeedbackInfo;

public interface FeedbackInfoMapper {
    int deleteByPrimaryKey(Integer feedbackInfoId);

    int insert(FeedbackInfo record);

    int insertSelective(FeedbackInfo record);

    FeedbackInfo selectByPrimaryKey(Integer feedbackInfoId);

    int updateByPrimaryKeySelective(FeedbackInfo record);

    int updateByPrimaryKeyWithBLOBs(FeedbackInfo record);

    int updateByPrimaryKey(FeedbackInfo record);
}