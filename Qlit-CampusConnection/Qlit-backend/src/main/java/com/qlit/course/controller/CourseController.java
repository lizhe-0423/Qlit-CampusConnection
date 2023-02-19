package com.qlit.course.controller;


import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.StrUtil;
import com.qlit.course.entity.Course;
import com.qlit.course.service.impl.CourseServiceImpl;
import com.qlit.utils.Response;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 年级课程表 前端控制器
 * </p>
 *
 * @author 荔枝
 * @since 2023-02-19
 */
@RestController
@RequestMapping("/course")
@ResponseBody
public class CourseController {

    @Resource
    CourseServiceImpl courseService;

    @PostMapping("/save")
    public Response saveCourse(@RequestBody Course course) {

        val b = courseService.saveCourse(course);

        Response response = null;
        if (b) {
            response = new Response();
            response.setCode(HttpStatus.OK.value());
            response.setMessage("成功");
        }
        response.setCode(HttpStatus.NO_CONTENT.value());
        response.setMessage("失败 ");
        return response;

    }

    @PostMapping("/query")
    public Response queryCourse(@RequestBody Course course){
        val list = courseService.selectCourse(course);
        val b = StrUtil.isEmpty((CharSequence) list);
        Response response = null;
        if (!b){
            response = new Response();
            response.setCode(HttpStatus.OK.value());
            response.setMessage("成功");
        }
        response.setCode(HttpStatus.NO_CONTENT.value());
        response.setMessage("失败 ");
        return response;
    }


}
