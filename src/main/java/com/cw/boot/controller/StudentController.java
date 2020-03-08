package com.cw.boot.controller;

import com.cw.boot.entity.Student;
import com.cw.boot.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学生表(Student)表控制层
 *
 * @author makejava
 * @since 2020-03-08 16:08:12
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Student selectOne(Long id) {
        return this.studentService.queryById(id);
    }

}