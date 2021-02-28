/*package com.alasdoo.developercourseassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.alasdoo.developercourseassignment.test.StudentTestPage;


import java.util.List;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

	@Autowired
	private StudentTestPage studentTestPage;

    @GetMapping(value = "/testStudent", produces = MediaType.APPLICATION_JSON_VALUE)
    public void testStudent() {
         studentTestPage.checkTitle();
    }


}
*/