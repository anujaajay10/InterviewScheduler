package com.UST.InterviewScheduler.controller;

import com.UST.InterviewScheduler.entity.Interview;
import com.UST.InterviewScheduler.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    public InterviewService interviewService;
    @PostMapping("/add")
    public Interview addinterview(@RequestBody Interview interview) {
        return interviewService.createInterview(interview);
    }
    @GetMapping("/interviews")
    public List<Interview> getAllInterview() {
        return interviewService.getInterviews();
    }
    @GetMapping("/interviews/{emailid}")
    public Interview getInterviewById(@PathVariable String emailid){
        return interviewService.getInterviewByEmailid(emailid);

    }



}
