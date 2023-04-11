package com.UST.InterviewScheduler.service;

import com.UST.InterviewScheduler.entity.Interview;
import com.UST.InterviewScheduler.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {
    @Autowired
    private InterviewRepository repo;
    public Interview createInterview(Interview interview) {

        return repo.save(interview);
    }



    public List<Interview> getInterviews() {
        return repo.findAll();
    }

    public Interview getInterviewByEmailid(String emailid) {
        return repo.findByEmailid(emailid);
    }
}
