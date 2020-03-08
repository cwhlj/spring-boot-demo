package com.cw.boot;

import com.cw.boot.entity.Student;
import com.cw.boot.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringBootDemoApplicationTests {
	@Autowired
	private StudentService studentService;

	@Test
	public void queryById(){
		Student student = studentService.queryById(1L);
		System.out.println(student);
	}


}
