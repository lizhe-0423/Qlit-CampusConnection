package com.qlit.course.service.impl;

import cn.hutool.Hutool;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.unit.DataUnit;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qlit.course.entity.Course;
import com.qlit.course.mapper.CourseMapper;
import com.qlit.course.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 年级课程表 服务实现类
 * </p>
 *
 * @author 荔枝
 * @since 2023-02-19
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Resource
    ICourseService iCourseService;

    //保存课程信息表
    public boolean saveCourse(Course course){
        if(StrUtil.isEmpty((CharSequence) course)){
            val save = iCourseService.save(course);
            return save;
        }else return false;
    }

    public List selectCourse(Course course){
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        Object start =course.getCreateTime();
        Object end = DateUtil.date(System.currentTimeMillis());
        queryWrapper.between("startDate", start, end)
                .between("endDate", start, end)
                .isNotNull(course.getCourseCollege()).isNotNull(course.getCourseClass()).isNotNull(course.getCourseGrade())

        ;
        List<Course> courses =iCourseService.list(queryWrapper);
        return courses;
    }

}
