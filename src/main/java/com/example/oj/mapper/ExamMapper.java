package com.example.oj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.oj.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sjy
 * @date 2022/2/10
 **/

@Mapper
public interface ExamMapper extends BaseMapper<Exam> {


    List<SingleChoice> getRadios(@Param("radio")String[] radio);

    List<Judge> getJudges(@Param("judge")String[] judge);

    List<Fill> getFills(@Param("fill")String[] fill);

    List<Programme> getProgrammes(@Param("programme")String[] programme);

    //通过账号获取班级
    @Select("SELECT class_name FROM `sys_user` WHERE username = #{username}")
    String getClassName(String username);

    //通过班级展示信息
    @Select("SELECT a.*,b.nickname from `sys_user_exam` a INNER JOIN `sys_user` b\n" +
            "on a.username = b.username WHERE exam_id = #{examId} AND b.class_name = #{className}")
    List<OneClassExam>getSpecialUserList(String examId,String className);
}
